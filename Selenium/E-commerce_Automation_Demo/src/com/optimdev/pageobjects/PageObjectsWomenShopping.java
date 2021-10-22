package com.optimdev.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsWomenShopping {

	private static WebElement element = null;
	
	public static WebElement getWomenMainMenu(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")));
		return element;
	}
	
	public static WebElement getWomenCasualDresses(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]/a")));
		return element;
	}
	
	public static WebElement getItemNameText(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Printed Dress")));
		return element;
	}
	
	public static WebElement getItemHover(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li")));
		return element;
	}
	
	public static WebElement getItemPreview(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]")));
		return element;
	}
	
	/*public static WebElement getItemCountIncreased(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 25)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")));
		return element;
	}
	
	public static WebElement getItemCountDecreased(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 25)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[1]")));
		return element;
	}
	
	public static Select getItemSize(WebDriver driver) {
		
		Select size = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		return size;
	}
	
	public static WebElement getAddToCartBtn(WebDriver driver) {
		
		element = (new WebDriverWait(driver, 25)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"add_to_cart\"]/button")));
		return element;
	}*/
	
	public static WebElement getContinueShoppingBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));
		return element;
	}
	
	public static WebElement getDirectAddToCardBtn(WebDriver driver) {
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")));
		return element;
	}
}
