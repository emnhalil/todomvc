package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC08StepDefs {
    MainPage mainPage = new MainPage();
    TC02StepDefs tc02StepDefs = new TC02StepDefs();

    @Then("User should be able to see the task on the list")
    public void user_should_be_able_to_see_the_task_on_the_list() {
        Assert.assertEquals(tc02StepDefs.task1, mainPage.completedTaskList.get(0).getText());

    }

}
