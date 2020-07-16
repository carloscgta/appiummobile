package br.com.icarrositau.appium.screens;

import org.openqa.selenium.support.PageFactory;

import br.com.icarrositau.appium.core.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SceenGenerator extends DriverFactory{

	public SceenGenerator(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	

	public  <TPage extends BaseScreen> void GetInstance (Class<TPage> Pageclass) throws Exception {

        try {

        	
        	PageFactory.initElements(new AppiumFieldDecorator(getDriver()), Pageclass);

//            return PageFactory.initElements(driver, Pageclass);

        } catch (Exception e) {

            e.printStackTrace();
            
            throw e;

        }

    }
}
