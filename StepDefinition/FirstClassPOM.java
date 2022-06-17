package StepDefinition;

import PageObjectModel.Dashboard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FirstClassPOM extends Dashboard {

    @Test


    public void DB () throws InterruptedException, IOException {

        FileInputStream fis = new FileInputStream("C:/Users/Asus/IdeaProjects/New/Exercise/config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(prop.getProperty("URLTI"));
        driver.manage().window().maximize();

        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Dashboard.cookies(driver).click();
            Thread.sleep(2000);

            Dashboard.popup(driver).click();

        //driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
            //driver.findElement(By.id("onetrust-accept-btn-handler")).click();



        //WebElement CityStart =
        driver.findElement(By.id("departure")).sendKeys("Rome");
        //CityStart.click();
        //Select selectcity = new Select(CityStart);
        //selectcity.selectByVisibleText("Venice");

        Thread.sleep(500);
        driver.findElement(By.id("arrival")).sendKeys("Florence");

        driver.findElement(By.id("date-picker-outward-trigger")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("6-24")).click();



       /* WebElement ora = driver.findElement(By.className("timer-picker"));
        ora.click();
        Select selectOra = new Select(ora);
        selectOra.selectByValue("22:00"); */





    }


}
