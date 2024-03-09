Feature: Random Activity Suggestion
  As a user feeling bored,
  I want to receive random activity suggestions from an API service
  so that I can engage in activities that help me pass the time and alleviate boredom.

  Scenario Outline: verify user feeling api schema is return as expected
    Then  validate that random activity suggestion with endpoint "<endpoint>" and status code "<statusCode>" return schema as expected
    Examples:
      | endpoint | statusCode |
      | activity |  200       |

