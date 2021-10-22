package com.optimdev.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsSignOut {
		
	private static WebElement element = null;
	
	public static WebElement getSignOutBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")));
		return element;
	}
}
