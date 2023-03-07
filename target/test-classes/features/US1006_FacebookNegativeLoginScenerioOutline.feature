Feature: US1006 Facebook sayfasında farklı kullanıcı ile negative test

  @facebook
  Scenario Outline: TC10 farklı kullanıcı isimleri ile negativ test


    Given kullanıcı "facebookUrl" sayfasına gider
    Then  facebook çerezleri kapat
    Then facebook email kutusuna "<wrongEmail>" yazar
    And facebook password kutusuna "<wrongPassword>" yazar
    And facebook Login Butonuna basar
    Then giriş yapılmadığını test eder
    And sayfayı kapat




    Examples:
    |wrongEmail | wrongPassword |
    |natnael.nasiir@foundtoo.com| 123456  |
    |natnael@foundtoo.com| 123456  |
