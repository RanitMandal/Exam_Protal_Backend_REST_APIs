# Exam Portal Backend REST APIs

Welcome to the Exam Portal Backend REST APIs project! This project provides a set of RESTful web services for managing an online exam platform. It is built using Spring Boot, making it easy to set up and run.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [System Requirements](#system-requirements)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Overview

This project serves as the backend for an online exam portal. It facilitates operations related to exam management, including the creation, modification, and deletion of exams and questions. It also handles user authentication and authorization using Spring Security.

## Features

- User authentication and authorization
- CRUD operations for exams and questions
- CRUD operations for users
- JSON format for all API responses and requests
- Pagination and sorting for exam lists
- Search functionality for exams and questions
- Comprehensive exception handling

## System Requirements

Ensure you have the following installed on your system:

- Java 11 or higher
- Maven 3.6.3 or higher
- MySQL database (or any other relational database)

## Setup

To get started, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone https://github.com/RanitMandal/Exam_Protal_Backend_REST_APIs.git
    cd Exam_Protal_Backend_REST_APIs
    ```

2. **Configure the database:**

    Update the `application.properties` file located in the `src/main/resources` directory with your database configuration.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the application:**

    ```bash
    mvn clean install
    ```

## Running the Application

To start the application, execute the following command:

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080/api`.

## Endpoints

The API endpoints are documented using Swagger. After starting the application, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

### User Management APIs

- **Register a new user:**

    ```http
    POST /api/users/register
    Content-Type: application/json

    {
        "username": "newuser",
        "password": "password123",
        "email": "newuser@example.com"
    }
    ```

- **Login a user:**

    ```http
    POST /api/users/login
    Content-Type: application/json

    {
        "username": "newuser",
        "password": "password123"
    }
    ```

- **Get user details:**

    ```http
    GET /api/users/{userId}
    ```

- **Update user details:**

    ```http
    PUT /api/users/{userId}
    Content-Type: application/json

    {
        "username": "updateduser",
        "email": "updateduser@example.com"
    }
    ```

- **Delete a user:**

    ```http
    DELETE /api/users/{userId}
    ```

### Exam Management APIs

- **Create a new exam:**

    ```http
    POST /api/exams
    Content-Type: application/json

    {
        "title": "Final Exam",
        "description": "End of semester final exam",
        "duration": 120
    }
    ```

- **Get exam details:**

    ```http
    GET /api/exams/{examId}
    ```

- **Update exam details:**

    ```http
    PUT /api/exams/{examId}
    Content-Type: application/json

    {
        "title": "Updated Final Exam",
        "description": "Updated description",
        "duration": 90
    }
    ```

- **Delete an exam:**

    ```http
    DELETE /api/exams/{examId}
    ```

### Question Management APIs

- **Add a question to an exam:**

    ```http
    POST /api/exams/{examId}/questions
    Content-Type: application/json

    {
        "text": "What is the capital of France?",
        "type": "MCQ",
        "options": ["Paris", "London", "Berlin", "Madrid"],
        "answer": "Paris"
    }
    ```

- **Get question details:**

    ```http
    GET /api/questions/{questionId}
    ```

- **Update question details:**

    ```http
    PUT /api/questions/{questionId}
    Content-Type: application/json

    {
        "text": "Updated question text",
        "type": "MCQ",
        "options": ["Option 1", "Option 2", "Option 3", "Option 4"],
        "answer": "Option 1"
    }
    ```

- **Delete a question:**

    ```http
    DELETE /api/questions/{questionId}
    ```

## Contributing

We welcome contributions! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature/your-feature`).
6. Create a pull request.

## License

This project is licensed under License.

## Contact

For any questions or suggestions, please contact the project maintainer:

- Name: Ranit Mandal
- Email: ranitmandal17@gmail.com
---

Thank you for using the Exam Portal Backend REST APIs! Happy coding!
