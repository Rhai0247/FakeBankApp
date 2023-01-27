# Fake Bank App

## Available endpoints
1. POST http://localhost:8090/v1/accounts <br>
   Creates a new account. <br>
   
2. GET http://localhost:8090/v1/accounts/{id}<br>
Retrieves the account balance<br>
   
3. POST http://localhost:8090/v1/operations<br>
Creates a transfer between accounts<br>

4. GET http://localhost:8090/v1/operations/fromAccount/{accountId}<br>
Get historic of operations, given an account id.<br> 
   
## Commands:

To run:

    mvn spring-boot:run

To compile, test:

    mvn clean install

## API Documentation:
First start the application and visit:
    http://localhost:8090/swagger-ui/
