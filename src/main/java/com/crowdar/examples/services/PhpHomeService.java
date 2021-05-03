package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class PhpHomeService extends MobileActionManager {

    public static void validateHome() {
        Assert.assertTrue(isPresent(PhpHomeConstants.BUTTON_VISA_XPATH), "No se encontro el boton visa");
    }

    public static void clickVisa(){
        click(PhpHomeConstants.BUTTON_VISA_XPATH);
    }

}
