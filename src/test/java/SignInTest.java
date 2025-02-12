import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {
    @Test
    public void testSignIn() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.89.232/login?back=http%3A%2F%2F192.168.89.232%2Flogin%3Fback%3Dhttp%253A%252F%252F192.168.89.232%252Flogin%253Fback%253Dhttp%25253A%25252F%25252F192.168.89.232%25252Fregistration");
        WebElement email = driver.findElement(By.id("field-email"));
        email.sendKeys("john.smith@gmail.com");
        WebElement password = driver.findElement(By.id("field-password"));
        password.sendKeys("victoriasecret123.");
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }
}
