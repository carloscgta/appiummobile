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

public class DriverFactory {

	public static SceenGenerator page;
	private static WebDriverWait wait;


	protected static AppiumDriver<MobileElement> driver;

    public static  AppiumDriver<?> getDriver(){
        if(driver == null){
            conectar();
        }
        return driver;
    }

    private static AppiumDriver<MobileElement> conectar() {
        File diretorioAplicacao = new File("app");
        File arquivoAplicacao = new File(diretorioAplicacao, "iCarros.apk");

        DesiredCapabilities capacidade = new DesiredCapabilities();
        capacidade.setCapability("deviceName", "sdk_gphone_x86");
        capacidade.setCapability("udid", "emulator-5554");
        capacidade.setCapability("platformName", "Android");
        capacidade.setCapability("platformVersion", "11");
        capacidade.setCapability("appPackage", "com.android.vending");
        capacidade.setCapability("appActivity", "br.com.icarros.androidapp.ui.feirao.v2.Home.FeiraoActivity");
        capacidade.setCapability("app", arquivoAplicacao.getAbsolutePath());
        capacidade.setCapability("automationName", "UiAutomatoriCarrosItau");
        capacidade.setCapability("newCommandTimeout", 4600);
        capacidade.setCapability("unicodeKeyboard", true);
        capacidade.setCapability("resetKeyboard", true);

        try {
        	URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, capacidade);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }


    public static WebDriverWait esperarpeloDriver(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait;
    }
    
   
	public static AppiumDriver<MobileElement> encerrarDriver() {
		if (driver!= null) {
			driver.quit();
		}
		return driver;
    }

}
