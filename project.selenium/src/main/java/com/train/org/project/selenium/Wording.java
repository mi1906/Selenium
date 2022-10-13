package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Wording {
	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
 		 driver=new ChromeDriver();
 		 driver.get("https://www.facebook.com");
 		 Thread.sleep(2000);
 		 //driver.navigate().refresh();
 		 driver.manage().window().maximize();
 		 String titles= driver.findElement(By.xpath("Facebook helps you connect and share with the people in your life.")).getText();
 		 System.out.println(titles);

	}

}
