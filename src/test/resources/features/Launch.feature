Feature: Launch browser

  Scenario: Launch webpage
    Given I launch my website
    When I click Aboutme
    Then I should be on AboutMe page

  Scenario: Validate Search result
    Given I launch the testing website
    When Enter Cucumber in the Search box
    Then Verify the search result shows Cucumber

    Scenario: Validate the tagline text
      Given I lauch my testing website
      When Verify the tagline is displayed
      Then Verify the tagline text



