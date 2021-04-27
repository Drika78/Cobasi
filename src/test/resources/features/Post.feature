Feature: : Consulta
  Scenario: Consultar Petisco
    Given que acesso a Cobasi
    When pesquiso por "Petisco"
    Then exibe a expressao "Petisco - Cobasi" no titulo da guia