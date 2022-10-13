package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draged {
static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 driver.get("https://jqueryui.com/droppable/");
   	 Thread.sleep(2000);
   	 driver.manage().window().maximize();
   	 driver.switchTo().frame(0);
   	 WebElement dragedit= driver.findElement(By.id("draggable"));
   	 WebElement dropeds= driver.findElement(By.id("droppable"));
   	 Actions act=new Actions(driver);
   	 act.dragAndDrop(dragedit, dropeds).build().perform();
   	 driver.switchTo().parentFrame();
   	 
   	 
   	 WebElement Resizable= driver.findElement(By.linkText("Resizable"));
   	 Resizable.click();

	}

}
