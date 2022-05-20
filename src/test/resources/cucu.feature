Feature: validating login of adactin applications
@formal
  Scenario: validating login page with users
    Given user should launch ther" https://adactinhotelapp.com/"
    Given user should launch "<username>" and "<password>" and the login page
    When user should select the details "<location>","<hotels>","<roomType>","<no.of.rooms>", "<adults>","<childs>","<checkIN>","<checkOut>"
    Given user should select the hotel
    And user should enter the details "<firstName>","<lastName>","<address>","<creditCardNo>","<cardType>","<month>","<year>","<cvv>"
    Then user should get the OrderId
    Then user should select my itineraray
    And user should enter the detail "<search order id>"
    Then user should select the go
    Given user should selct the "<order id>"
    Then user should select cancel
    And user should click the alert
    @reg
Scenario: validating login with invalid username and password
Given user should launch ther" https://adactinhotelapp.com/"
When user enters "userName" and "password"
And user should click on login button
@smoke
 Scenario: validating login page with users  
  Given user should launch ther" https://adactinhotelapp.com/"
    Given user should launch "<username>" and "<password>" and the login page
    When user should select the details "<location>","<no.of.rooms>", "<adults>","<childs>","<checkIN>","<checkOut>"
    @sanity
     Scenario: validating login page with users  
  Given user should launch ther" https://adactinhotelapp.com/"
    Given user should launch "<username>" and "<password>" and the login page
        When user should select the details "<location>","<hotels>","<roomType>","<no.of.rooms>", "<adults>","<childs>","<checkOut>","<checkIN>"
    
    Examples: 
      | username   | password   | location | hotels      | roomType | no.of.rooms | adults  | childs  | firstName | lastName | address | creditCardNo     | cardType    | month | year | cvv |search order id |
      | nithinraje | 9876543210 | Paris    | Hotel Creek | Double   | 3 - Three   | 1 - One | 2 - Two | Alice     | Parker   | Chennai | 3698741254693214 | Master Card | May   | 2022 | 555 | 6M1390FD25      |
	