package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class TC14StepDefs {
    MainPage mainPage = new MainPage();

    @Then("User verifies that the counter increments correctly")
    public void user_verifies_that_the_counter_increments_correctly() {
        int counter = Integer.valueOf(mainPage.todoCounter.getText().replaceAll("[^0-9]", ""));
        Assert.assertEquals(mainPage.taskList.size(), counter);
    }

}
