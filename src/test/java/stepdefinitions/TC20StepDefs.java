package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC20StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies that the input box is cleared")
    public void user_verifies_that_the_input_box_is_cleared() {
        Assert.assertTrue(mainPage.todoField.getAttribute("value").isBlank());
    }

}
