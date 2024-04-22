Problem Statement : Identify Courses
 
Search and display all web development courses 
1. Should be for beginners level.
2. Courses offered in English language
3. Display first two courses with name, total learning hours and rating.
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)
 
 
Detailed Description:
 
1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them
3. In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)
 
 
Key Automation Scope
 
Handling different browser windows, search option
Extract multiple drop down list items & store in collections
Navigating back to home page
Filling form (in different objects in web page)
Capture warning message
Scrolling down in web page
 
 
*********************************STEPS TO EXECUTE*********************************
 
-> unzip the folder
-> On eclipse, goto file-> import-> select maven-> click on existing maven project->next-> browse the location where u unzip the folder-> click on finish
-> Now go to the testng.xml file and run as TestNGSuite.
-> Now the file will Execute and we get the expected output as shown below.

 
 
*********************************FILES DESCRIPTION*********************************

1. src/test/java - There are 8 packages present in this folder.
 
-> pageobject : Page Object containing different class contains which are BasePage,HomePage,FirstCoursePage,SecondCoursePage,LanguagelePage,FillingFormPage.
 
-> test_base:In this package we have BaseClass.java is our main project file in which we Firstly invoke the selected browser and generate the report file in html format and store it in report opening Coursera website [Cousera](https://www.coursera.org/) and closing the browser
 
-> test_cases:In this package we have TC001, TC002, TC003 java files which extends baseClass.java where the methods are present which will login to the page and verify and validate all the testCases.
 
-> utilities: In the utilities package all the write work of and extent report work is done.
 
-> Course : This package contains the selenium file of the project
 
 
2. src/test/resources- In this folder, there are three files
->  config.properties  : This file is used to store the reusable values such as apprl,browser name and os name.
->  log4j2.xml  : This file is used to generate log informations about the execution of test cases.

3. JRE System Library: In this File we have all dependencies of JAR.files.         

4. Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5. Report: In this folder the Test-Report-YYYY.MM.DD.html is present which is the report of the project

6. ScreenShots 
 
7. src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder
8. target: It is an empty folder
 
9. Feature Files : In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project in cucumber framework.

10. Logs : In this folder logs are present which is generated while executing the project.
 
11. TestData : In this folder we have one file
	-Write  : After the execution of project the result will be stored.
12. pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 

 
*********************************OUTPUT*********************************
 
***TestNG***
 
RemoteTestNG] detected TestNG version 7.9.0
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
-----------------Course No:1------------------
Python for Data Science, AI & Development
Rating: 4.6
26 hours (approximately)
-----------------Course No:2------------------
Meta Front-End Developer
4.7
7 months at 6 hours a week

****************************************************
LANGUAGES:

Total number of languages available: 24
English (1,665)
Spanish (1,099)
Arabic (1,010)
French (995)
Chinese (China) (991)
Portuguese (Brazil) (986)
Japanese (979)
Korean (977)
German (975)
Indonesian (974)
Hindi (970)
Italian (969)
Swedish (968)
Dutch (967)
Greek (967)
Polish (967)
Thai (967)
Turkish (967)
Ukrainian (967)
Russian (944)
Kazakh (895)
Hungarian (696)
Chinese (Traditional) (5)
Hebrew (2)

****************************************************
LEVEL:

Total number of level available: 4
Beginner (897)
Intermediate (788)
Advanced (80)
Mixed (147)

Must be valid email.
example@yourdomain.com

===============================================
Suite
Total tests run: 21, Passes: 21, Failures: 0, Skips: 0
===============================================






    