package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormTest {
   @Test
    public void testForm(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement textInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[1]/input"));
        textInput.sendKeys("MyTest");
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
        passwordInput.sendKeys("Test123");
        WebElement textArea = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea"));
        textArea.sendKeys("This is my test area");
        WebElement disabledInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[4]/input"));
        Assert.assertFalse(disabledInput.isEnabled());
       Select dropDown = new Select(driver.findElement(By.className("form-select")));
       dropDown.selectByVisibleText("One");
       Select dataList = new Select(driver.findElement(By.className("form-control")));
       dataList.selectByVisibleText("San Francisco");
       By submit = By.name("submit");
       driver.findElement(submit).click();


   }

    @Test
    public void implicitWaits() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement addButton = driver.findElement(By.xpath("/html/body/input[1]"));
        addButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div")).isDisplayed());
        By revealButton = By.id("reveal");
        driver.findElement(revealButton).click();
        By revealed = By.id("revealed");
        driver.findElement(revealed).sendKeys("Ahmed");
    }


    @Test
    public void explicitWait(){
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
            By add = By.id("adder");
            driver.findElement(add).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("box0")));
            Assert.assertTrue(element.isDisplayed());
        By revealButton = By.id("reveal");
        driver.findElement(revealButton).click();
        WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element_2 = wait_2.until(
                ExpectedConditions.elementToBeClickable(By.id("revealed")));
        element_2.sendKeys("Ahmed");

        }

    }

