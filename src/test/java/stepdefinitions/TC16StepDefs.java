package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.Driver;

public class TC16StepDefs {
    Actions action = new Actions(Driver.getDriver());
    MainPage mainPage = new MainPage();
    static String originalText;

    @When("User makes a change on the text")
    public void user_makes_a_change_on_the_text() {
        originalText = mainPage.taskList.get(0).getText();
        action.doubleClick(mainPage.taskList.get(0)).perform();
        mainPage.editedTaskField.sendKeys("12345");
    }

    @When("User presses esc button to cancel the change")
    public void user_presses_esc_button_to_cancel_the_change() {
        mainPage.editedTaskField.sendKeys(Keys.ESCAPE);

    }

    @Then("User verifies that no change is made")
    public void user_verifies_that_no_change_is_made() {
        Assert.assertEquals(originalText, mainPage.taskList.get(0).getText());
    }

}
