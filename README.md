----This is Spring Boot Project-----
-H2 in-memory database with DB authentication 

- consists of user registration module and todolist item module
- need to have postman to test the REST endpoints 

- try with username/password: admin 

1. User registration - no need authentication 
    - localhost:8080/user/register --> is the POST URL

2. Retrieve to do list items by user
    - localhost:8080/todo/admin --> is a GET URL, need authentication 
