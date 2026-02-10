package.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
    WebElement textInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[1]/input"));
        textInput.sendKeys("MyTest");
    WebElement passwordInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
        passwordInput.sendKeys("Test123");
    WebElement textArea = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea"));
        textArea.sendKeys("This is my test area");

}
