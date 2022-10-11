Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanici Amazon'da nutella aratir

    Given Kullanici Amazon sayfasina gider
    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder

  @gp2
  Scenario: TC02 Kullanici Amazon'da Selenium aratir

    Given Kullanici Amazon sayfasina gider
    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder

  @gp3
  Scenario: TC03 Kullanici Amazon'da iphone aratir

    Given Kullanici Amazon sayfasina gider
    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir
    # => Sayfayi kapatma islemini her test'te yaparsak browser'i her testte acip kaaptir
    # => En son testte kapatirsak tum testleri tek sayfada yapip kaptir.
