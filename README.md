
# Student Course Registration System

A REST API application developed using Java and Spring Boot to manage student course registrations.

## Technologies Used
- Java 27
- Spring Boot
- Spring Web
- Bean Validation
- Lombok
- Maven

## Student Fields
- studentId
- studentName
- courseName
- email
- age

## Validations
- Student name cannot be empty.
- Email must be valid.
- Age must be at least 18.

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/students` | Register a student |
| GET | `/api/students` | View all students |
| GET | `/api/students/{id}` | Find student by ID |
| DELETE | `/api/students/{id}` | Delete registration |

## How to Run
1. Import the project into Spring Tool Suite (STS).
2. Wait for Maven dependencies to download.
3. Run `StudentCourseRegistrationSystemApplication.java`.
4. The application runs on `http://localhost:8080`.

## Testing
Test the REST APIs using Postman.

## Note
Student details are stored temporarily in an in-memory list. Data is cleared when the application restarts.
