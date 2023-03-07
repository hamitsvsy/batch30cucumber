Feature: US1008 çoklu parametreli bir step ile  editor kişi ekler
  @editor2
  Scenario Outline: TC12  editor sayfasına farklı kişiler ekleme

    Given kullanıcı "editorUrl" sayfasına gider
    Then new butonuna basar
    And editor ilgili kutulara "<firstName>" "<lastName>" "<position> "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer
    And Create tusuna basar


  #kodlarımız steplerimiz doğru ancak tab ın hızına yetişemedi ve hata verdi.Scenario:


    Examples:
      |firstName |  lastName| position| office|extension | startDate|salary |
      |erdem | tetik | TestLead |Paris |124   |2020-12-12 |800000 |
      |ali | veli | qa |çorum |19   |2023-01-29 |40000 |
      |nilay | dorsa | ba |van |55   |2019-07-30 |500000 |
