package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	 		 driver=new ChromeDriver();
	 		 driver.get("https://demoqa.com/alerts");
	 		 Thread.sleep(2000);
	 		 //driver.navigate().refresh();
	 		 driver.manage().window().maximize();
	 		 driver.findElement(By.id("alertButton")).click();
	 		 Thread.sleep(2000);
	 		 driver.switchTo().alert().accept();
	 		 driver.findElement(By.id("promtButton")).click();
	 		 Thread.sleep(2000);
	 		 driver.switchTo().alert().dismiss();
	 		 driver.findElement(By.id("promtButton")).click();
	 		 Thread.sleep(2000);
	 		 driver.switchTo().alert().sendKeys("ibi");
	 		 driver.switchTo().alert().dismiss();
	}

}
