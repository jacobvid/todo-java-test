
# Todo Java Test Project

This is a simple Java-based Todo List application with automated testing using JUnit and Cucumber.

## Project Structure

```
todo-app/
 ├── src/
 │    ├── main/java/com/todo/App.java        # Main Todo application code
 │    └── test/
 │         ├── java/com/todo/
 │         │     ├── AppTest.java            # Unit tests with JUnit
 │         │     ├── TodoSteps.java          # Step definitions for Cucumber
 │         │     └── RunCucumberTest.java    # Cucumber test runner
 │         └── resources/features/
 │               └── todo.feature            # Gherkin feature file
 └── pom.xml                                 # Maven project file
```

## Features
- Java-based Todo List functionality
- Unit testing with **JUnit**
- Behavior-driven testing with **Cucumber** (Gherkin syntax)
- Project managed with **Maven**

## Getting Started

1. Clone the repository:
```
git clone https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git
cd YOUR_REPO_NAME
```

2. Run the application (optional):
```
mvn compile exec:java -Dexec.mainClass="com.todo.App"
```

3. Run the automated tests:
```
mvn test
```

## Technologies Used
- Java 11+
- Maven
- JUnit 4.13.2
- Cucumber 7.15.0
- Selenium (optional for UI tests)

## Author
**Jacob Vidergar**  
vidergarjm@gmail.com

## License
This project is licensed under the MIT License.
