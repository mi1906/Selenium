package com.train.org.project.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowSwitch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("amazon.com/ref=nav_logo");
			 Thread.sleep(2000);
			 //driver.navigate().refresh();
			 driver.manage().window().maximize();
			 //driver.navigate().back();
			 //Thread.sleep(1000);
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 WebDriverWait oi=new WebDriverWait(driver, null);
			 oi.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Books")));
			 WebElement books=driver.findElement(By.linkText("Books"));
			 Actions ob=new Actions(driver);
			 ob.keyDown(Keys.SHIFT).build().perform();
			 books.click();
			 ob.keyUp(Keys.SHIFT).build().perform();
			 Set<String> windowsoi= driver.getWindowHandles();
			 Iterator<String> iterator=windowsoi.iterator();
			 String Firstwindoehandle=iterator.next();
			 String Secondwindowhandle=iterator.next();
			 driver.switchTo().window(Secondwindowhandle);
			 Thread.sleep(1000);
			 WebElement marraige=driver.findElement(By.xpath("Books"));
			 marraige.click();

	}

}
