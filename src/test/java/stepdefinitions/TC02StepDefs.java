package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MainPage;

public class TC02StepDefs {
    MainPage mainPage = new MainPage();
    public String task1 = "task 1";

    @When("User types a task and presses Enter")
    public void user_types_a_task_and_presses_enter() {
        mainPage.todoField.sendKeys(task1 + Keys.ENTER);
    }

    @Then("User verifies that the task is successfully added to the active task list")
    public void user_verifies_that_the_task_is_successfully_added_to_the_active_task_list() {
        Assert.assertTrue(mainPage.taskList.size() > 0);
    }

}
