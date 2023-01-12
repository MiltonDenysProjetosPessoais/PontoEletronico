#Author: Milton Denys

@PontoEletronico
Feature: Ponto Eletronico

  @PontoEletronicoScenario
  Scenario: Bater ponto automaticamente
    Given abro a pagina de de ponto eletronico
  And confirmar preferencias
  When eu preencho os campos de login "milton.silva" "R34r3YPqPRFJS5n"
#  And clico em marcacao
#    Then finalizo a aplicacao
