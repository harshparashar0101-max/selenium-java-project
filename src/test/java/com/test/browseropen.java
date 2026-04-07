package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen 
{
    public static void main( String[] args )
    {
        // This line opens the Chrome browser
        WebDriver driver = new ChromeDriver();

    
            driver.get("https://www.google.com");
            System.out.println("Browser opened! Title is: " + driver.getTitle());
        

            //Webhook test for Java build

            //new webhook test for java build

            //new webhook test for java build 2
    }
}

