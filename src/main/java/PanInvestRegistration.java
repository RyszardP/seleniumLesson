import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PanInvestRegistration {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        final String URL = "https://pan-invest.com/login/reg.php";

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get(URL);
        WebElement buttonRegister = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/div/form/div[12]/div[1]/input"));
        buttonRegister.click();

        Date dateNow = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("y-MM-dd hh-mm-ss");
        String fileName = "Pan Invest registration " + timeFormat.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\IT\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        webDriver.quit();
    }
}
