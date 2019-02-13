package au.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTagline {

    WebDriver driver;

    @Given("I lauch my testing website")
    public void lauchWebsite() {

        System.setProperty("webdriver.chrome.driver",".//driver/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://letzdotesting.com");
    }

    @When("Verify the tagline is displayed")
    public void verfyTaglineDisplay() {
        boolean isFound = driver.findElement(By.className("site-description")).isDisplayed();
        Assert.assertTrue(isFound);
    }

    @Then("Verify the tagline text")
    public void verifyTaglineText() {
        String expected = "Get ready to test";
        String actual = driver.findElement(By.className("site-description")).getText();
        Assert.assertEquals(expected, actual);
    }
}
