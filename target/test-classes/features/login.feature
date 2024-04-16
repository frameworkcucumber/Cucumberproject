Feature: To Validate Login Funtionality Of Faceook application

  Background: 
    Given user should be in login page

  @sanity
  Scenario Outline: To Validate login with invalid username and invalid password
    When user should enter invalid "<username>" and invalid "<password>"
    And user clicks login button
    Then user will  navigate to invalid credential page

    Examples: 
      | username | password |
      | Java     | java     |
      | Selenium | selenium |

  @smoke
  Scenario: To validate login with empty username and empty password
    When user should click login button
    Then user will redirect to invalid credential page
