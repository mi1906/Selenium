package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ibrowser {
static WebDriver driver;
   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.com/ref=ap_frn_logo");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 WebElement signed=driver.findElement(By.id("nav-link-accountList"));
	 Actions act=new Actions(driver);
	 act.moveToElement(signed).build().perform();
	 WebElement PrimeStMembership=driver.findElement(By.xpath("//*[text()='Prime Membership']"));
	 
	 
	   

		
	}

}































