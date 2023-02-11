Feature: US1005 amazonda liste ile arama
@Outline
 Scenario Outline:TC09 amazonda verilen bir listeyi aratıp ,var oldukları test edin

   Given kullanıcı "amazonUrl" sayfasına gider
   Then "<arananUrun>" için arama yapar
   And  sonuc sayısını yazdırır
   And  sonucun "<arananUrun>" içerdiğini test eder
   Then sayfayı kapat

   Examples:
   |arananUrun|
   |nutella   |
   |java      |
   |armut     |
   |Apple     |