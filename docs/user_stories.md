# User Stories
_Budapest GO_

1. **Feature**: Accept cookies on website

    Rule: Cookies can be accepted by clicking on a button

    Example: I accept cookies
    Given I open BudapestGO
    When I accept cookies
    Then the cookies are accepted and I can proceed to landing page

2. **Feature**: Language Selection on website
    As a user
    I want to change the language of the website
    So that I can navigate the content in my preferred language

    Rule: Language of the website can be changed to the preferred language
 
   Scenario Outline: Change language
   Given the language is set to "<defaultLanguage>"
   When I change the language to "<newLanguage>"
   Then language is changed to <newLanguage>
   Examples:
   | defaultLanguage | newLanguage |
   | hungarian       | english     |
   | english         | hungarian   |

   Example: Change language to english
   Given the language is set to "hungarian"
   When I change the language to "english"
   Then language is changed to english

   Example: Change language to hungarian
   Given the language is set to "english"
   When I change the language to "hungarian"
   Then language is changed to hungarian

   Example: Can change language multiple times
   Given the language is set to "hungarian"
   When I change the language multiple times to:
   | english   |
   | hungarian |
   | english   |
   Then language is changed to english

3. **Feature**: Trip planning from A to B

   Rule: User can plan a trip from A to B
   Example:
   Given I open the landing page Budapest GO
   When I type "Keleti pályaudvar" into departure field
   When I type "Nyugati pályaudvar" into destination field
   When I click on the Search button
   Then possible routes should be displayed

4. **Feature**: Reverse direction

    Rule: User can reverse the direction of the planned route

   Scenario: User reverses the direction of the planned route
   When I click on the option to reverse the route
   Then the trip planner should display a route from "End Location" to "Start Location"
   And the route details should be updated accordingly

5. **Feature**: Planning options
    Rule: User can specify preferred mode of transportation
   
    Scenario Outline: User specifies preferred mode of transportation
    Given the trip planner is open
    When the user specifies "<transport_mode>"
    Then the trip planner should prioritize routes using that mode

    Examples:
    | transport_mode       |
    | walk                 |
    | subway               |
    | suburban railway     | 
    | ferry                |
    | tram                 |
    | trolleybus           |
    | bus                  |
    | rail                 |
    | regional bus         |

   Example: User prioritizes walk and subway
   When the user specifies "walk" and "subway"
   Then the trip planner should prioritize routes using that mode