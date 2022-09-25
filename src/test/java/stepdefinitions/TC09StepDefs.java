package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;

public class TC09StepDefs {
    MainPage mainPage = new MainPage();
    TC02StepDefs tc02StepDefs = new TC02StepDefs();


    @Then("User should be able to see the task on the Active list")
    public void user_should_be_able_to_see_the_task_on_the_active_list() {
        mainPage.activeListLink.click();
        Assert.assertEquals(tc02StepDefs.task1, mainPage.taskList.get(0).getText());

    }

    @And("User clicks the checkbox again of the task")
    public void userClicksTheCheckboxAgainOfTheTask() {
        mainPage.completedTaskList.get(0).findElement(By.tagName("input")).click();

    }
}
