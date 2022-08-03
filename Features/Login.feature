Feature: Login

Scenario: Login on QTS portal 
	Given User lauch Browser
	When User opens URL "https://master.dev.qtsdatacenters.com/portal/sdp-dashboard.do#/"
	And User enters UserId as "smahlstedt" and password as "today2021"
	And Click on login
	Then User would navigated to QTS portal
	