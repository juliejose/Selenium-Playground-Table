# README

## Overview

This Maven project automates a web table search test on the LambdaTest Selenium Playground. The project follows a modular design ([GitHub Repository](https://github.com/juliejose/Selenium-Playground-Table/tree/master/src/test/java)) with a base class for setup, a page class for search functionality, and a test class for execution. It validates the number of rows displayed after filtering the table with the keyword "New York."

## Project Structure

1. **Base Class (`BaseClass`)**:
   - Initializes the WebDriver and navigates to the target webpage.
   - Configures the browser with window maximization and implicit waits.

2. **Page Class (`SearchFun`)**:
   - Contains methods for interacting with the webpage, including searching for "New York" and verifying the results.
   - Implements the Page Object Model (POM) for better code organization.

3. **Test Class (`SearchTest`)**:
   - Executes the search functionality test using the methods defined in `SearchFun`.
   - Ensures proper teardown by quitting the browser after test execution.

## Approach

1. **Setup**:  
   - The `BaseClass` sets up the ChromeDriver, navigates to the webpage, and configures implicit waits.

2. **Core Logic**:  
   - The `SearchFun` class locates the search box using XPath, performs the search, and counts the rows in the table after applying the filter.
   - Validates whether the returned row count matches the expected count (5).

3. **Teardown**:  
   - The browser is closed after the test, ensuring no open sessions remain.

## Prerequisites

1. **Java Development Kit (JDK)**: Version 8 or later.  
2. **Maven**: Installed and configured on your system.  
3. **Chrome Browser and ChromeDriver**: Ensure ChromeDriver matches your browser version.  
4. **IDE**: Any Java IDE like IntelliJ IDEA, Eclipse, or VS Code with TestNG plugin.  

## How to Run

1. **Clone the Repository**:  
   Clone or download the project files to your local system.

2. **Set Up Dependencies**:  
   Ensure the `pom.xml` file includes dependencies for Selenium and TestNG, such as:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.x.x</version>
       </dependency>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.x.x</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   
3. **Install Dependencies**:
Navigate to the project directory and run:
mvn clean install
4. **Run the Test**:
Execute the SearchTest class using Maven:
mvn test
5. **View Output**:
The console will log the total row count and validation results.






