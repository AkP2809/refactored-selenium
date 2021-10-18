package com.optimdev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTesting {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://preview.keenthemes.com/metronic-v4/theme/admin_1/ui_tree.html";
		driver.navigate().to(url);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"j3_7_anchor\"]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"j3_2_anchor\"]"));
		
		Actions build = new Actions(driver);
		Action dragAndDrop = build.clickAndHold(from).moveToElement(to).release(to).build();
		dragAndDrop.perform();

	}

}
