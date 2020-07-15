package br.com.icarrositau.appium.screens;

import org.openqa.selenium.support.PageFactory;

import br.com.icarrositau.appium.core.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeiCarrosScreen extends DriverFactory {

	public HomeiCarrosScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	
	@AndroidFindBy(accessibility = "")
    MobileElement buttonBuscar;

//	PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);

/***********************MÉTODOS*****************************************/
	

}
