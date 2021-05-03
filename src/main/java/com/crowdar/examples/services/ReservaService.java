package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.PhpVisaConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class ReservaService extends MobileActionManager {

    public static void lugarVuelo(String origen, String destino){
        click(PhpVisaConstants.BUTTON_ORIGEN_ID); //hago click en el input origen
        setInput(PhpVisaConstants.INPUT_SEARCH_XPATH,origen); //hago click en el input search para buscar el lugar origen
        click(PhpVisaConstants.BUTTON_SEARCH_XPATH); // selecciono el origen buscado
        click(PhpVisaConstants.BUTTON_DESTINO_ID);
        setInput(PhpVisaConstants.INPUT_SEARCH_XPATH,destino);
        click(PhpVisaConstants.BUTTON_SEARCH_XPATH);
    }

    public static void datosPasajero(String nombre, String apellido, String email, String phone, String nota){
        setInput(PhpVisaConstants.NOMBRE_INPUT_ID,nombre);
        setInput(PhpVisaConstants.APELLIDO_INPUT_ID,apellido);
        setInput(PhpVisaConstants.EMAIL_INPUT_ID,email);
        setInput(PhpVisaConstants.PHONE_INPUT_ID,phone);
        setInput(PhpVisaConstants.NOTAS_INPUT_ID,nota);
    }

    public static void reservaVuelo(){
        click(PhpVisaConstants.BUTTON_SUNMIT_ID);
    }

}
