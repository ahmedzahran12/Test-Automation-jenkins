package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
//        WebDriver driver=new ChromeDriver();
        //implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.get("https://courses.rahulshettyacademy.com/");
//        driver.findElement(By.linkText("Sign Up")).click();
//        driver.findElement(By.linkText("Log in")).click();
//        driver.findElement(By.xpath("//input[@id='email']")) .sendKeys("Ahmed");
//        driver.findElement(By.xpath("//input[@id='email']")) .sendKeys("Ahmed");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement textInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[1]/input"));
        textInput.sendKeys("MyTest");
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
        passwordInput.sendKeys("Test123");
        WebElement textArea = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea"));
        textArea.sendKeys("This is my test area");









    }
}