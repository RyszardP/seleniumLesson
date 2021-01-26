package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

    private WebDriver webDriver;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By loginField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div[2]/input");
    private By passwordField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div[2]/input");
    private By submitButton = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div[1]/input");
    private By title = By.xpath("//*[@id='title']");
    private By error = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/p");
    private By createAccountLink = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/form/noindex/div[1]/label/a/strong");



    public LoginPage typeLogin(String username) {
        webDriver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        webDriver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage loginWithIncorrectCreds(String username, String password){
        this.typeLogin(username);
        this.typePassword(password);
        webDriver.findElement(submitButton).click();
        return new LoginPage(webDriver);
    }

    public String getTitleText(){
        return webDriver.findElement(title).getText();
    }

    public String getErrorText(){
        return webDriver.findElement(error).getText();
    }

    public RegPage createAccount(){
        webDriver.findElement(createAccountLink).click();
        return new RegPage(webDriver);
    }

}
