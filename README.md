# ProductFlow – Spring Boot Product Management API

## 🚀 Overview

ProductFlow is a RESTful Product Management API built using **Java, Spring Boot, Spring Data JPA, and MySQL**.

The project demonstrates real-world backend development concepts including CRUD operations, REST APIs, JPQL queries, searching, filtering, aggregation, subqueries, and bulk operations.

The backend is designed as the API layer for a full-stack Product Management System.

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* JPQL
* REST APIs
* Postman
* Maven

---

## 📌 Features

* Add a single product
* Add multiple products
* Get all products
* Get product by ID
* Update product
* Delete product
* Search products by name or category
* Filter products by price range
* Filter products by category and price
* Update product price
* Find the highest-priced product
* Count products by category
* CORS support for frontend integration

---

## 🗄️ Database Setup

### 1. Create Database

```sql
CREATE DATABASE productdb;
```

### 2. Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> Do not commit your actual database password to GitHub.

### 3. Run the Application

1. Start MySQL.
2. Configure your database credentials.
3. Run the Spring Boot application.
4. The application starts on port `8081`.

Base URL:

`http://localhost:8081/product`

---

## 🔗 API Endpoints

| Method | Endpoint                                                  | Description                  |
| ------ | --------------------------------------------------------- | ---------------------------- |
| POST   | `/product/add`                                            | Add a product                |
| POST   | `/product/addAll`                                         | Add multiple products        |
| GET    | `/product/allproducts`                                    | Get all products             |
| GET    | `/product/id/{id}`                                        | Get product by ID            |
| PUT    | `/product/update/{id}`                                    | Update a product             |
| DELETE | `/product/delete/{id}`                                    | Delete a product             |
| GET    | `/product/search?keyword=pen`                             | Search by name or category   |
| GET    | `/product/filter?min=100&max=5000`                        | Filter by price range        |
| GET    | `/product/category-price?category=electronics&price=1000` | Filter by category and price |
| GET    | `/product/update-price?id=1&price=2000`                   | Update product price         |
| GET    | `/product/highpriceproduct`                               | Get highest-priced product   |
| GET    | `/product/countbycategory`                                | Count products by category   |
| GET    | `/product/hello`                                          | Test API endpoint            |

---

## 💡 Concepts Covered

* Spring Boot
* REST API development
* Spring Data JPA
* Hibernate
* JPQL
* `@Query`
* Named parameters
* CRUD operations
* Search and filtering
* Aggregation using `GROUP BY`
* Subqueries
* Bulk update operations
* Exception handling
* CORS configuration

---

## 📂 Project Structure

```text
src
└── main
    ├── java
    │   └── com.product
    │       ├── controller
    │       ├── model
    │       ├── repo
    │       ├── service
    │       └── ProductAppApplication.java
    │
    └── resources
        └── application.properties
```

---

## 🧪 API Testing

The REST APIs can be tested using **Postman**.

Example:

```text
GET http://localhost:8081/product/allproducts
```

---

## ⚠️ Notes

* MySQL must be running before starting the application.
* Update the database username and password in `application.properties`.
* Do not commit real database credentials.
* The frontend will be integrated separately.

---

## 👩‍💻 Author

**Devi Kontham**

B.Tech Computer Science Engineering
