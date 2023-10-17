@tag
Feature: Buscar en Zara
  uso este template para buscar ropa

  @tag1
  Scenario: Buscamos Blusas
    Given el usuario esta en la pagina de inicio
    When el usuario ingresa blusa en la caja de busqueda
    And el usuario hace enter
    Then las blusas aparecen


