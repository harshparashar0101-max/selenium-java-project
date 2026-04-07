package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class schduler1 {
   
protected WebDriver driver ;
	
	@BeforeClass 
	public void setup() {
		
	
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
		//WebDriver driver = new ChromeDriver();
		
		@Test(priority = 1)
		public void login() throws InterruptedException {
        driver.get("https://vshowqa.on24.com/vshow/ve/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Harshrole10");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@26");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        System.out.println("login successfully");
        
		}
        
		@Test ( dependsOnMethods= "login")
		public void Entershow() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//input[@id='searchInput']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("9000379332");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-row-id='9000379332']")).click();
        System.out.println("Show enter successfully");
        
		}
        
        //Report open
		
		@Test(priority = 2)
		public void reportopen() throws InterruptedException {
       
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//a[@data-row-id='8000179411']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-pattern='reports']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='launch-ve-analytics']")).click();
        Thread.sleep(5000);
       
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        
         Iterator<String> iterator = handles.iterator();
         String win1=iterator.next();
         String win2=iterator.next();
         
         //driver.switchTo().window(win1);
         //System.out.println(win1);
        
         driver.switchTo().window(win2);
         System.out.println(win2);
         
         System.out.println("report login succesfully");

		}
     
	@Test(priority = 2)
    public void scdulerclick() throws InterruptedException {
    	
    	Thread.sleep(5000);
    	 driver.findElement(By.xpath("//span[@id='regNav']")).click();
    	 Thread.sleep(50000);
    	 
    	 driver.findElement(By.id("schedule-icon")).click();
    	 Thread.sleep(100000);
    	 
    	 driver.findElement(By.id("btnSubmitScheduler")).click();
    	 
    	
}



}
