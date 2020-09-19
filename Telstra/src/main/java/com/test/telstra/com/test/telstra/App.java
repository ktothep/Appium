package com.test.telstra.com.test.telstra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        //cap.setCapability(MobileCapabilityType.APP, "");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
        cap.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
        cap.setCapability("avd", "TestEmu");
       cap.setCapability("app-package", "com.amazon.mShop.android.shopping");
        cap.setCapability("app-activity", "com.amazon.mShop.home.HomeActivity");
        AndroidDriver driver = new AndroidDriver (new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        
    }
}
