package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.Driver;

public class TC05StepDefs {
    MainPage mainPage = new MainPage();
    static int oldListSize;
    Actions action = new Actions(Driver.getDriver());

    @When("User clicks on Delete button")
    public void user_clicks_on_delete_button() {
        oldListSize = mainPage.taskList.size();
        action.moveToElement(mainPage.taskList.get(0)).perform();
        mainPage.deleteButton.click();
    }

    @Then("User verifies that the task is successfully deleted")
    public void user_verifies_that_the_task_is_successfully_deleted() {
        Assert.assertEquals(oldListSize - 1, mainPage.taskList.size());

    }

}
