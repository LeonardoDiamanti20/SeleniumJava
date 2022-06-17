package SeleniumP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Alert1 {

    @Test

    public void alert () throws InterruptedException, IOException {

        FileInputStream fis = new FileInputStream("C:/Users/Asus/IdeaProjects/New/Exercise/config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(prop.getProperty("URLAD"));
        driver.manage().window().maximize();

        driver.findElement(By.id("alertBox")).click();

        Alert alert = driver.switchTo().alert();
        String AlertMessage = driver.switchTo().alert().getText();
        System.out.println(AlertMessage);
        Thread.sleep(2000);
        alert.dismiss();


    }






}
