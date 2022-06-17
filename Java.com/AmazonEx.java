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
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AmazonEx  extends Dashboard {
        WebDriver driver;


    @BeforeTest

    public void setup () {

        System.out.println("My browser has been launched");

    }

    @Test



    public void Amazon() throws InterruptedException, IOException {

        //instantiated driver object.
        FileInputStream fis = new FileInputStream("C:/Users/Asus/IdeaProjects/New/Exercise/config.properties");
        Properties prop = new Properties();
        prop.load(fis);


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prop.getProperty("URLAZ"));
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //close cookies popup.
        Dashboard.Amazoncookie(driver).click();
        //System.out.println("Popup chiuso");


        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-accountList")).click();

        driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).clear();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


        Dashboard.Amazoncookie(driver).click();

        //Select the books category.
        WebElement category = driver.findElement(By.id("searchDropdownBox"));
        category.click();
        Select selectcat = new Select(category);
        selectcat.selectByVisibleText("Libri");
        Thread.sleep(1000);
        //System.out.println("Categoria selezionata");


        //write on search text box.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //System.out.println("Nome argomento scritto");

        //find and open the right book.
        driver.findElement(By.xpath("//*[text()='Selenium with Java – A Beginner’s Guide: Web Browser Automation for Testing using Selenium with Java (English Edition)']")).click();
        Thread.sleep(1000);
        //System.out.println("Libro scelto");

        //add to cart.
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
        //System.out.println("Libro aggiunto al carrello");

        //go to cart.
        driver.findElement(By.id("sw-gtc")).click();
        System.out.println("DONE");




    }

    @AfterTest

    public void teardown () {

        System.out.println("My test case pass succesfully");
        driver.quit();

    }


}
