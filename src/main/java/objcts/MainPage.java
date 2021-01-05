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
    private By registerButton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/a[3]/span");

    private By nameField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/input");
    private By surnameField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[2]/div[2]/input");
    private By countryField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input");
    private By cityField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[4]/div[2]/input");
    private By companyField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/input");
    private By phoneField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/input");
    private By newLoginField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[8]/div[2]/input");
    private By newPasswordField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[9]/div[2]/input");
    private By confirmPasswordField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[10]/div[2]/input");
    private By emailField = By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[11]/div[2]/input");

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

    public RegPage clickOnRegister() {
        driver.findElement(registerButton).click();
        return new RegPage(driver);
    }

    public MainPage typeLogin(String login) {
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage typeName(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public MainPage typeSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
        return this;
    }

    public MainPage typeCountry(String country) {
        driver.findElement(countryField).sendKeys(country);
        return this;
    }

    public MainPage typeCity(String city) {
        driver.findElement(cityField).sendKeys(city);
        return this;
    }

    public MainPage typeCompany(String company) {
        driver.findElement(companyField).sendKeys(company);
        return this;
    }

    public MainPage typePhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public MainPage typeNewLogin(String login) {
        driver.findElement(newLoginField).sendKeys(login);
        return this;
    }

    public MainPage typeNewPassword(String password) {
        driver.findElement(newPasswordField).sendKeys(password);
        return this;
    }

    public MainPage typeNewPasswordConfirm(String password){
        driver.findElement(confirmPasswordField).sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegPage register(String name, String surname, String country, String city, String company, String phone,
                            String login, String password, String confirmPassword, String email) {
        this.typeName(name);
        this.typeSurname(surname);
        this.typeCountry(country);
        this.typeCity(city);
        this.typeCompany(company);
        this.typePhone(phone);
        this.typeNewLogin(login);
        this.typeNewPassword(password);
        this.typeNewPasswordConfirm(confirmPassword);
        this.typeEmail(email);
        this.clickOnRegister();
        return new RegPage(driver);
    }


}
