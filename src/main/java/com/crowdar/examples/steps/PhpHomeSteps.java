package com.crowdar.examples.steps;

import com.crowdar.examples.constants.PhpVisaConstants;
import com.crowdar.examples.services.PhpHomeService;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ReservaService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PhpHomeSteps extends PageSteps{

    @Given("el usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {
        PhpHomeService.validateHome();
    }

    @When("el usuario tapea el icono VISA")
    public void elUsuarioTapeaElIconoVISA() {
        PhpHomeService.clickVisa();
    }

    @And("el usuario completa los datos desde (.*) hasta (.*)")
    public void elUsuarioCompletaLosDatosDesdeHasta(String origen, String destino) {
        ReservaService.lugarVuelo(origen,destino);
    }

    @And("el usuario completa el campo nombre: (.*), apellido (.*), email (.*), celular (.*), notas (.*)")
    public void elUsuarioCompletaElCampoNombreApellidoEmailCelularNotas(String nombre, String apellido, String email, String phone, String nota) {
        ReservaService.datosPasajero(nombre,apellido,email,phone,nota);
    }

    @And("el usuario tapea el botón SUNMIT")
    public void elUsuarioTapeaElBotón(String arg0) {
        ReservaService.reservaVuelo();
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReserva() {

    }
}