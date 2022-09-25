package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC19StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies Clear Complete button is visible")
    public void user_verifies_clear_complete_button_is_visible() {
        Assert.assertTrue(mainPage.clearCompletedButton.isDisplayed());

    }

}
