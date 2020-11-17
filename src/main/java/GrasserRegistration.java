import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GrasserRegistration {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://grasser.ru/auth/?register=yes");
        webDriver.findElement(By.xpath("//*[@id='processing']")).click();

        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\IT\\screenshots\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        webDriver.quit();
    }
}
