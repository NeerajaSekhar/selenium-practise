import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LaunchChromeBrowser {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/windows/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://stackoverflow.com/");

        WebElement stackOverflowLoginField = webDriver.findElement(By.id("se-login-fields"));
        if(stackOverflowLoginField.isDisplayed()&&stackOverflowLoginField.isEnabled()){
            System.out.println("Log in field is enabled and displayed.");
        }
        else{
            System.out.println("Test Failed!!.");
        }

        WebElement stackOverflowLoginId = webDriver.findElement(By.id("display-name"));
        stackOverflowLoginId.sendKeys("neeraja");

        WebElement stackOverflowLoginEmail = webDriver.findElement(By.id("email"));
        stackOverflowLoginEmail.sendKeys("neeraja@abc.com");

        WebElement stackOverflowLoginPassword = webDriver.findElement(By.id("password"));
        stackOverflowLoginPassword.sendKeys("qwerty123");

        WebElement signInButton = webDriver.findElement(By.id("submit-button"));
        signInButton.click();


    }
}
