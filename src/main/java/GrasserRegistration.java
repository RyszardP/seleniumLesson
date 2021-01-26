import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class GrasserRegistration {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://grasser.ru/auth/?register=yes");
        webDriver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div/div[3]/div/div[2]/div/a")).click();
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/h1"));

        Date dateNow = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("y-MM-dd hh-mm-ss");
        String fileName = timeFormat.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\IT\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
