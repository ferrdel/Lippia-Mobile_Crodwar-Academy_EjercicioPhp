Feature: El usuario realiza una reserva

  @PHP
  Scenario: Realizar Reserva en PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el icono VISA
    And el usuario completa los datos desde <origen>, hasta <destino>
    And el usuario completa el campo nombre: <nombre>, apellido <apellido>, email <email>, celular <celular>, notas <notas>
    And el usuario tapea el botón "SUMBIT"
    Then el usuario verifica que se realizo correctamente la reserva
