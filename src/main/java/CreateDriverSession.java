import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
        private static final String base_url = System.getProperty("user.dir");
    public static void main(String[] args) throws MalformedURLException {
        String appUrl = base_url + File.separator + "src" + File.separator + "main" + File.separator + "resources"
                        + File.separator + "ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("avd", "Pixel_XL_API_28");
        caps.setCapability("avdLaunchTimeout", 180000);
        caps.setCapability("appPackage", "com.google.android.youtube");
        caps.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
//        caps.setCapability(MobileCapabilityType.APP, appUrl);
        System.out.println(appUrl);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver appiumDriver = new AndroidDriver(url, caps);



//        String appUrl = base_url + File.separator + "src" + File.separator + "main" + File.separator + "resources"
//                + File.separator + "UIKitCatalog-iphonesimulator.app";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Pro Max");
//        caps.setCapability(MobileCapabilityType.UDID, "2B5706E2-AFCE-49C4-9587-2715E6619697");
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        caps.setCapability(MobileCapabilityType.APP, appUrl);
//        System.out.println(appUrl);
//        URL url = new URL("http://0.0.0.0:4723/wd/hub");
//
//        AppiumDriver appiumDriver = new IOSDriver(url, caps);

    }
}
