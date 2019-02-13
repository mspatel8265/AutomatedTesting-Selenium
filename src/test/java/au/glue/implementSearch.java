package au.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implementSearch {

    public static WebDriver driver;

    @Given("I launch the testing website")
    public void launchSite() {

        // Providing the location of the webdriver, here chrome because we are using chrome
        System.setProperty("webdriver.chrome.driver",".//driver/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://letzdotesting.com");
    }

    @When("Enter Cucumber in the Search box")
    public void searchCucumber() {
        driver.findElement(By.name("s")).sendKeys("Cucumber");
    }

    @Then("Verify the search result shows Cucumber")
    public void verifyCucumber() {
        String expected = "Cucumber";
        String actual = driver.findElement(By.name("s")).getAttribute("value");
        Assert.assertEquals(expected, actual);
    }
}
