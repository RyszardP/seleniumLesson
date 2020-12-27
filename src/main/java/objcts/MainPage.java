package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By catalogButton = By.xpath("//*[@id='s54']");

    public PriceCatalog clickOnCatalog() {
        driver.findElement(catalogButton).click();
        return new PriceCatalog(driver);
    }

    public PriceCatalog open(){
        this.clickOnCatalog();
        return new PriceCatalog(driver);
    }


}
