package br.com.icarrositau.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeiCarrosScreen extends BaseScreen {

	public HomeiCarrosScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	
	@AndroidFindBy(accessibility = "")
    MobileElement buttonBuscar;


/***********************MÉTODOS*****************************************/
	
public void clicarBotaoBuscar() throws InterruptedException {
		
		click(buttonBuscar);
		
		
	}
}
