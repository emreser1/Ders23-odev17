Feature: As a User I want to fill and change the table with my data
  User clicks the "ADD" button and fill the table with data and changes this data

  Scenario: User clicks the ADD button and open the form
    Given Open the web site webtables
    When user clicks the ADD button
    Then open the table

  Scenario: Fill the Table with data
    When Enter data
    Then User clicks the submit button

  Scenario: Change age value in the table
    When User clicks edit button
    When user change age value as 45
    Then User clicks the submit button



