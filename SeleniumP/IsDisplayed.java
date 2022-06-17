package SeleniumP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://api.freecrm.com/register/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        boolean SignUpButton = driver.findElement(By.name("action")).isDisplayed();
        System.out.println(SignUpButton);


        boolean SignUpButton2 = driver.findElement(By.name("action")).isEnabled();
        System.out.println(SignUpButton2);

        driver.findElement(By.id("terms")).click();

       boolean CheckTerms = driver.findElement(By.id("terms")).isSelected();
        System.out.println(CheckTerms);

    }
}
