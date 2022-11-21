Feature: US11 Class Work
  @grp88
  Scenario: TC01 Kullanici Sutun Basligi Ile Liste Alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    Then "% Change" sutunundaki tum degerleri yazdirir
