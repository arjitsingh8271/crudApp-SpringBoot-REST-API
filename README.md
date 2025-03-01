# It is a Spring-Boot Application
## Dependencies:
**Spring Web**
**Spring Data JPA**
**MySQL Driver**
**Spring Boot DevTools**

## DataBase:
No need to create table, It will automatically created by the application.

## Postman:
**GET**(Read) [localhost:8080/users] (get all users)
**GET**(Read) [localhost:8080/users/1221] (get user by id)
**POST**(Create) [localhost:8080/users/add] (create user)
    Body > raw > JSON
    {
        "name": "Rahul"
        "email": "rahul@gmail.com"
    }
**PUT**(Update) [localhost:8080/users/update/1224] (update user by id)
**DELETE**(Delete) [localhost:8080/users/delete/1222] (delete user by id)
