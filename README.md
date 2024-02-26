# StepQuest Fitness App

Turn your steps into rewards! Walk, earn, redeem.

## Overview

StepQuest is a fitness app designed to motivate users to stay active by rewarding them with virtual currency based on their daily step count. Users can register, log in, track their steps, and redeem their earned virtual currency for rewards.

## Features

- User registration and login
- Step tracking for earning virtual currency
- Redeem earned virtual currency for rewards
- Basic error handling for user-friendly experience

## Technologies Used

- Java
- Spring Boot
- Spring Security
- MySQL Database
- Maven
- Lombok

## Setup Instructions

To run the StepQuest app locally, you'll need to have the following installed:

1. Java Development Kit (JDK) version 17 or higher
2. Apache Maven
3. MySQL Server

### Database Configuration

1. Create a MySQL database named `stepquestdb`.
2. Update the `application.properties` file with your MySQL database connection details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/stepquestdb
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   spring.datasource.initialization-mode=always
   jwt.secret= // generate 256 authentication key   

## Running the Application

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

5. Access the application in your web browser at [http://localhost:8080](http://localhost:8080).

## Endpoints

- **GET /api/users**: Get all users.
- **GET /api/users/{id}**: Get user by ID.
- **POST /api/v1/auth/register**: Register a new user.
- **POST /api/v1/auth/authenticate**: Login as an existing user.

## Contributing

Contributions to the StepQuest project are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
