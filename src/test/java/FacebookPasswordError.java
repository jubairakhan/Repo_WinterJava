import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//Scenario #2
//1. Launch "https://www.facebook.com"
//2. Enter "abcd@test.com" as Email
//3. Enter "test1234" as Password
//4. Click on "Log In" button
//5. Verify user gets "The password that you've entered is incorrect" message.

public class FacebookPasswordError {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("bcd@test.com");
    }
}