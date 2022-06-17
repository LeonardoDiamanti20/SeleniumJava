package SeleniumP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {

    WebElement element;

    @Test

    public void edureka () throws AWTException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Courses")).click();
        Robot robot = new Robot();
        Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_DOWN);
        //read.sleep(2000);
       //obot.keyPress(KeyEvent.VK_DOWN);
       //hread.sleep(2000);
       //obot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_UP);
        //read.sleep(2000);
       //obot.keyPress(KeyEvent.VK_UP);
       //hread.sleep(2000);
       //obot.keyPress(KeyEvent.VK_UP);

        robot.mouseMove(100,200);


    }

    @Test




    public void ActionTo () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationtalks.com/");
        driver.manage().window().maximize();

        element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        element.sendKeys("Selenium");
        element.click();

        Actions azione = new Actions(driver);
        azione.sendKeys(Keys.ENTER).build().perform();


    }

    @Test

    public void AssertTest () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationtalks.com/");
        driver.manage().window().maximize();

        String MyTitle = driver.getTitle();
        System.out.println(MyTitle+" The name of the title");
        System.out.println("  ");
        String ExpectedTitle = "AutomationTalks - Learn Automation Testing";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle);

       /* int a = 5;
        int b = 5;
        Assert.assertEquals(a,b);*/



    }
}
