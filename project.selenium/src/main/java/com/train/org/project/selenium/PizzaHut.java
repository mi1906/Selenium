package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PizzaHut {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.pizzahut.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@data-testid=\"link-menu-pizza-link\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class=\"MuiTypography-root  jss319 MuiTypography-body1\"])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class=\"MuiGrid-root jss456 MuiGrid-item\"])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("w2-address")).sendKeys("3742 wertz drive");
		 driver.findElement(By.id("w2-city")).sendKeys("Woodbridge");
		 driver.findElement(By.id("w2-state")).sendKeys("Virginia");
		 driver.findElement(By.id("w2-zip")).sendKeys("22193");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@data-testid='primary-cta-button-try-again']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='center-block icon-delivery-default']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("syo-address1")).sendKeys("3742 wertz drive");
		 driver.findElement(By.id("city")).sendKeys("woodbridge");
		 driver.findElement(By.id("state")).sendKeys("Virginia");
		 driver.findElement(By.id("zip-input")).sendKeys("22193");
		 Thread.sleep(1000);
		 driver.findElement(By.id("ph-find-store")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='esp-left ng-binding']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text jss17']")).click();
		 
		 
		 
		
		 

	}

}
