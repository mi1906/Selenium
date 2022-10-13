package com.train.org.project.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method

	}
	public static void Ibrowsers(String NameOfBrowser) {
		if (NameOfBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Rauf\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");			
		}
	}

}
