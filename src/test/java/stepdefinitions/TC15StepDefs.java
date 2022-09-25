package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;

public class TC15StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies that the delete button and the mark checkbox are not available")
    public void user_verifies_that_the_delete_button_and_the_mark_checkbox_are_not_available() {
        Assert.assertFalse(mainPage.deleteButton.isDisplayed());
        Assert.assertFalse(mainPage.taskList.get(0).findElement(By.tagName("input")).isDisplayed());

    }
}
