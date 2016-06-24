# te-coding-task-shylesh-yella
This repository contains task1 for Zalando. This document gives overview of the technologies and services used for development of the system

### Technologies and Services ###
* Selenium Web Driver 2.53.0
* Java 1.7 and above
* Maven 3.2.3
* TestNG 6.1.1
* Eclipse Helios and greater

### Installation ###

#### Git ####
* Download git https://git-scm.com/downloads

#### Maven ####
* Download Maven https://maven.apache.org/download.cgi
* Install Maven https://maven.apache.org/install.html

#### Firefox ####
* Install firefox version 42.0 https://ftp.mozilla.org/pub/firefox/releases/42.0/

##How to Run?##
Steps to Run:
* Clone the project into your local. git clone <Repository>
* Run commands:
 1.mvn clean
 2.mvn install -DtestNg=testng.xml

 ###OR###

* Run mvn clean, mvn install, mvn eclipse:eclipse commands
* Import the project into eclipse and run testng.xml file

### Scenarios Covered in Test Case ###
* Covered 6 scenarios for login

#### Scenario 1 ####
Username : Nousername
Password : Nopassword

#### Scenario 2 ####
Username : shylesh
Password : Nopassword

#### Scenario 3 ####
Username : shylesh
Password : shylesh

#### Scenario 4 ####
Username : Nousername
Password : shylesh

#### Scenario 5 ####
Username : zalando-lounge
Password : shylesh

#### Scenario 6 ####
Username : zalando-lounge
Password : SuperSecretPassword!




