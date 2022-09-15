# Capstone Project - Spring Boot Backend
 
### 1. Accessing H2 Console and Swagger UI 
*(Please make sure that the application is running before accessing the following links)*
- Access [H2 Console](http://localhost:8080/h2-console)
- Access [Swagger UI](http://localhost:8080/swagger-ui/index.html#/)

##### Login Credential for H2 Console
- **JDBC URL:** jdbc:h2:mem:ecommercedb

- **User Name:** sa

- **Password:** *(leave blank)*

### 2. Design & Build
**Are there 4 or more models?** 

**&rarr;** Yes, there is a total of 10 models.

**Does each relationship is used?** 

**&rarr;** Yes, one-to-one relationship is used in models such as `Address` and `Order`.

**&rarr;** one-to-many or many-to-one relationship is used in models such as `ProductCategory` and `State`.

**&rarr;** many-to-many relationship is used in entity such as `User`.

### 3. Routes & Optimization

**Are RestFUL route names used?**

**&rarr;** Yes, the Checkout controller uses `"/api/checkout"`.

**&rarr;** The customer controller uses `"/api/customer"`.

**&rarr;** The user controller uses `"/api/user"`.


**Are there 6 or more endpoints on the back?**

**&rarr;** Yes, there are more than 20 different endpoints based on the Postman collection.


### 4. Edge Case & Error Handling

**Can user cause 500 request?**

**&rarr;** Error handling strategies are implemented to make sure 500 HTTP Status code will not occur when users are interacting with the client-side front-end application. 

**Are there more than 90 percent of coverage in Junit Test?**

**&rarr;** Yes, refer to these [Junit Tests](https://github.com/seanjungmsba/java-mod-11-capstone-backend/tree/main/spring-boot-backend/src/test/java/com/example/springbackend/service).

**Are there full Postman suite?**

**&rarr;** Postman collection is located in this [folder](https://github.com/seanjungmsba/java-mod-11-capstone-backend/blob/main/spring-boot-backend/postman_collection). You can either directly access this file or download this file to import it in your local Postman. GET/POST/PUT/DELETE requests are used at least once, meeting the requirement specified in the rubric.
