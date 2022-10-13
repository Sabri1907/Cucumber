Feature: US12 Class Work
  Scenario Outline: TC01 Kullanici Sutun Basligi Ile Liste Alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Price (Rs) |
      | % Change |

    Scenario: Kullanici sayfayi kapatir
      Given Sayfayi kapatir