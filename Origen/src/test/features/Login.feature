Feature: LoginFeature

  Scenario: Login with correct username and password
    Given I navigate to the login page
    #And I ente the users email adress as Email: admin
    #And I verify the cpount of my salary digital for is 1000
    #And I enter the username as "admin" and password as "adminpassword"
    And I enter the following for login
      | UserName | Password      |
      | admin    | adminPassword |
    And I click login button
    Then I should see the userfrom page
















#  Scenario Outline: Login with correct username and password using scenario outline
#    Given I navigate to the login page
#    And I enter <username> and <password>
#    And I click login button
#    Then I should see the userfrom page
#
#    Examples:
#      | username | password      |
#      | execute    | automation |
#      | execute1    | automation1 |
#      | execute2    | automation2 |