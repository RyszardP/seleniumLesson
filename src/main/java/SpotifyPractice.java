import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SpotifyPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://accounts.spotify.com/ru/login?");
        webDriver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("Vasya@mail.com");
        webDriver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("null");
        webDriver.findElement(By.xpath("//*[@id='login-button']")).click();
        webDriver.findElement(By.xpath("//span[@class='ng-binding ng-scope' and string-length(text())>0]")).isDisplayed();

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
