package Java.com;

import PageObjectModel.Dashboard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class First_Class  {


    @Test

    public void First () throws InterruptedException, IOException {

        FileInputStream fis = new FileInputStream("C:/Users/Asus/IdeaProjects/New/Exercise/config.properties");
        Properties prop = new Properties();
        prop.load(fis);



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();

        WebElement popup = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        popup.click();

        //WebElement mymail = driver.findElement(By.id("email"));

        // driver.quit();
        System.out.println("Task passed");

        //driver.findElement(By.name("firstname")).sendKeys("Leonardo");
        //driver.findElement(By.name("lastname")).sendKeys("Diamanti");
       // driver.findElement(By.name("reg_email__")).sendKeys("leodiamant@gmail.com");
        driver.findElement(By.name("firstname")).sendKeys(prop.getProperty("nome"));
        driver.findElement(By.name("lastname")).sendKeys(prop.getProperty("cognome"));
        driver.findElement(By.name("reg_email__")).sendKeys(prop.getProperty("email"));


        Thread.sleep(2000);


        //select birth date on dropdown box
        driver.findElement(By.id("day")).click();
        driver.findElement(By.xpath("//*[text()='6']")).click();

        driver.findElement(By.id("month")).click();
        driver.findElement(By.xpath("//*[text()='Sep']")).click();

        driver.findElement(By.id("year")).click();
        driver.findElement(By.xpath("//*[text()='1934']")).click();

        Thread.sleep(2000);

       WebElement giorno = driver.findElement(By.id("day"));
       Select selectday = new Select(giorno);
       selectday.selectByIndex(1);


       WebElement mese = driver.findElement(By.id("month"));
       Select selectmonth = new Select(mese);
       selectmonth.selectByVisibleText("Jul");

       WebElement anno = driver.findElement(By.id("year"));
       Select selectyear = new Select(anno);
       selectyear.selectByValue("1996");






       /*driver.navigate().to("https://www.amazon.it/");
       Thread.sleep(2000);
       driver.navigate().back();*/



        Thread.sleep(10000);
        //driver.close();








    }

    @AfterTest

    public void teardrop () {

        System.out.println("Finish");
    }


}
