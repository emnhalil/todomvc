package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.Driver;

public class TC04StepDefs {
    Actions action = new Actions(Driver.getDriver());
    MainPage mainPage = new MainPage();
    String editedTask = "Edited task";
    public int length = mainPage.taskList.get(0).getText().length();


    @When("User double clicks on task label")
    public void user_double_clicks_on_task_label() {
        action.doubleClick(mainPage.taskList.get(0)).perform();
    }

    @When("User edits the task")
    public void user_edits_the_task() {

        for (int i = 0; i < length + 1; i++) {
            mainPage.editedTaskField.sendKeys(Keys.BACK_SPACE);
        }
        mainPage.editedTaskField.sendKeys(editedTask + Keys.ENTER);
    }

    @Then("User verifies that the task is edited")
    public void user_verifies_that_the_task_is_edited() {
        Assert.assertEquals(editedTask, mainPage.taskList.get(0).getText());

    }

}
