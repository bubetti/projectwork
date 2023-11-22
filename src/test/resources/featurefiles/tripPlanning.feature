Feature: Trip planning

  Rule: User can plan a trip from A (start location) to B (destination)

    Background:
      Given I open BudapestGO website
      And I accept cookies

    Scenario: Trip planning
      When I search for "Keleti pályaudvar" as start location
      And I search for "Nyugati pályaudvar" as destination
      And I click on the Search button
      Then possible routes should be displayed