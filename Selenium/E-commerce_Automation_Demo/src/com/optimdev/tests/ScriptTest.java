package com.optimdev.tests;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.optimdev.pageobjects.PageObjectsCheckouts;
import com.optimdev.pageobjects.PageObjectsSignIn;
import com.optimdev.pageobjects.PageObjectsSignOut;
import com.optimdev.pageobjects.PageObjectsSignUp;
import com.optimdev.pageobjects.PageObjectsTShirtShopping;
import com.optimdev.pageobjects.PageObjectsWomenShopping;

public class ScriptTest {
	
	private static WebDriver driver = null;
	private static String userEmail;// = "N208J2LHXI@gmail.com";
	private static String userPwd = "randompwd1234567890";
	
	static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        
        String saltStr = salt.toString();
        return saltStr;
    }
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Coding\\Java EE Things\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		String url = "http://automationpractice.com/index.php";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		//clicking on signin button in right navbar
		PageObjectsSignUp.getSignInNav(driver).click();
		
		
		/*CREATING AN ACCOUNT*/
		
		//get email address text box
		userEmail = getSaltString() + "@gmail.com";
		PageObjectsSignUp.getCreateEmailAddressText(driver).sendKeys(userEmail);
		//clicking on create an account button
		PageObjectsSignUp.getCreateAccountBtn(driver).click();
		
		//filling up the signup form
		PageObjectsSignUp.getMaleTitleRadioBtn(driver).click();
		
		PageObjectsSignUp.getFirstNameText(driver).sendKeys("Glowing");
		Thread.sleep(1000);
		PageObjectsSignUp.getLastNameText(driver).sendKeys("Garbanzo");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getPasswordText(driver).sendKeys(userPwd);
		Thread.sleep(1000);
		
		PageObjectsSignUp.getDayDOBDropdown(driver).selectByIndex(12);
		PageObjectsSignUp.getMonthDOBDropdown(driver).selectByValue("9");
		PageObjectsSignUp.getYearDOBDropdown(driver).selectByValue("1999");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getAddressText(driver).sendKeys("Atlanta");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getCityText(driver).sendKeys("Atlanta");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getStateDropdown(driver).selectByVisibleText("Georgia");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getPostalCodeText(driver).sendKeys("00005");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getCountryDropdown(driver).selectByValue("21");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getMobileNumText(driver).sendKeys("4444444444");
		Thread.sleep(1000);
		
		PageObjectsSignUp.getAddressAliasText(driver).clear();
		PageObjectsSignUp.getAddressAliasText(driver).sendKeys("AtlantaAlias");
		Thread.sleep(1000);
	
		PageObjectsSignUp.getRegisterBtn(driver).click();
		Thread.sleep(1000);
		/*END OF REGISTRATION FORM*/
		
		//signing out of the account once
		PageObjectsSignOut.getSignOutBtn(driver).click();
		
		//logging in with the credentials of the account created before
		PageObjectsSignIn.getEmailAddressText(driver).sendKeys(userEmail);
		Thread.sleep(1000);
		PageObjectsSignIn.getPasswordText(driver).sendKeys(userPwd);
		Thread.sleep(1000);
		PageObjectsSignIn.getSignInBtn(driver).click();
		
		/*now exploring the catalog and adding some items to the cart*/
		//exploring casual dresses in women category
		WebElement main = PageObjectsWomenShopping.getWomenMainMenu(driver);
		Actions action = new Actions(driver);
		action.moveToElement(main);
		Thread.sleep(2000);
		WebElement casualDresses = PageObjectsWomenShopping.getWomenCasualDresses(driver);
		action.moveToElement(casualDresses);
		Thread.sleep(2000);
		action.click().build().perform();
		
		//scrolling down to the items present in the category section
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		//exec.executeScript("arguments[0].scrollIntoView();", PageObjectsWomenShopping.getItemNameText(driver));
		exec.executeScript("window.scrollBy(0,600)", "");
		
		//adding the selected item to the cart
		WebElement itemHover = PageObjectsWomenShopping.getItemHover(driver);
		action.moveToElement(itemHover);
		Thread.sleep(2000);
		WebElement itemAddtoCart = PageObjectsWomenShopping.getDirectAddToCardBtn(driver);
		action.moveToElement(itemAddtoCart);
		action.click().build().perform();
		
		/*
		//confirming the product details and adding it to the cart
		PageObjectsWomenShopping.getItemCountIncreased(driver).click();
		Thread.sleep(2000);
		PageObjectsWomenShopping.getItemCountIncreased(driver).click();
		Thread.sleep(2000);
		PageObjectsWomenShopping.getItemCountDecreased(driver).click();
		Thread.sleep(2000);
		PageObjectsWomenShopping.getItemSize(driver).selectByValue("2");
		Thread.sleep(2000);
		PageObjectsWomenShopping.getAddToCartBtn(driver).click();
		*/
		
		//continuing to shopping and adding one more item in the cart
		//PageObjectsWomenShopping.getContinueShoppingBtn(driver).click();
		driver.navigate().refresh();
		
		exec.executeScript("window.scrollBy(0,0)", "");
		
		//exploring the t-shirt section
		PageObjectsTShirtShopping.getTShirtMainMenu(driver).click();
		
		exec.executeScript("window.scrollBy(0,600)", "");
		
		WebElement itemHovered = PageObjectsTShirtShopping.getItemHover(driver);
		action.moveToElement(itemHovered);
		Thread.sleep(2000);
		WebElement itemAddedtoCart = PageObjectsTShirtShopping.getDirectAddToCardBtn(driver);
		action.moveToElement(itemAddedtoCart);
		action.click().build().perform();
		
		//proceeding to checkout
		//PageObjectsTShirtShopping.getProceedtoCheckoutBtn(driver).click(); 
		driver.navigate().refresh();
		exec.executeScript("window.scrollBy(0,0)", "");
		action.moveToElement(PageObjectsTShirtShopping.getCartPreview(driver)).perform();
		PageObjectsTShirtShopping.getCheckoutBtn(driver).click();
	
		//confirming the order details and placing the order
		exec.executeScript("window.scrollBy(0,700)", "");
		PageObjectsCheckouts.proceedToAddressPage(driver).click();
		exec.executeScript("window.scrollBy(0,600)", "");
		PageObjectsCheckouts.getTextAreaCommentOrderAddressPage(driver).sendKeys("Placing order via automated script!!");
		PageObjectsCheckouts.proceedToShippingPage(driver).click();
		exec.executeScript("window.scrollBy(0,200)", "");
		PageObjectsCheckouts.checkTermsOfServiceShippingPage(driver).click();
		PageObjectsCheckouts.proceedToPaymentPage(driver).click();
		exec.executeScript("window.scrollBy(0,600)", "");
		PageObjectsCheckouts.payByCheckPaymentPage(driver).click();
		exec.executeScript("window.scrollBy(0,200)", "");
		PageObjectsCheckouts.confirmOrderBtn(driver).click();
		
		//viewing order details
		PageObjectsCheckouts.viewOrders(driver).click();
		PageObjectsCheckouts.viewOrderDetailsBtn(driver).click();
		Thread.sleep(4000);
		exec.executeScript("window.scrollBy(0,1100)", "");
	}
}
