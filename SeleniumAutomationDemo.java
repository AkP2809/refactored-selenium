package com.optimdev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomationDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
