package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepDefinition {
    WebDriver driver;

    @Given("^user navigate to the application url$")
    public void user_navigate_to_the_application_url() {
        System.setProperty("webdriver.chrome.driver", "D:\\testignsoftwares\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.flipkart.com/");
    }

  /*  @When("title of login page is {string}")
    public void titleOfLoginPageIs(String title) {
        title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!");

    }*/

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String mobileno, String password) {
        driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys(mobileno);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }

    @Then("user clicks on login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit'][@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    }

    @And("user is on home page")
    public void userIsOnHomePage() {
        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);
        driver.close();
    }
}

