Login and Registration Web Application (Spring Boot)
Project Overview

This project is a Login and Registration Web Application developed using Spring Boot and MySQL.
It provides basic authentication functionality where users can register, log in, view a dashboard, and log out securely using session management.

The project was initially implemented using Servlets and Apache Tomcat, and later migrated to Spring Boot to follow modern industry standards.

Technologies Used
Backend

Java 17

Spring Boot

Spring MVC

Spring Data JPA

Hibernate ORM

Frontend

HTML

CSS (internal styling)

Thymeleaf template engine

Database

MySQL

Build and Tools

Maven (via Maven Wrapper)

Embedded Apache Tomcat

Git and GitHub

Application Features

User Registration

User Login Authentication

Error message for invalid login credentials

Session-based authentication

Logout functionality

Protected dashboard page

Database-driven user management

Clean MVC architecture

Project Architecture

The project follows the MVC (Model–View–Controller) architecture:

Model
Represents the database structure using JPA entities.

View
HTML pages rendered using Thymeleaf.

Controller
Handles HTTP requests, business logic, and page navigation.

Project Structure
loginapp
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src
    └── main
        ├── java
        │   └── com.rohith.loginapp
        │       ├── LoginappApplication.java
        │       ├── controller
        │       │   ├── LoginController.java
        │       │   └── RegisterController.java
        │       ├── model
        │       │   └── User.java
        │       └── repository
        │           └── UserRepository.java
        └── resources
            ├── application.properties
            └── templates
                ├── login.html
                ├── register.html
                └── dashboard.html

Screenshots:
<img width="1919" height="1063" alt="Screenshot 2025-12-27 164208" src="https://github.com/user-attachments/assets/3fb87160-c40f-4ad7-ad56-e104b3be2aa3" />
<img width="1913" height="1145" alt="Screenshot 2025-12-27 164147" src="https://github.com/user-attachments/assets/4c80d4db-fe28-46ef-adde-0feb80ed434c" />
<img width="1919" height="1148" alt="Screenshot 2025-12-27 163852" src="https://github.com/user-attachments/assets/c0243f08-15ac-406f-b223-f63372bf3a24" />

