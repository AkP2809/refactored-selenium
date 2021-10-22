package com.optimdev.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsCheckouts {
	
	private static WebElement element = null;
	
	public static WebElement proceedToAddressPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")));
		return element;
	}
	public static WebElement getTextAreaCommentOrderAddressPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ordermsg\"]/textarea")));
		return element;
	}
	
	public static WebElement proceedToShippingPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/form/p/button")));
		return element;
	}
	public static WebElement checkTermsOfServiceShippingPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cgv\"]")));
		return element;
	}
	
	public static WebElement proceedToPaymentPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"form\"]/p/button")));
		return element;
	}
	public static WebElement payByCheckPaymentPage(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")));
		return element;
	}
	
	public static WebElement confirmOrderBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cart_navigation\"]/button")));
		return element;
	}
	
	public static WebElement viewOrders(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[2]/a")));
		return element;
	}
	
	public static WebElement viewOrderDetailsBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]")));
		return element;
	}
}
