package com.optimdev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "http://www.phptravels.net/admin";
		driver.navigate().to(url);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*WebElement email = driver.findElement(By.cssSelector("body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > label:nth-child(2) > input[type=text]"));
		email.sendKeys("admin@phptravels.com");*/
		
		//explicit wait
		WebElement email = (new WebDriverWait(driver, 5)).
							until(ExpectedConditions.presenceOfElementLocated(
									By.cssSelector("body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > label:nth-child(2) > input[type=text]")));
		email.sendKeys("admin@phptravels.com");
		
		WebElement pwd = driver.findElement(By.cssSelector("body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > label:nth-child(3) > input[type=password]"));
		pwd.sendKeys("demoadmin");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button"));
		loginBtn.click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement invalidCred = driver.findElement(By.cssSelector("body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div.resultlogin > div"));
		if( (invalidCred.getCssValue("visibility")).equals("visible") ) {
			System.out.println("Invalid Credentials!");
		}
		
	}

}
