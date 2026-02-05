# Item Management REST API

## Description
This is a simple Java Spring Boot REST API for managing items using an in-memory data store (ArrayList).

## Features
- Add a new item
- Fetch an item by ID
- Input validation using Jakarta Validation
- RESTful design

## Technologies Used
- Java
- Spring Boot
- Maven

## How to Run
1. Clone the repository
2. Run `mvn spring-boot:run`
3. Application starts at `http://localhost:8080`

## API Endpoints

### Add Item
POST /api/item/add  
Request Body:
{
"id": 802,
"name": "Laptop",
"description": "Gaming laptop",
"price": 75000,
"category": "Electronics",
"stockQuantity": 30
}

### Get Item by ID
GET /api/item/{id}

## Notes
- Data is stored in-memory using ArrayList.
- Data will be lost when the application stops.
