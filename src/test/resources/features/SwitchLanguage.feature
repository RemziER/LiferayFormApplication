Feature: Language switching
  @smoke
  Scenario: Switching from English to Portuguese
    Given the user is on the form page
    When the user clicks language logo
    And the user clicks Portuguese option
    Then the language of the form page should be Portuguese
  @smoke
  Scenario: Switching from Portuguese to English
    Given the user is on the Portugurse form page
    When the user clicks language logo
    And the user clicks English option
    Then the language of the form page should be English