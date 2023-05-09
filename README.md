# CS5103-SoftwareEngineering
# By: Vanshika

## Project: Word Statistics!
### Description

In this project, the application first computes word statistics for a supplied string. It begins by taking a string as input and calculating the frequency of each unique word. After receiving the user's input string, the program returns the quantity of distinct word occurrences. Even if the string contains spaces, tabs, or new lines, word statistics nevertheless returns the frequency of each word. Word statistics also accepts spaces, tabs, and new lines as seperators.

Then the project is extended with a feature which is to provide a replacement word for all occurences of a word in the string. So, first the program takes an input string, the word to replace and asks the user for the word that has to be in the place of replacement word. Then it returns the final string with word to be replaced given. Also the program only replaces the given word when it matches with the whole replacement word and not just the characters.

### Implementation
The computer program applies a number of string manipulation operations to a text in order to collect statistics about the words included therein. The application is expanded to carry out a number of sophisticated tasks when we first identify the unique terms and their frequency.

### Design
Initial design of this project displays a welcome output and the first requirement i.e. "Word counter" as choice 1. and 2 as "exit the app" to close the program. To execute first program, after executing the main project we enter 1 and execute then it asks for the required strings to perform the first requirement completely.

Then the second feature is added as "Word replacement" as choice 2 just like first. To perform second requirement completely, we enter 2 and execute. And then it asks for the words to replace in the string. Also, the feature "exit the app" shifts to no 3 after adding the second program.

### Environment

This is a standalone Java application that is built using Gradle. The Gradle build system is easy to setup and takes care of managing dependencies (libraries needed by the application) using a declarative language.

### Testing
For static bug detection and code clone detection, I made use of Sonarqube. SonarSource developed SonarQube, an open-source platform for finding bugs and bad code in more than 20 programming languages through static code analysis and continuous code quality assessment.

![Screenshot 1](https://github.com/vanshika1009/CS5103-SoftwareEngineering/blob/main/Software%20Engineering%20screenshots/1.jpeg)


![Screenshot 2](https://github.com/vanshika1009/CS5103-SoftwareEngineering/blob/main/Software%20Engineering%20screenshots/2.jpeg)


![Screenshot 3](https://github.com/vanshika1009/CS5103-SoftwareEngineering/blob/main/Software%20Engineering%20screenshots/3.jpeg)


![Screenshot 4](https://github.com/vanshika1009/CS5103-SoftwareEngineering/blob/main/Software%20Engineering%20screenshots/4.jpeg)


### Unit Test

All the unit tests executed successfully and are given in the directory ./src/test/java/CS5103


