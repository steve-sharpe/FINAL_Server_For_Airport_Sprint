# Airline Management Server

## Overview
The Airline Management Server is a Java-based application that provides a RESTful API for managing airline-related data. It consists of four primary entities: Aircraft, Airport, City, and Passenger. Each entity has its own service, repository, and controller classes to handle business logic, data persistence, and HTTP requests, respectively.

## Entities
1. **Aircraft**
    - Represents an aircraft in the airline system.
    - Attributes:
        - `id`: Unique identifier for the aircraft (auto-generated).
        - `type`: Type of the aircraft (e.g., commercial, private).
        - `airlineName`: Name of the airline operating the aircraft.
        - `numberOfPassengers`: Maximum number of passengers the aircraft can accommodate.
    - Relationships:
        - Many-to-One relationship with Airport (an aircraft belongs to one airport).
        - One-to-Many relationship with Passenger (an aircraft can have multiple passengers).

2. **Airport**
    - Represents an airport where aircraft are stationed.
    - Attributes:
        - `id`: Unique identifier for the airport (auto-generated).
        - `name`: Name of the airport.
        - `code`: IATA code for the airport.
        - `city`: The city where the airport is located.
    - Relationships:
        - One-to-Many relationship with Aircraft (an airport can have multiple aircraft).

3. **City**
    - Represents a city that contains one or more airports.
    - Attributes:
        - `id`: Unique identifier for the city (auto-generated).
        - `name`: Name of the city.
        - `population`: Population of the city.
    - Relationships:
        - One-to-Many relationship with Airport (a city can have multiple airports).

4. **Passenger**
    - Represents a passenger who travels on an aircraft.
    - Attributes:
        - `id`: Unique identifier for the passenger (auto-generated).
        - `firstName`: First name of the passenger.
        - `lastName`: Last name of the passenger.
        - `phoneNumber`: Contact phone number of the passenger.
    - Relationships:
        - Many-to-One relationship with Aircraft (a passenger can be associated with one aircraft).

## Architecture
- Each entity has a corresponding Service class that contains business logic.
- Each entity has a Repository interface that handles data operations using Spring Data JPA.
- Each entity has a Controller class that exposes RESTful endpoints for CRUD operations.

## Setup
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Build the project**:
   Ensure you have Maven installed and run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   After building the project, run the application using:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**:
   The REST API will be accessible at `http://localhost:8080`. You can use tools like Postman or curl to interact with the endpoints.

## Usage
The API allows you to perform the following operations for each entity:
- Create, Read, Update, and Delete (CRUD) operations.

### Example Endpoints
- **Aircraft**:
    - `GET /api/aircraft` - List all aircraft
    - `POST /api/aircraft` - Create a new aircraft
    - `GET /api/aircraft/{id}` - Get aircraft by ID
    - `PUT /api/aircraft/{id}` - Update aircraft by ID
    - `DELETE /api/aircraft/{id}` - Delete aircraft by ID

- **Airport**:
    - `GET /api/airports` - List all airports
    - `POST /api/airports` - Create a new airport
    - `GET /api/airports/{id}` - Get airport by ID
    - `PUT /api/airports/{id}` - Update airport by ID
    - `DELETE /api/airports/{id}` - Delete airport by ID

- **City**:
    - `GET /api/cities` - List all cities
    - `POST /api/cities` - Create a new city
    - `GET /api/cities/{id}` - Get city by ID
    - `PUT /api/cities/{id}` - Update city by ID
    - `DELETE /api/cities/{id}` - Delete city by ID

- **Passenger**:
    - `GET /api/passengers` - List all passengers
    - `POST /api/passengers` - Create a new passenger
    - `GET /api/passengers/{id}` - Get passenger by ID
    - `PUT /api/passengers/{id}` - Update passenger by ID
    - `DELETE /api/passengers/{id}` - Delete passenger by ID

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any changes you make.

## Contact
For any inquiries or issues, please contact [Your Name] at [your-email@example.com].
