package com.cn.com.cn;

import auto.test.action.ScreenShot;
import auto.test.driver.SeleniumDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/11/12.
 */
public class ScreenShotTest {
    WebDriver driver;
    @Test
    public void screenShotTest() {
        driver= SeleniumDrivers.openBrower("chrome");
        driver.get("http://www.baidu.com");
        ScreenShot.screenShots();
        driver.quit();
    }
}
