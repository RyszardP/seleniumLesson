import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPage {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0" +
                "%A1%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C_%D1%83%D1%87%D1%91%D1%82%D0%BD%D1%83%D1%8E_" +
                "%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C&returnto=%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F+" +
                "%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        webDriver.findElement(By.xpath("//*[@id='wpName2']")).sendKeys("name");
        webDriver.findElement(By.xpath("//*[@id='wpPassword2']")).sendKeys("asdf");
        webDriver.findElement(By.xpath("//*[@id='wpRetype']")).sendKeys("asdf");
        webDriver.findElement(By.xpath("//*[@id='wpEmail']")).sendKeys("example@example.com");



    }
}
