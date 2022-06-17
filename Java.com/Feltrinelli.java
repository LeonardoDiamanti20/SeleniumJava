package Java.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feltrinelli {

    @Test

    public void FeltrinelliEx() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lafeltrinelli.it/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //WebElement cookie =
          driver.findElement(By.xpath("//*[text()='Accetto i cookie']")).click();
        //cookie.click();



    }

}
