# It is a Spring-Boot, REST API Application
## Dependencies:
1. **Spring Web**
2. **Spring Data JPA**
3. **MySQL Driver**
4. **Spring Boot DevTools**

## DataBase:
No need to create table, It will automatically created by the application.

## Postman:
- **GET** *(Read)* <https://localhost:8080/users> *(get all users)*
- **GET** *(Read)* <https://localhost:8080/users/1221> *(get user by id)*
- **POST** *(Create)* <https://localhost:8080/users/add> *(create user)*
    - Body > raw > JSON >
    ```
    {
        "name": "Rahul"
        "email": "rahul@gmail.com"
    }
    ```
- **PUT** *(Update)* <https://localhost:8080/users/update/1224> *(update user by id)*
- **DELETE** *(Delete)* <https://localhost:8080/users/delete/1222> *(delete user by id)*
