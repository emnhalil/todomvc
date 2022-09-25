package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class TC12StepDefs {
    MainPage mainPage = new MainPage();

    @When("User clicks the Active Link to move to the Active tasks list")
    public void user_clicks_the_active_link_to_move_to_the_active_tasks_list() {
        mainPage.activeListLink.click();
    }

    @Then("User verifies that the Active list is empty")
    public void user_verifies_that_the_active_list_is_empty() {
        Assert.assertTrue(mainPage.taskList.isEmpty());
    }

}
