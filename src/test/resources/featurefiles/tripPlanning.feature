Feature: Trip planning

  Rule: User can plan a trip from A (start location) to B (destination)

    Background:
      Given I open BudapestGO website
      And I accept cookies

    Scenario: Trip planning
      When I plan a trip from "Keleti pályaudvar" to "Nyugati pályaudvar"
      Then possible routes should be displayed