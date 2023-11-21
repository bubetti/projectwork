Feature: Trip planning

      Rule: User can plan a trip from A (Start Location) to B (End Location)

            Background:
            Given I open BudapestGO website
            And I accept cookies

Scenario: Trip planning
      When I search for "Keleti pályaudvar" as Start Location
      And I search for "Nyugati pályaudvar" as End Location
      And I click on the Search button
      Then possible routes should be displayed