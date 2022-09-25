package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class TC07StepDefs {
    MainPage mainPage = new MainPage();

    @When("User clicks the Completed Link to move to the Completed page")
    public void user_clicks_the_completed_link_to_move_to_the_completed_page() {

        mainPage.completedListLink.click();
    }

    @When("User clicks the Clear completed button")
    public void user_clicks_the_clear_completed_button() {
        mainPage.clearCompletedButton.click();
    }

    @Then("User verifies the completed task is removed")
    public void user_verifies_the_completed_task_is_removed() {
        Assert.assertTrue(mainPage.completedTaskList.isEmpty());
    }

}
