package br.com.icarrositau.appium.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.icarrositau.appium.screens.SceenGenerator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DriverFactory {

	public static SceenGenerator page;
	private static WebDriverWait wait;


	public static AppiumDriver<MobileElement> driver = null;

    public static  AppiumDriver<MobileElement> getDriver(){
        if(driver == null){
            conectar();
        }
        return driver;
    }

    private static AppiumDriver<MobileElement> conectar() {
    	   try {
//    	File diretorioAplicacao = new File("app");
//        File arquivoAplicacao = new File(diretorioAplicacao, "iCarros.apk");

        DesiredCapabilities capacidade = new DesiredCapabilities();
        
        
        capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
        capacidade.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capacidade.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capacidade.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.vending");
        capacidade.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "br.com.icarros.androidapp.ui.feirao.v2.Home.FeiraoActivity");
        
//        capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//        capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
//        capacidade.setCapability(MobileCapabilityType.NO_RESET, "true");
//        capacidade.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 4600);
//        capacidade.setCapability("deviceName", "sdk_gphone_x86");
//        capacidade.setCapability("udid", "emulator-5554");
//        capacidade.setCapability("platformName", "Android");
//        capacidade.setCapability("platformVersion", "11");
//        capacidade.setCapability("appPackage", "com.android.vending");
//        capacidade.setCapability("appActivity", "br.com.icarros.androidapp.ui.feirao.v2.Home.FeiraoActivity");
//        capacidade.setCapability("adbExecTimeout", 4600);
//        capacidade.setCapability("app", arquivoAplicacao.getAbsolutePath());
//        capacidade.setCapability("automationName", "UiAutomatoriCarrosItau");
//        
//        capacidade.setCapability("unicodeKeyboard", true);
//        capacidade.setCapability("resetKeyboard", true);
        

//        UiAutomatoriCarrosItau
        	URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, capacidade);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }


   
	public static AppiumDriver<MobileElement> encerrarDriver() {
		if (driver!= null) {
			driver.quit();
		}
		return driver;
    }

}
