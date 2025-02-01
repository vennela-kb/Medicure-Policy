# 🏥 Medicure Policy Management System - Spring Boot

## 📌 Overview
This project is a **Spring Boot-based Healthcare Policy Management System**, providing APIs to manage medical policies, user subscriptions, and policy information retrieval. It follows a **RESTful API architecture**, leveraging **Spring Boot, JPA, and Maven**.

### 🎯 Features
✅ Policy management (Add, Update, Delete, List)  
✅ User subscription handling  
✅ RESTful APIs with Spring Boot  
✅ Database Integration using JPA  
✅ Modular architecture with MVC Pattern  
✅ Unit Testing using JUnit  
✅ Maven for dependency management  
✅ Configurable `application.properties` file  

---

## 📂 Project Structure
```
medicure-policy/
│── src/
│   ├── main/
│   │   ├── java/com/healthcare/medicurepolicy/
│   │   │   ├── controller/        # API Controllers
│   │   │   ├── model/             # Entity Classes
│   │   │   ├── repository/        # JPA Repository Layer
│   │   │   ├── service/           # Service Layer
│   │   │   ├── MedicurepolicyApplication.java  # Main Application Entry
│   │   ├── resources/
│   │   │   ├── application.properties  # Configuration
│   ├── test/java/com/healthcare/medicurepolicy/
│   │   ├── MedicurepolicyApplicationTests.java # Unit Testing
│── pom.xml  # Maven Configuration
│── README.md  # Project Documentation
```

---

## 🛠️ Installation & Setup
### Prerequisites
- Install **Java 11+**
- Install **Maven**
- Install **MySQL/PostgreSQL** (if using a database)

### 🚀 Running the Application
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd medicure-policy
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The application will be available at:
   ```sh
   http://localhost:8080
   ```

---

## 🔄 API Endpoints
| HTTP Method | Endpoint | Description |
|------------|----------|-------------|
| **GET** | `/policies` | Retrieve all policies |
| **GET** | `/policies/{id}` | Get policy by ID |
| **POST** | `/policies` | Add a new policy |
| **PUT** | `/policies/{id}` | Update policy details |
| **DELETE** | `/policies/{id}` | Delete a policy |

---

## 🏗️ Future Enhancements
🔹 Add authentication (JWT-based security)  
🔹 Implement frontend with React/Angular  
🔹 Dockerize the application  

---

## ✉️ Contact
For any queries, reach out to:
- **Vennela Kothakonda** - Developer

---

Happy Coding! 🚀
