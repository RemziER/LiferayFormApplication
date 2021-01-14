Feature: Submitting the form
  @smoke
  Scenario Outline: The user submits the form with complete information
    Given the user is on the form page
    When the user enters "<name>" "<dateOfBirth>" "<comment>"
    And the user clicks submit button
    Then Information sent page should be open
    And "Information sent successfully!" message should be displayed
    Examples:
      |name |dateOfBirth|comment                       |
      |Remzi|07/09/1986|Testing is my passion          |
      |Moses|01/01/2000|Testing is fun                 |
      |Elena|10/10/2010|I love testing                 |
    @smoke
    Scenario Outline: The user submits the form with incomplete information
      Given the user is on the form page
      When the user enters "<name>" "<dateOfBirth>" "<comment>"
      And the user clicks submit button
      Then "This field is required." message should be displayed under the empty input box
      Examples:
        |name |dateOfBirth|comment                       |
        |     |07/09/1986|Testing is my passion          |
        |Moses|          |Testing is fun                 |
        |Elena|10/10/2010|                               |

