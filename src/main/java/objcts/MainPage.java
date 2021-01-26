package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By catalogButton = By.xpath("//*[@id='s54']");
    private By loginButton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/a[2]/span");
    private By loginField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div[2]/input");
    private By passwordField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div[2]/input");

       public PriceCatalog clickOnCatalog() {
        driver.findElement(catalogButton).click();
        return new PriceCatalog(driver);
    }

    public PriceCatalog open() {
        this.clickOnCatalog();
        return new PriceCatalog(driver);
    }

    public LoginPage clickOnLoginPage() {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public LoginPage openLoginPage() {
        this.clickOnLoginPage();
        return new LoginPage(driver);
    }
    
}
