//cookie-k kezelése
Background:
  Given I open BudapestGO website
  And I accept cookies

Scenario Outline: Change language
  Given the language is set to "<defaultLanguage>"
  When I change the language to "<newLanguage>"
  Then language is changed to <newLanguage>

  Examples:
  | defaultLanguage | newLanguage |
  | hungarian       | english     |
  | english         | hungarian   |

Scenario: Change language to english
  Given the language is set to "hungarian"
  When I change the language to "english"
  Then language is changed to english

Scenario: Change language to hungarian
  Given the language is set to "english"
  When I change the language to "hungarian"
  Then language is changed to hungarian

Scenario: Can change language multiple times
  Given the language is set to "hungarian"
  When I change the language multiple times to:
  | english   |
  | hungarian |
  | english   |
  Then language is changed to english