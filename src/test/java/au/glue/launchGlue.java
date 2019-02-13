package au.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchGlue {
    public static WebDriver driver;

    @Given("I launch my website")
    public void launch(){
        System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver/chromedriver"); // saying where the web brower driver is located
       driver = new ChromeDriver();  // Initialize the object of webdriver
       // driver.get("http://letzdotesting.com");
        driver.navigate().to("http://letzdotesting.com");
    }

    @When("I click Aboutme")
    public void clickAboutMe(){
        driver.findElement(By.id("menu-item-13")).click();
    }

    @Then("I should be on AboutMe page")
    public void beOnAboutMe() {
        String expected = "http://letzdotesting.com/shobika-ramasubbarayalu/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }

}

