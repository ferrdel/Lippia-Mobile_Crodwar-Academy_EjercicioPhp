package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobileHome extends PageBaseMobile {

    private final String ACTION_ID = "/";
   // private final String TEXT_VIEW_XPATH = "//android.widget.TextView";

    public PhpMobileHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public static void tapVisa() {
        clickElement(By.id(ACTION_ID));
    }

}
