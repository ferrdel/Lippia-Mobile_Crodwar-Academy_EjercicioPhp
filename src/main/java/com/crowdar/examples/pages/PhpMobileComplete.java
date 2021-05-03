package com.crowdar.examples.pages;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobileComplete extends PageBaseMobile {

    private final String DESDE_INPUT_LOCATOR = "/ihh";
    private final String HASTA_INPUT_LOCATOR = "/";

    private final String NOMBRE_INPUT_LOCATOR = "/";
    private final String APELLIDO_INPUT_LOCATOR = "/";
    private final String CEL_INPUT_LOCATOR = "/";
    private final String EMAIL_INPUT_LOCATOR = "/";
    private final String NOTA_INPUT_LOCATOR = "/";

    private final String BUTTON_SUMBIT_ID = "/";

    public PhpMobileComplete(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public static void validateReserva(){
        Assert.assertTrue();
    }

    public static void setFechas(String salida, String llegada){
        this.completeField(DESDE_INPUT_LOCATOR, salida);
        this.completeField(HASTA_INPUT_LOCATOR, llegada);

        click(visaConstans.BUTTON);
        setInput(VisaConstans.INPUT_SEARCH);
    }

    public static void setDatos(String nombre_p, String apellido_p,String email_p,String cel_p,String nota_p){
        this.completeField(NOMBRE_INPUT_LOCATOR, nombre_p);
        this.completeField(APELLIDO_INPUT_LOCATOR, apellido_p);
        this.completeField(EMAIL_INPUT_LOCATOR, email_p);
        this.completeField(CEL_INPUT_LOCATOR, cel_p);
        this.completeField(NOTA_INPUT_LOCATOR, nota_p);
    }

    public void tapSumbit() {
        clickElement(By.id(BUTTON_SUMBIT_ID));
    }

}
