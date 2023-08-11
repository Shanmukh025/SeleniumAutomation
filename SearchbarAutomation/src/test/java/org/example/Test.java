package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
        public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://www.youtube.com");
    }
}
