# QuePokemono

**QuePokemono** is an API developed with Spring Boot that uses GraphQL to determine which Pokémon you are, based on the answers to a 5-question survey.

## Features

- **REST API**: Implemented with Spring Boot.
- **GraphQL**: For handling data queries.
- **Hibernate & JPA**: For data persistence management.
- **Unit Testing**: With Spring Boot Test and Mockito.
- **Java 11**: The project is developed using Java 11.

## Functionality

1. The user answers 5 questions related to Pokémon traits.
2. The API analyzes the responses and returns the Pokémon that most closely matches the provided characteristics.
3. Uses GraphQL to handle the API requests and responses.

## Technologies Used

- **Java 17**: Programming language used.
- **Spring Boot**: Framework for building the API.
- **Spring Data JPA**: For data management with Hibernate.
- **GraphQL**: For handling queries.
- **Mockito**: For unit testing.
- **GitHub Actions**: For continuous integration.

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/SrIrvin/QuePokemono.git 
   ```
2. Navigate to the project directory:
   ```bash
   cd QuePokemono
   ```

3. Build the project with Maven:
   ```bash
   mvn clean install
   ```
3. Build the project with Maven:
   ```bash
   mvn spring-boot:run
   ```

