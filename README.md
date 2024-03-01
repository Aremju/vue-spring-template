# [![My Skills](https://skillicons.dev/icons?i=vue,spring)](https://skillicons.dev) vue-spring-template

This is a template for fullstack applications using Vue with typescript
as a frontend framework and
Java Spring Boot as backend framework. To use this template correctly, I expect
you to have the following things installed:

[![My Skills](https://skillicons.dev/icons?i=nodejs,npm,docker,java)](https://skillicons.dev)

- Java 17 or higher
- Docker
- Node
- npm
- IntelliJ IDEA or another similar IDE

Follow along with the steps from the top of this README.md
to the bottom.

## Setting up the Project

Click on **use this template** to create your own repository with this
template

**Alternative:**
If you already have an existing repository,
you can still clone this project and copy it to your repository.

````
git clone https://github.com/Aremju/vue-spring-template.git
````

Search for all occurrences (IntelliJ: CTRL + SHIFT + R) with vue-spring-template (or vuespringtemplate) and 
replace them with your own project name.

> **_NOTE:_** Only use word-like characters, no hyphens, underscores, dots, semicolons, commas etc.

### Running the App in your IDE

Start Docker PostgreSQL and Liquibase initcontainer

Before you start the project, make sure you have the database container
running on your local machine, simply run this command in your terminal
of your IDE

````
docker compose up
````

> **_NOTE:_** Sometimes your liquibase container might start too fast. 
Consider to run this command again in another tab of your IDE terminal.

Building the front- and backend from root-directory

When you want to have a frontend delivered in a single .jar-file with
your backend, simply run this in your project root directory:

````
./mvnw clean install
````

This command builds your project in a single .jar file and also
runs all the tests of your front- and backend. You can also run your
backend with your frontend (no live reloading here)

**Alternative:** You can also run your backend and frontend from backend/:

````
../mvnw spring-boot:run
````

Or run .jar in created target folder
````
java -jar [FILE.jar]
````

### Run App with Docker

Build Docker App

````
docker build -t dockerfile .
````

Run Application in Docker

````
docker run --network=[PROJECT_NAME]_default -p 8080:8080 -e POSTGRES_URL='jdbc:postgresql://postgresdb:5432/[PROJECT_NAME]' -e APP_USER=postgres -e APP_PASSWORD=postgres -e BASE_URL=http://localhost:5173 dockerfile 
````

## Backend

Your source code of your backend is located in backend/src/main/java.
I recommend to keep this packaging structure as it is. Just simply delete
these template classes and replace them with your own application logic.

Tests can be found in src/test/java. There is also an IntegrationTestBase
which runs an in-memory PostgresSQL Container. For your testing purposes.

# Frontend

Your frontend logic is located in frontend/src.
You've got a cypress folder for your End-to-End-Tests.

The Service folder is for methods that make requests on your server.
But you can also use it for util-methods.

Your components are located in your frontend/components/.
There are also your tests for your frontend logic.

/router and /views are directories for your routing logic and 
your views for your router.

assets/ is the folder for your files or for stylesheets.

## Liquibase

tbd

## OAuth2.0

tbd