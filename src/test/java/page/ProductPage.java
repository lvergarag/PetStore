
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    private By productTitle = By.xpath("//h2");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).getText();
    }

}
