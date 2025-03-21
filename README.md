# CloudVendorAPI  

CloudVendorAPI is a Spring Boot-based RESTful API designed to manage cloud vendor information efficiently. This project provides CRUD operations for handling cloud vendors, making it an ideal solution for applications that require cloud provider data management.  

## Features  
- RESTful API for managing cloud vendors  
- CRUD operations (Create, Read, Update, Delete)  
- Spring Boot with Java for backend development  
- Integration with a database for persistent storage  
- Exception handling and validation mechanisms  
- Follows best practices for API design  

## Technologies Used  
- **Java 17**  
- **Spring Boot** (Spring Web, Spring Data JPA)  
- **Hibernate** (ORM for database interactions)  
- **H2 Database** (In-memory database for quick setup)  
- **Maven** (Dependency management)  

## Endpoints  
| Method | Endpoint | Description |  
|--------|---------|-------------|  
| GET | `/api/vendors` | Fetch all cloud vendors |  
| GET | `/api/vendors/{id}` | Fetch a cloud vendor by ID |  
| POST | `/api/vendors` | Add a new cloud vendor |  
| PUT | `/api/vendors/{id}` | Update vendor details |  
| DELETE | `/api/vendors/{id}` | Remove a cloud vendor |  

## Getting Started  
### Prerequisites  
- Java 17+  
- Maven installed  

### Setup and Run  
1. Clone the repository:  
   ```bash  
   git clone https://github.com/Mahesh9161/CloudVendorAPI.git  
   cd CloudVendorAPI  
   ```  
2. Build the project:  
   ```bash  
   mvn clean install  
   ```  
3. Run the application:  
   ```bash  
   mvn spring-boot:run  
   ```  

## Contributing  
Feel free to fork the repository and submit pull requests for enhancements or bug fixes.  

## License  
This project is open-source and available under the [MIT License](LICENSE).
