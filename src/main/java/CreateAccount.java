import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CreateAccount {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia");
        webDriver.findElement(By.xpath("//*[@id='wpName2']")).sendKeys("name");
        webDriver.findElement(By.xpath("//*[@id='wpPassword2']")).sendKeys("asdf");
        webDriver.findElement(By.xpath("//*[@id='wpRetype']")).sendKeys("asdf");
        webDriver.findElement(By.xpath("//*[@id='wpEmail']")).sendKeys("example@example.com");
        webDriver.findElement(By.xpath("//*[@id='mw-input-captchaWord']")).sendKeys("capcha");

        WebElement link = webDriver.findElement(By.xpath("//li[@id='n-mainpage-description']/a"));
        System.out.println(link.getText());
        link.click();
    }
}
