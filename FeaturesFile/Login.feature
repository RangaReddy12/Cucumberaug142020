Feature: Verify Login
@loginsingledata
Scenario: Validate Login Module
When I open url in chrome browser
When i enter  username and  enter  password field
When I click on login button
Then i should verify url
Then I close browser
@loginmultipledata
Scenario Outline: Validate Login with multipedata
When Launch Url in "<Browser>" 
When Enter "<Username>" in username field
When Enter "<Password>" in password field
When Click on Login Button
Then Verify url Contains dashboard
Then Close browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|firefox|Admin|Qedge123!@#6|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
@Testdata
Scenario: login test
Given user launches url in chrome
When user enter username and password
When user click on login button


