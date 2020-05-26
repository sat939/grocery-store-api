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