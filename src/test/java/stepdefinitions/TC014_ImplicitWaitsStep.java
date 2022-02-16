package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC014_ImplicitWaitsStep {
    WebDriver driver;
    String url = "https://www.booking.com/index.en-gb.html?label=gen173nr-1DCAEoggI46AdIM1gEaFCIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4Apmhs5AGwAIB0gIkYzBiMjMzNzktZjQzZC00OGQ0LTk3YTAtOTE1YTdiMzEwODg12AIE4AIB;sid=553d5718fbca361785e38d718cb65700;keep_landing=1&sb_price_type=total&";

    @Given("I have supplied the correct setup to add an implicit wait")
    public void i_have_supplied_the_correct_setup_to_add_an_implicit_wait(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/charlie.gilliland/Documents/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Implicit waits can be set with the following syntax
        // The method takes a Duration object, which can be of any unit of time from nanoseconds to days
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("I navigate to the web page for TC014")
    public void i_have_navigated_to_the_web_page_for_tc014(){
        // This will load the web page but not all elements will be visible once the page is loaded
        driver.get(url);
    }

    @Then("The driver will implicitly wait before the test fails")
    public void the_driver_will_implicitly_wait_before_the_test_fails(){
        // This pop-up will take longer to display on the screen
        // As we have specified an implicit wait, selenium will wait the given amount of time before it fails this step
        // To test, comment out line 23 and re-run the test
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }


}
