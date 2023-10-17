@tag
Feature: Buscar en Zara
  uso este template para buscar ropa

  @tag1
  Scenario Outline: Buscamos Blusas
    Given el usuario esta en la pagina de inicio
    When el usuario ingresa <articulo> en la caja de busqueda
    And el usuario hace enter
    Then las blusas aparecen


    Examples: 
      | articulo |
      | blusa | 
      | pantalon |