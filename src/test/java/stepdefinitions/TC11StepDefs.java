package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class TC11StepDefs {
    MainPage mainPage = new MainPage();
    List<String> listBeforeClearing = new ArrayList<>();

    @When("User marks all tasks as completed")
    public void user_marks_all_tasks_as_completed() {
        for (WebElement w : mainPage.taskList) {
            listBeforeClearing.add(w.getText());
        }
        mainPage.markAllCompletedToggle.click();
    }

    @When("User clicks the toggle to mark all items")
    public void user_clicks_the_toggle_to_mark_all_items() {
        mainPage.markAllCompletedToggle.click();
    }

    @Then("User verifies that all tasks are moved back to Active")
    public void user_verifies_that_all_tasks_are_moved_back_to_active() {
        mainPage.activeListLink.click();
        List listAfterClearing = new ArrayList();
        for (WebElement w : mainPage.taskList) {
            listAfterClearing.add(w.getText());
        }
        Assert.assertEquals(listBeforeClearing, listAfterClearing);
    }

}
