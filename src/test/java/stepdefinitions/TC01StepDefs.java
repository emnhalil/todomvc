package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.time.Duration;

public class TC01StepDefs {
    WebDriver driver = Driver.getDriver();

    @Given("User starts the Chrome Browser")
    public void user_starts_the_chrome_browser() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Given("User goes to the webpage {string}")
    public void user_goes_to_the_webpage(String webpage) {
        driver.get(webpage);
    }


    @Then("User verifies successfully landing to the page")
    public void user_verifies_successfully_landing_to_the_page() {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("TodoMVC"));

    }

    @And("User closes the browser")
    public void userClosesTheBrowser() {
        driver.quit();
    }
}
