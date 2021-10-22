package com.optimdev.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsSignUp {
	
	private static WebElement element = null;
	
	//return sign in from home page
	public static WebElement getSignInNav(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")));
		return element;
	}
	
	public static WebElement getCreateEmailAddressText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")));
		return element;
	}
	
	public static WebElement getCreateAccountBtn(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")));
		return element;
	}
	
	public static WebElement getMaleTitleRadioBtn(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 7)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"id_gender1\"]")));
		return element;
	}
	
	public static WebElement getFemaleTitleRadioBtn(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 7)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"id_gender2\"]")));
		return element;
	}
	
	public static WebElement getFirstNameText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")));
		return element;
	}
	
	public static WebElement getLastNameText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")));
		return element;
	}
	
	public static WebElement getPasswordText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")));
		return element;
	}
	
	public static Select getDayDOBDropdown(WebDriver driver) {
		Select day = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")));
		return day;
	}
	
	public static Select getMonthDOBDropdown(WebDriver driver) {
		Select month = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")));
		return month;
	}
	
	public static Select getYearDOBDropdown(WebDriver driver) {
		Select year = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")));
		return year;
	}
	
	public static WebElement getAddressText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")));
		return element;
	}
	
	public static WebElement getCityText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")));
		return element;
	}
	
	public static Select getStateDropdown(WebDriver driver) {
		Select state = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")));
		return state;
	}
	
	public static WebElement getPostalCodeText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")));
		return element;
	}
	
	public static Select getCountryDropdown(WebDriver driver) {
		Select country = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select")));
		return country;
	}
	
	public static WebElement getMobileNumText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")));
		return element;
	}
	
	public static WebElement getAddressAliasText(WebDriver driver) {
		
		//explicit wait
		element = (new WebDriverWait(driver, 4)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input")));
		return element;
	}
	
	public static WebElement getRegisterBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button"));
		return element;
	}
}
