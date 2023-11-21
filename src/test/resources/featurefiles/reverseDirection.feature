Feature: Reverse direction

Rule: User can reverse the direction of the planned route

  Scenario: User reverses the direction of the planned route
    When I click on the option to reverse the route
    Then the trip planner should display a route from "End Location" to "Start Location"
    And the route details should be updated accordingly