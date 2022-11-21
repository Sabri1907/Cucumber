@web
Feature: US014 Class Work
  Scenario: Kullanici ve Url Testi
    Given Kullanici "webUrl" sayfasina gider
    Then Kullanici Login portala kadar asagi iner
    And Kullanici Login portala tiklar
    And Kullanici diger windowa gecer
    And Kullanici "username" kutusuna bilgileri girer
    And Kullanici "password" bolumune bilgileri girer
    And Kullanici login butonuna tiklar
    And Kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And Kullanici Ok butonuna tiklayarak Popup'i kapatir
    And Kullanici ilk sayfaya geri doner
    And Kullanici ilk sayfaya donuldugunu test eder


