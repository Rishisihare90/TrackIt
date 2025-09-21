# TrackIt – Full-Stack Inventory Management System

## About the Project

**TrackIt** is a full-stack inventory management system designed to provide businesses with a robust tool for tracking products, managing suppliers, and logging inventory transactions. The application features a secure, stateless RESTful API built with Spring Boot and a responsive user interface created with React.

With a focus on security and clear separation of concerns, TrackIt implements role-based access control (Admin/User) to ensure data integrity and provides a clear, intuitive workflow for managing a complete inventory lifecycle.

---

## ✨ Key Features

- **Secure Authentication:** End-to-end user authentication and authorization using Spring Security and JSON Web Tokens (JWT).
- **Role-Based Access Control (RBAC):** Distinct functionalities for **Admin** (full system management) and **User** (view-only or limited access) roles.
- **Comprehensive Inventory Management:** Full CRUD operations for products, suppliers, and categories.
- **Transaction Logging:** A complete ledger for all inventory movements, including purchases, sales, and returns.
- **Dynamic Search & Filtering:** Server-side search capabilities to quickly find products or transactions.
- **File Uploads:** Functionality for uploading and associating images with product listings.

---

## 🛠️ Tech Stack

#### **Backend:**

- **Java 17** - Core programming language.
- **Spring Boot** – For building the RESTful API.
- **Spring Security** – For authentication and authorization.
- **Spring Data JPA / Hibernate** – For database interaction and object-relational mapping.
- **JWT (JSON Web Tokens)** – For stateless, token-based security.
- **Maven** – For project management and dependencies.
- **Lombok** – To reduce boilerplate code.

#### **Frontend:**

- **React.js** – For building the user interface.
- **React Router** – For client-side routing.
- **Axios** – For making API requests to the backend.

#### **Database:**

- **MySQL** – For relational data storage.

---

## 🚀 How to Get Started

Follow these instructions to set up the project locally.

### Prerequisites

- JDK 17 or later
- Maven 3.2+
- Node.js and npm
- MySQL Server

### 1. Fork and Clone the Repository

```bash
git clone https://github.com/Rishisihare90/TrackIt.git
cd TrackIt
```

### 2. Setup Backend

1.  Navigate to the backend directory:
    ```bash
    cd Backend
    ```
2.  **Create your configuration file**:
    - Inside the `src/main/resources/` directory, create a new file named `application.properties`.
3.  **Copy the template**:
    - Open `application-example.properties`, copy all of its content, and paste it into your new `application.properties` file.
4.  **Configure your secrets**:
    - In the **new `application.properties` file**, update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to match your local MySQL setup.
    - Set a long, random string for your `secreteJwtString` property.
5.  **Run the application**:
    ```bash
    mvn spring-boot:run
    ```
    The backend server will start on **http://localhost:5050**.

### 3. Setup Frontend

1.  Navigate to the frontend directory:
    ```bash
    cd ../Frontend
    ```
2.  **Install dependencies**:
    ```bash
    npm install
    ```
3.  **Run the development server**:
    ```bash
      npm run dev
    ```
    The React application will be available at **http://localhost:5173**.
