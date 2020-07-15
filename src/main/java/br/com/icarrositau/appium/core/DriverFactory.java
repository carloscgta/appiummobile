package br.com.icarrositau.appium.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DriverFactory {

	public static AndroidDriver<?> driver;

    public static  AndroidDriver<?> getDriver(){
        if(driver == null){
            conectar();
        }
        return driver;
    }

    public static AndroidDriver<?> conectar() {
    	   try {
    	File diretorioAplicacao = new File("app");
        File arquivoAplicacao = new File(diretorioAplicacao, "Base.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(AndroidMobileCapabilityType.ADB_EXEC_TIMEOUT,4600);
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.vending");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "br.com.icarros.androidapp.ui.feirao.v2.Home.FeiraoActivity");
        cap.setCapability(MobileCapabilityType.APP,  arquivoAplicacao.getAbsolutePath());

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, cap);
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
   
	public static AndroidDriver<?> encerrarDriver() {
		if (driver!= null) {
			driver.quit();
		}
		return driver;
    }

}
