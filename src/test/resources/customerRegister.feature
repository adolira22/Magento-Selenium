Feature: Customer Register
  Scenario: Crear una cuenta de usuario
    Given En el menu dar clcik en link de registro
    When El formulario se cargara y llenar los datos
    And click en el boton enviar
    Then Se creara el usuario y debe mostar la pagina de la cuenta
