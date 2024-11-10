Question Application
A Spring Boot-based application that allows users to manage and retrieve quiz questions. It provides a REST API to fetch a list of all quiz questions from a database.

Features
- CRUD Operations: Basic database operations for quiz questions using JPA (Java Persistence API).
- REST API: Exposes endpoints to access quiz questions.
- Spring Boot: Built using the Spring Boot framework for ease of development and deployment.
  
Technologies Used
- Spring Boot: Framework for building the application.
- Spring Data JPA: For database interactions with the quiz_questions entity.
- H2 Database: (or another database, if you prefer) to store the quiz questions.
- Lombok: To reduce boilerplate code by generating getters, setters, and other methods.
- Jakarta Persistence (JPA): For object-relational mapping.
- RESTful APIs: To expose endpoints for interacting with the application.

Project Structure
- com.example.question_Application: Root package.
- Controller: Contains REST API controller (QuestionController).
- Dao: Interface for interacting with the database (QuestionDao).
- Service: Contains the business logic (QuestionService).
- quiz_questions: Entity representing the quiz question.


Setup
- Clone the repository:
git clone https://github.com/your-username/question-application.git
cd question-application

Build the project: If you're using Maven:
- mvn clean install

If you're using Gradle:
- gradle build

Run the application:
- mvn spring-boot:run

or if you're using Gradle:
- gradle bootRun

The application will run on http://localhost:8080.

Test the API: Use a tool like Postman or Curl to make requests to the following endpoint:

GET http://localhost:8080/question/allQuestion: Fetches a list of all quiz questions.

Example Response:

[
{
        "id": 1,
        "category": "Science",
        "difficultyLevel": "Medium",
        "option1": "A",
        "option2": "B",
        "option3": "C",
        "option4": "D",
        "QuestionTitle": "What is the chemical symbol for water?",
        "wrightAns": "A"
    },
    {
        "id": 2,
        "category": "Math",
        "difficultyLevel": "Easy",
        "option1": "1",
        "option2": "2",
        "option3": "3",
        "option4": "4",
        "QuestionTitle": "What is 2 + 2?",
        "wrightAns": "B"
    }
]

Contributing:

- Fork the repository.
- Create your feature branch (git checkout -b feature-name).
- Commit your changes (git commit -am 'Add new feature').
- Push to the branch (git push origin feature-name).
- Create a new Pull Request.
