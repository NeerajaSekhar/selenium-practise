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

        WebElement stackOverflowSignupButton = webDriver.findElement(By.className("-ctas"));
        if(stackOverflowSignupButton.isDisplayed()&&stackOverflowSignupButton.isEnabled()){
            System.out.println("Sign up button is enabled and displayed.");
        }
        else{
            System.out.println("Test Failed!!.");
        }
        stackOverflowSignupButton.click();

        WebElement stackOverflowLoginId = webDriver.findElement(By.id("display-name"));
        stackOverflowLoginId.sendKeys("neeraja");

        WebElement stackOverflowLoginEmail = webDriver.findElement(By.id("email"));
        stackOverflowLoginEmail.sendKeys("neeraja@abc.com");

        WebElement stackOverflowLoginPassword = webDriver.findElement(By.id("password"));
        stackOverflowLoginPassword.sendKeys("qwerty123");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement captchaLogo = webDriver.findElement(By.id("no-captcha-here"));
        captchaLogo.click();
        System.out.println("When selecting the right images mentioned, sign up will be successfull.");


    }
}
