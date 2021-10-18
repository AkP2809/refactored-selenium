package com.optimdev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinAutomation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
	    driver.manage().window().maximize();
		
		driver.navigate().to("https://www.linkedin.com/signup");
			
		//waiting for the element to load
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement loginLink = driver.findElement(By.cssSelector("body > div.page.page--is-mercado-theme-enabled > main > p.main__sign-in-container > a"));
		loginLink.click();
		
		//waiting for the element to load
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement emailOrPhone = driver.findElement(By.id("username"));
		emailOrPhone.sendKeys("");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		
		WebElement signInBtn = driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button"));
		signInBtn.click();
		
	}
}
