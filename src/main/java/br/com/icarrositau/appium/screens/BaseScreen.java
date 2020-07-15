//package br.com.icarrositau.appium.screens;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//
//public class BaseScreen extends SceenGenerator{
//
//
//	
//	public BaseScreen( AppiumDriver<MobileElement> driver) {
//		// TODO Auto-generated constructor stub
//		super(driver);
//	}
//
//	
//	public <T> void click(T elementAttr) throws InterruptedException {
//
//		waitForElement(elementAttr);
//		((WebElement) elementAttr).click();
//
//	}
//	
//	public <T> void pressionarEnter(T elementAttr) throws InterruptedException {
//
//		waitForElement(elementAttr);
//		((WebElement) elementAttr).sendKeys(Keys.ENTER);
//
//	}
//	
//	// Wait generic method
//
//	public <T> void waitForElement(T elementAttr) throws InterruptedException {
//		
//	}
//
//	public <T> Boolean elementIsDisplayed(T elementAttr) throws InterruptedException {
//		Boolean  isDisplayed=false;
//		if(((WebElement) elementAttr).isDisplayed()) {
//			 isDisplayed=true;
//		}
//		
//		return isDisplayed;
//	}
//
//	
//	// Write Text by using JAVA Generics (You can use both By or Webelement)
//
//	public <T> void writeText(T elementAttr, String text) throws InterruptedException {
//		
//		((WebElement) elementAttr).sendKeys(text);
//
//	}
//	
//	
//}
