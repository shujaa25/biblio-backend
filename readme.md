# 📚 Book Management API

A simple RESTful API built with **Spring Boot** (Java 24) for managing a collection of books. This backend app supports all basic CRUD operations and serves data in JSON format using a **PostgreSQL** database.

---

## 🚀 Features

- Add, update, delete, and fetch book records
- Search books by title or author
- Filter only available books
- JSON-based request/response format
- Integrated with PostgreSQL using Spring Data JPA

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot (Java 24)
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA (Hibernate)
- **Build Tool:** Maven

---

## 📦 API Endpoints

| Method | Endpoint              | Description                          |
|--------|-----------------------|--------------------------------------|
| GET    | `/books`              | Get list of all books                |
| GET    | `/books/{id}`         | Get details of a single book         |
| POST   | `/books`              | Add a new book                       |
| PUT    | `/books/{id}`         | Update a book's details              |
| DELETE | `/books/{id}`         | Delete a book                        |
| GET    | `/books/search?q=`    | Search books by title or author      |
| GET    | `/books/available`    | Get only available books             |

---

## 📘 Sample Book JSON

```json
{
  "title": "Atomic Habits",
  "author": "James Clear",
  "genre": "Self-help",
  "year": 2018,
  "available": true
}
