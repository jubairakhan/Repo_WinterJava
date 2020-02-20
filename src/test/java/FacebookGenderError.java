import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
//@channel Test Scenarios: Verify gender error message
//1. Enter Firstname as "test"
//2. Enter Lastname as "test"
//3. Enter phonenumber as "8883338888"
//4. Enter new password as "whatever"
//5. Click on Sign Up button
//6. Assertion: Verify error message "Please choose a gender. You can change who can see this later."

public class FacebookGenderError {
    public static void main(String[]args){

            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            driver.get("https://www.facebook.com/");
            driver.findElement(By.name("firstname")).sendKeys("test");
            driver.findElement(By.name("lastname")).sendKeys("test");
            driver.findElement(By.name("reg_email__")).sendKeys("8883338888");
            driver.findElement(By.name("reg_passwd__")).sendKeys("newPassword");
            driver.findElement(By.name("websubmit")).click();
            WebElement errorMessage= driver.findElement(By.id("js_y"));
            String expectedResult= "Please choose a gender. You can change who can see this later.";
            System.out.println("expected result is:" + expectedResult);
            Assert.assertEquals(errorMessage,expectedResult);
    }

}
