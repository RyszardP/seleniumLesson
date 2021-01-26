package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {

    private WebDriver driver;

    WebDriver webDriver;

    public RegPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

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
    private By registerButton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div[1]/a[3]/span");

    public RegPage typeName(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public RegPage typeSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
        return this;
    }

    public RegPage typeCountry(String country) {
        driver.findElement(countryField).sendKeys(country);
        return this;
    }

    public RegPage typeCity(String city) {
        driver.findElement(cityField).sendKeys(city);
        return this;
    }

    public RegPage typeCompany(String company) {
        driver.findElement(companyField).sendKeys(company);
        return this;
    }

    public RegPage typePhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public RegPage typeNewLogin(String login) {
        driver.findElement(newLoginField).sendKeys(login);
        return this;
    }

    public RegPage typeNewPassword(String password) {
        driver.findElement(newPasswordField).sendKeys(password);
        return this;
    }

    public RegPage typeNewPasswordConfirm(String password){
        driver.findElement(confirmPasswordField).sendKeys(password);
        return this;
    }

    public RegPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegPage clickOnRegister() {
        driver.findElement(registerButton).click();
        return new RegPage(driver);
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
