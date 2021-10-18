package com.optimdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.calculator.net/mass-calculator.html";
		driver.get(url);
		
		//ID Locator
		WebElement cDensity = driver.findElement(By.id("cdensity")); //getting the density input field and sending a value
		cDensity.clear();
		cDensity.sendKeys("10000");
		
		WebElement cVolume =  driver.findElement(By.id("cvolume")); //getting the volume input field and sending a value
		cVolume.clear();
		cVolume.sendKeys("100");
	}
}
