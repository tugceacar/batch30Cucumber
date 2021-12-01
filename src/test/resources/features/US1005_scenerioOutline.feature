Feature: US1005 amazonda liste ile arama

  Scenario Outline: TC09 amazonda verilen bir listeyi aratip var olduklarii test ediniz

    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonucun "<arananUrun>" icerdigini test eder
    Then ana sayfayi kapatir

    Examples:
    |arananUrun|
    |nutella   |
    |java      |
    |ipod      |
    |armut     |
    |Apple     |

