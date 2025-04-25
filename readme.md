# 📚 Book Management API

A simple RESTful API built with **Spring Boot** for managing a collection of books. This backend app supports all basic CRUD operations and serves data in JSON format using a relational database (e.g. MySQL, PostgreSQL, or H2).

---

## 🚀 Features

- Add, update, delete, and fetch book records
- Search books by title or author
- Filter only available books
- JSON-based request/response format
- Integrated with a DBMS using Spring Data JPA

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA
- **Build Tool:** Maven
- **Java Version:** 24

---

## 📦 API Endpoints

| Method | Endpoint              | Description                          |
|--------|-----------------------|--------------------------------------|
| GET    | `/books`              | Get list of all books                |
| GET    | `/books/{id}`         | Get details of a single book         |
| POST   | `/books`              | Add a new book                       |
| PUT    | `/books/{id}`         | Update a book's details              |
| DELETE | `/books/{id}`         | Delete a book
