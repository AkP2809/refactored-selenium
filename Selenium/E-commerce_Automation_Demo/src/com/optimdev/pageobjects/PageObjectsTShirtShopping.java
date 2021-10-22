package com.optimdev.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsTShirtShopping {
	
	private static WebElement element = null;
	
	public static WebElement getTShirtMainMenu(WebDriver driver) {
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")));
		return element;
	}
	
	public static WebElement getItemHover(WebDriver driver) {	
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]")));
		return element;
	}
	
	public static WebElement getDirectAddToCardBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")));
		return element;
	}
	
	/*public static WebElement getProceedtoCheckoutBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")));
		return element;
	}*/
	
	public static WebElement getCartPreview(WebDriver driver) {
		element = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")));
		return element;
	}
	
	public static WebElement getCheckoutBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button_order_cart\"]")));
		return element;
	}
}
