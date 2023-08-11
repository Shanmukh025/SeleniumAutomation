package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class gadgets360 {

    public static void main(String[] args)throws IOException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.gadgets360.com/");
        driver.findElement(By.xpath("//input[@id='searchtext']")).sendKeys("iphone 12");
        driver.findElement(By.id("autocom-dflt")).submit();
        driver.findElement(By.xpath("//img[@title='iPhone 12']")).click();
        driver.findElement(By.xpath("//a[@title='iPhone 12 Price']")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/skill4(1).png"));
    }
}