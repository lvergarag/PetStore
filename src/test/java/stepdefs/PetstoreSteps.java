package stepdefs; // Línea 1

import io.cucumber.java.After; // ESTE ES EL QUE FALTA AHORA
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.ProductPage;

public class PetstoreSteps {

    private WebDriver driver;
    private HomePage home;
    private ProductPage product;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        home = new HomePage(driver);
        driver.manage().window().maximize();
        product = new ProductPage(driver);
    }

    @Given("User navigates to Petstore homepage")
    public void open_home() {
        home.open();
    }

    @When("User clicks on Fish")
    public void click_on_Fish() {
        home.clickFish();
    }

    @When("User clicks on Dogs")
    public void click_on_Dogs() {
        home.clickDogs();
    }

    @When("User clicks on Cats")
    public void click_on_Cats() {
        home.clickCats();
    }

    @When("User clicks on Reptiles")
    public void click_on_Reptiles() {
        home.clickReptiles();
    }

    @When("User clicks on Birds")
    public void click_on_Birds() {
        home.clickBirds();
    }

    @Then("Product code text should be {string}")
    public void product_code_text_should_be(String expectedText) throws InterruptedException{ // Cambia 'string' por 'expectedText'
        String actualText = product.getProductText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(3000);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}