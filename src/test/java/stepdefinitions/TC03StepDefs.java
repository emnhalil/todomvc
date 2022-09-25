package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC03StepDefs {
    TC02StepDefs tc02StepDefs = new TC02StepDefs();
    MainPage mainPage = new MainPage();

    @Then("User verifies that the text of the added task is the same as the one entered")
    public void user_verifies_that_the_text_of_the_added_task_is_the_same_as_the_one_entered() {
        Assert.assertEquals(tc02StepDefs.task1, mainPage.taskList.get(0).getText());

    }
}
