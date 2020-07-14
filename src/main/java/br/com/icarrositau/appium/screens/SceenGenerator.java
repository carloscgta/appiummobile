package br.com.icarrositau.appium.screens;

import org.openqa.selenium.support.PageFactory;

import br.com.icarrositau.appium.core.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SceenGenerator extends DriverFactory{

	public SceenGenerator(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	
//	PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this)
	

	
	public  <TPage extends BaseScreen> TPage GetInstance (Class<TPage> Pageclass) throws Exception {

        try {

           //Initialize the Page with its elements and return it.

            return PageFactory.initElements(driver, Pageclass);
            		
            		//PageFactory.initElements(driver,  Pageclass);

        } catch (Exception e) {

            e.printStackTrace();
            
            throw e;

        }

    }
}
