
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    // Declaración de variables con su IDENTIFICADOR (nombre)
    private By fishLink = By.xpath("//img[@src='../images/fish_icon.gif']");
    private By dogsLink = By.xpath("//img[@src='../images/dogs_icon.gif']");
    private By catsLink = By.xpath("//img[@src='../images/cats_icon.gif']");
    private By reptilesLink = By.xpath("//img[@src='../images/reptiles_icon.gif']");
    private By birdsLink = By.xpath("//img[@src='../images/birds_icon.gif']");

    // Métodos corregidos usando los nombres de arriba
    public void clickFish() {
        wait.until(ExpectedConditions.elementToBeClickable(fishLink)).click();
    }
    public void clickDogs() {
        wait.until(ExpectedConditions.elementToBeClickable(dogsLink)).click();
    }
    public void clickCats() {
        wait.until(ExpectedConditions.elementToBeClickable(catsLink)).click();
    }
    public void clickReptiles() {
        wait.until(ExpectedConditions.elementToBeClickable(reptilesLink)).click();
    }
    public void clickBirds() {
        wait.until(ExpectedConditions.elementToBeClickable(birdsLink)).click();
    }

    public HomePage(WebDriver driver) { super(driver); }

    public void open() {
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
    }
}