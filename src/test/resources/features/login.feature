Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given user launches the application
    When user enters username "admin" and password "WigitrU*ey+p$st3"
    Then user should see the dashboard
