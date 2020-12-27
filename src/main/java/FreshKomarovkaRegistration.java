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


public class FreshKomarovkaRegistration {
    public static void main(String[] args) {

        final String URL = "https://freshkomarovka.by/auth/registration/?register=yes&backurl=/company/";

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//*[@id='input_NAME']")).sendKeys("null");
        webDriver.findElement(By.xpath("//*[@id='input_EMAIL']")).sendKeys("null@null");
        webDriver.findElement(By.xpath("//*[@id='input_PERSONAL_PHONE']")).sendKeys("345678998");
        webDriver.findElement(By.xpath("//*[@id='input_PASSWORD']")).sendKeys("666666");
        webDriver.findElement(By.xpath("//*[@id='input_CONFIRM_PASSWORD']")).sendKeys("666666");

        Date dateNow = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("y-MM-dd hh-mm-ss");
        String fileName = "Komarovka register " + timeFormat.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\IT\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        webDriver.quit();

    }
}
