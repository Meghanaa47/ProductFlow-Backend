# Spring Boot Product API (JPQL + MySQL)

## 🚀 Overview

This project is a RESTful API built using Spring Boot and Spring Data JPA. It demonstrates CRUD operations along with advanced JPQL queries such as filtering, searching, aggregation, and bulk operations.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Postman

---

## 📌 Features

* Add single & multiple products
* Get all products / product by ID
* Update & delete product
* Search products by keyword (name/category)
* Filter products by price range
* Category + price filtering
* Update price using JPQL
* Get highest price product (subquery)
* Count products by category (GROUP BY)

---

## 🗄️ Database Setup (MySQL)

### 1️⃣ Create Database

```sql
CREATE DATABASE product_db;
```

---

### 2️⃣ Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

### 3️⃣ Run the Application

* Start your MySQL server
* Run the Spring Boot application
* Tables will be created automatically

---

## 🔗 API Endpoints

### Add Product

POST /product/add

### Add Multiple Products

POST /product/addAll

### Get All Products

GET /product/allproducts

### Get Product By ID

GET /product/id/{id}

### Update Product

PUT /product/update/{id}

### Delete Product

DELETE /product/delete/{id}

### Search Products

GET /product/search?keyword=pen

### Filter by Price Range

GET /product/filter?min=100&max=5000

### Category + Price Filter

GET /product/category-price?category=electronics&price=1000

### Update Price

PUT /product/update-price?id=1&price=2000

### Get Highest Price Product

GET /product/highpriceproduct

### Count by Category

GET /product/countbycategory

---

## 💡 Concepts Covered

* JPQL Queries
* @Query Annotation
* Named Parameters
* Aggregation (GROUP BY)
* Subqueries
* Bulk Operations
* REST API Design

---

## ⚠️ Notes

* Ensure MySQL is running before starting the application
* Update database credentials in application.properties
* Use Postman to test APIs

---

## 👩‍💻 Author

Devi Kontham
