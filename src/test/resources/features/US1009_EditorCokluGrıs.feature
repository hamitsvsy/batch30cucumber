@editor3
Feature: US1009 editor sayfasında gırıs yapılabildiğini test et


Scenario Outline: TC13  editor sayfasına farklı kişiler ekleme

  Given kullanıcı "editorUrl" sayfasına gider
  Then new butonuna basar
  And editor firstname kutusuna "<firstName>" bilgileri girer
  And editor lastname kutusuna "<lastName>" bilgileri girer
  And editor position kutusuna "<position>" bilgileri girer
  And editor office kutusuna "<office>" bilgileri girer
  And editor extension kutusuna "<extension>" bilgileri girer
  And editor startdate kutusuna "<startDate>" bilgileri girer
  And editor salary kutusuna "<salary>" bilgileri girer
  And Create tusuna basar
  Then "<firstName>" ve  "<lastName>" girerek kaydın tamamlandığını test eder





  Examples:
    |firstName |  lastName| position| office|extension | startDate|salary |
    |erdem | tetik | TestLead |Paris |124   |2020-12-12 |800000 |
    |ali | veli | qa |çorum |19   |2023-01-29 |40000 |
    |nilay | dorsa | ba |van |55   |2019-07-30 |500000 |

