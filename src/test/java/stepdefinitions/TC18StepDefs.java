package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC18StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies Clear Complete button is not visible")
    public void user_verifies_clear_complete_button_is_not_visible() {
        Assert.assertFalse(mainPage.clearCompletedButton.isDisplayed());
    }

}
