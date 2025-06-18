# Quarks_Technical_Assessment

# Simple REST API - User Management

This is a simple REST API built with **Java** and **Spring Boot** for managing users. It allows you to:

- Create a new user with a name and email
- Retrieve a user by ID

> Data is stored in memory (using a `ConcurrentHashMap`) — no database is required.

##  Tech Stack
- Java 17
- Spring Boot 3.5.0
- Maven
- Swagger (Springdoc OpenAPI)
## How to Run
### Prerequisites

- Java 17+
- Maven 3.6+

### Steps
```bash
# Clone the repository
git clone https://github.com/uwinezaflorence20/Quarks_Technical_Assessment.git
cd Quarks_Technical_Assessment

# Build and run the app
./mvnw spring-boot:run
