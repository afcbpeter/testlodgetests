package com.testlodge.test.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by peterki on 12/06/2017.
 */
public class exampleStepDefs {

    private WebDriver driver;

    @Before
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        this.driver = new ChromeDriver(ChromeDriverService.createDefaultService());
        driver.manage().window().maximize();
        driver.get("https://www.testlodge.com/");
    }

    @After
    public void tearDownDriver() {
        driver.quit();
    }

    @Given("^I navigate to the testlodge site$")
    public void i_navigate_to_the_testlodge_site() throws Throwable {

    }

    @When("^I select blogs$")
    public void i_select_blogs() throws Throwable {
        driver.findElement(By.id("util_links")).click();
    }

    @Then("^I will see a list of blogs on the blog page$")
    public void i_will_see_a_list_of_blogs_on_the_blog_page() throws Throwable {

        System.out.printf("RESULT ---" + driver.findElement(By.cssSelector("#util_links")).getText());

        assertTrue(driver.findElement(By.cssSelector("#util_links")).getText().contains("Blog"));
    }


}
