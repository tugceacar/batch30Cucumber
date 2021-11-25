@background

Feature: US1002 amazon background ile arama

  Background: amazon sayfasina gitme
    When kullanici amazon sayfasina gider


  @amazon @nutella
  Scenario: TC01 Amazon nutella arama
    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And ana sayfayi kapatir

  @amazon @java
  Scenario: TC02 Amazon java arama
    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And ana sayfayi kapatir

  @amazon @ipad
  Scenario: TC03 Amazon Ipad arama
    And Ipad icin arama yapar
    Then sonucun Ipad icerdigini test eder
    And ana sayfayi kapatir
