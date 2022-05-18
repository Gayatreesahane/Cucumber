Feature: login feature

  Scenario Outline: flipkart login scenario
    Given user navigate to the application url
  #  When title of login page is "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"
    Then user enters "<mobile_no>" and "<password>"
    Then user clicks on login button
    And user is on home page

    Examples:
      | mobile_no  | password    |
      | 1122667799 | 1245gaga    |
      | 8169834449 | G@yatree123 |

