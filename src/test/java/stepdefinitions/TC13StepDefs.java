package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC13StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies that the Completed list is empty")
    public void user_verifies_that_the_completed_list_is_empty() {
        Assert.assertTrue(mainPage.completedTaskList.isEmpty());

    }

}
