package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;

public class TC06StepDefs {
    MainPage mainPage = new MainPage();
    public String addedTaskText;


    @When("User clicks the checkbox of the task")
    public void user_clicks_the_checkbox_of_the_task() {
        addedTaskText = mainPage.taskList.get(0).getText();
        mainPage.taskList.get(0).findElement(By.tagName("input")).click();
    }

    @Then("User verifies the task has been marked as completed")
    public void userVerifiesTheTaskHasBeenMarkedAsCompleted() {
        Assert.assertEquals(addedTaskText, mainPage.completedTaskList.get(0).getText());

    }
}
