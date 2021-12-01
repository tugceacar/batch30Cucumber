Feature: US1003 kullanici istedigi kelime icina rama yapip. sonucu test eder

  Scenario: TC07 istenen kelimenin oldugunu test etme

    Given kullanici "techproeducationUrl" sayfasina gider
    And "armut" icin arama yapar
    Then sonucun "armut" icerdigini test eder
    And ana sayfayi kapatir