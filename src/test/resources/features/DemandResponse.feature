@BlogPost
Feature: Verify Demand Response functionality

  Background: User is logged in and is on Homepage
  	Given I am a logged in network user
  
  @SuccessfulAddBlogPost
  Scenario: Verify Program manager page.
    When I click on "Flex Charge Manager" link on the "Home" page
    Then I should land on the "Site Controllers Dashboard" page
    When I click on "Demand Response" link on the "Home" page
    Then I click on "Program Manager" link on the "Home" page
    Then I should land on the "Program Manager" page

  @ViewProfile
  Scenario: Verify create DR Program functionality.
    When I click on "Flex Charge Manager" link on the "Home" page
    Then I should land on the "Site Controllers Dashboard" page
    When I click on "Demand Response" link on the "Home" page
    Then I click on "Program Manager" link on the "Home" page
    And I click on "CreateDrProgram" button on the "Program Manager" page
    Then I should land on the "Add DR Program" page