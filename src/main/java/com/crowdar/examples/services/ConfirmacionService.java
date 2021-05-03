package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ConfirmacionConstants;
import org.testng.Assert;

public class ConfirmacionService extends MobileActionManager {

    public static void validateConfirmacion() {
        Assert.assertTrue(isPresent(ConfirmacionConstants.TEXT_CONFIRMA_XPATH),"Error en la reserva");
    }


}
