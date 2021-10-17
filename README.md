# Grocery Store-API

*This is a learning project in **Kotlin** which consists of backend api's for a grocery store*

**End points**
* GET /products : Lists all the products in the database
    ```
  {
    id: 1000,
    name: Apple,
    description: Fruit,
    price: 3.50,
    status: available
  }
  ```
* POST /productsByCategory: List all the products under specific category
    ```
  body: 1
  
  response: 
  [
        {
           id: "2001",
           name: Apple,
           description: Fruit,
           Price: 3.50,
           status: available
        },
        {
           id: "2001",
           name: Apple,
           description: Fruit,
           Price: 3.50,
           status: available
        }
  ]
    ```
**Steps to run the application**

* Run `docker-compose up -d db` to spin up the database 
* Clone the repo
* If gradle is set up in local
    * Run `gradle build `
    * Then `gradle bootRun`, the server will be up on the port 8000 writing the initial database scripts to the db
* If not, open up the project in intelliJ IDE, open the `src/main/kotlin/com.kiranaStore.api/ApiApplication.kt` and run the fun `main`. IntelliJ should pick up the spring-kotlin application and run the app on port 8000.
