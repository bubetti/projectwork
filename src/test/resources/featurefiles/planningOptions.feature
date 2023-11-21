Feature: Planning options

  Rule: User can choose preferred mode of transportation

    Example: User prioritizes walk and subway
      When the user specifies "walk" and "subway"
      Then the trip planner should prioritize routes using that mode

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

