package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class TC10StepDefs {
    MainPage mainPage = new MainPage();
    List<String> listBeforeClearing = new ArrayList<>();

    @When("User enters multiple tasks")
    public void user_enters_multiple_tasks() {
        for (int i = 0; i < 10; i++) {
            mainPage.todoField.sendKeys("task" + i + Keys.ENTER);

        }

    }

    @When("User clicks the checkbox of {int}  tasks")
    public void user_clicks_the_checkbox_of_tasks(Integer int1) {
        for (int i = 0; i < int1; i++) {
            mainPage.taskList.get(i).findElement(By.tagName("input")).click();
        }

        for (WebElement w : mainPage.taskList) {
            listBeforeClearing.add(w.getText());
        }

    }

    @Then("User verifies that only the completed tasks is removed")
    public void user_verifies_that_only_the_completed_tasks_is_removed() {
        mainPage.activeListLink.click();
        List listAfterClearing = new ArrayList();
        for (WebElement w : mainPage.taskList) {
            listAfterClearing.add(w.getText());
        }
        Assert.assertEquals(listBeforeClearing, listAfterClearing);
    }

}
