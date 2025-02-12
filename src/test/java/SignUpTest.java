import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SignUpTest {
     @Test
    void testSignUp() {

         WebDriver driver = new ChromeDriver();
         driver.get("http://192.168.89.232/registration");

         WebElement socialTitle = driver.findElement(By.id("field-id_gender-1"));
         socialTitle.click();
         WebElement firstName = driver.findElement(By.id("field-firstname"));
         firstName.sendKeys("John");
         WebElement lastName = driver.findElement(By.id("field-lastname"));
         lastName.sendKeys("Smith");
         WebElement email = driver.findElement(By.id("field-email"));
         email.sendKeys("john.smith@gmail.com");
         WebElement password = driver.findElement(By.id("field-password"));
         password.sendKeys("victoriasecret123.");
         WebElement birthDate = driver.findElement(By.id("field-birthday"));
         birthDate.click();
         birthDate.sendKeys("09/09/2020");
         List<WebElement> checkboxes = driver.findElements(By.className("custom-checkbox"));
         checkboxes.get(0).click();
         checkboxes.get(1).click();
         checkboxes.get(2).click();
         checkboxes.get(3).click();
         WebElement saveButton = driver.findElement(By.cssSelector(".btn.btn-primary.float-xs-right.form-control-submit"));
         saveButton.click();
     }
}