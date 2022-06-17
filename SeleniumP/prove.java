package SeleniumP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prove {

    @Test

    public void Sergio () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("cookieChoiceDismiss")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("B"));
        Actions azione = new Actions(driver);
        azione.clickAndHold().perform();

        Thread.sleep(2000);


        WebElement B = driver.findElement(By.name("B"));
        WebElement A = driver.findElement(By.name("A"));
        WebElement I = driver.findElement(By.name("I"));
        WebElement D = driver.findElement(By.name("D"));

        azione.dragAndDrop(B,A).build().perform();
        Thread.sleep(2000);
        azione.dragAndDrop(I,D).build().perform();
        //azione.keyDown(Keys.CONTROL);
        driver.findElement(By.id("GESù")).click();





    }


}
