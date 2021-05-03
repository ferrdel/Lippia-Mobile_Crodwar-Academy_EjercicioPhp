package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobileReservacion extends PageBaseMobile {

    private final String TEXT_RESER_ID = "Comfir";
   // private final String TEXT_VIEW_XPATH = "//android.widget.TextView";

    public PhpMobileReservacion(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void confirmaReserva() {
       // return getWebElement(By.id(TEXT_RESER_ID));
    }

}
