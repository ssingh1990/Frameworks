@Profile
Feature: View/Edit Profile
  As a Registered User of the application
  I want to view and update my profile
  
  Background: User is logged in and is on Homepage
    Given I am a logged in network user
  	And I navigate to the "Add DR Program" page

	@ViewProfile
  Scenario: Successful View Profile
    When I click on "My Profile" link on the "Home" page
    Then I should land on the "My Profile" page
    And I should see "Your Profile" heading on the Profile page
    And "My Profile" link should be active on the Profile page
    And "User Name" field should be prepopulated and set as "readonly" on the Profile page
    And "email" field should be prepopulated on the Profile page


  Scenario Outline: Verify Successful create DR Program
    And I fill in First Name as "<firstname>"
    And I fill in program Type as "<programType>"
    And I fill in Utility as "<utility>"
    And I select start date as "<currentdate>"
    And I select end date as "<currentdate>"
    And I select status "<status>"
    And I click on the "Create" button
#    Then I should land on the "Home" page
#    And I should see "success" message as "Profile updated successfully!"
  Examples:
    | firstname    | programType   | utility	|	currentdate	|	status	|
    | Sat        | Passthru			 	| PGE2	| 28/11/2018		|	Active		|
    
    