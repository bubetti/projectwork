Scenario: Trip planning
      Given I open the landing page Budapest Go
      When I type "Keleti pályaudvar" into departure field
      When I type "Nyugati pályaudvar" into destination field
      When I click on the Search button
      Then possible routes should be displayed