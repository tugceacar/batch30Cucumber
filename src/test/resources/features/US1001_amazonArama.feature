Feature: US1001 Amazon arama

@amazon @nutella
  Scenario: TC01 Amazon nutella arama

    When kullanici amazon sayfasina gider
    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And ana sayfayi kapatir

   @amazon @java
  Scenario: TC02 Amazon java arama

    When kullanici amazon sayfasina gider
    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And ana sayfayi kapatir

  @amazon @ipad
  Scenario: TC03 Amazon Ipad arama

    When kullanici amazon sayfasina gider
    And Ipad icin arama yapar
    Then sonucun Ipad icerdigini test eder
    And ana sayfayi kapatir














