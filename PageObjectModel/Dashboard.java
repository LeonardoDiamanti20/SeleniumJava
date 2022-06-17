package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Dashboard {
    private static WebElement element = null;

    public static WebElement cookies(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
        return element;

    }


    public static WebElement popup (WebDriver driver){

       element= driver.findElement(By.xpath("//*[text()='Change to English']"));


        return element;
    }

    public static WebElement Amazoncookie (WebDriver driver){

        element= driver.findElement(By.id("sp-cc-accept"));


        return element;
    }












}