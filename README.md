# Buy Anything - E-Commerce Website Backend

## Language and Framework
![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Project Overview
Buy Anything is an e-commerce website backend that provides users with APIs to interact with servers and databases. The project follows the Model-View-Controller (MVC) architectural pattern.

## Models
### User Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each user.
  - `name (String)`: User's name.
  - `email (String)`: User's email.
  - `password (String)`: User's password.
  - `phoneNumber (String)`: User's phone number.

### Product Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each product.
  - `name (String)`: Name of the product.
  - `price (Double)`: Price of the product.
  - `description (String)`: Product description.
  - `category (Category)`: Product category (Enum: [ELECTRONICS, CLOTHING, BOOKS, HOME_AND_GARDEN, SPORTS_AND_OUTDOORS, BEAUTY_AND_PERSONAL_CARE, TOYS_AND_GAMES, OTHER]).
  - `brand (Brand)`: Product brand (Enum: [SAMSUNG, APPLE, SONY, LG, MICROSOFT, GOOGLE, HP, DELL, NIKE, ADIDAS, HandM, ZARA, LEVI_S, GUCCI, VERSACE, CALVIN_KLEIN, PENGUIN_BOOKS, HARPERCOLLINS, SIMON_AND_SCHUSTER, RANDOM_HOUSE, OXFORD_UNIVERSITY_PRESS, IKEA, BED_BATH_AND_BEYOND, WILLIAMS_SONOMA, POTTERY_BARN, WAYFAIR, THE_NORTH_FACE, PATAGONIA, COLUMBIA, UNDER_ARMOUR, LOREAL, MAYBELLINE, ESTEE_LAUDER, NIVEA, LEGO, MATTEL, HASBRO, GENERIC_BRAND_A, GENERIC_BRAND_B, GENERIC_BRAND_C, GENERIC_BRAND_D]).

### UserOrder Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each order.
  - `address (Address)`: Shipping address associated with the order.
  - `orderQuantity (Integer)`: Quantity of the products in the order.
  - `user (User)`: User who placed the order.
  - `products (List<Product>)`: List of products in the order.

### Address Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each address.
  - `address (String)`: Street address.
  - `landMark (String)`: Landmark associated with the address.
  - `phoneNumber (String)`: Phone number associated with the address.
  - `zipcode (String)`: Zipcode of the address.
  - `state (String)`: State of the address.
  - `user (User)`: User associated with the address.

## Repositories
- `IAddressRepo`: Interface extending JpaRepository for the Address entity.
- `IOrderRepo`: Interface extending JpaRepository for the UserOrder entity.
- `IProductRepo`: Interface extending JpaRepository for the Product entity with custom query methods.
- `IUserRepo`: Interface extending JpaRepository for the User entity.

## Controllers
### AddressController
- **Endpoints:**
  - `POST /address`: Add a new address by providing address details in the request body.
  - `GET /addresses`: Retrieve a list of all addresses.

### OrderController
- **Endpoints:**
  - `POST /order`: Add a new order by providing order details in the request body.
  - `GET /orders`: Retrieve a list of all orders.
  - `GET /order/id/{id}`: Retrieve an order by its ID.

### ProductController
- **Endpoints:**
  - `POST /product`: Add a new product by providing product details in the request body.
  - `GET /products`: Retrieve a list of all products.
  - `GET /products/category`: Retrieve products by category.
  - `GET /product/id/{id}`: Delete a product by its ID.

### UserController
- **Endpoints:**
  - `POST /user`: Add a new user by providing user details in the request body.
  - `GET /users`: Retrieve a list of all users.
  - `GET /user/id/{id}`: Retrieve a user by their ID.

## Services
### AddressServices
- Manages address-related operations.
- `AddAddress`: Add a new address to the database.
- `getAllAddress`: Retrieve all addresses from the database.

### OrderServices
- Manages order-related operations.
- `addOrder`: Add a new order to the database.
- `getAllOrders`: Retrieve all orders from the database.
- `getById`: Retrieve an order by its ID from the database.

### ProductServices
- Manages product-related operations.
- `addProduct`: Add a new product to the database.
- `getAllProducts`: Retrieve all products from the database.
- `getAllByCategory`: Retrieve products by category from the database.
- `deleteById`: Delete a product by its ID from the database.

### UserServices
- Manages user-related operations.
- `addUser`: Add a new user to the database.
- `getAll`: Retrieve all users from the database.
- `getbyId`: Retrieve a user by their ID from the database.

## Database
The project uses MySQL database for storing data.
![Local Image](./QuickDBD-Free%20Diagram1.png)

## Prerequisites
Make sure you have the following prerequisites installed:
- Java Development Kit (JDK)
- MySQL database
- Maven
- Dependencies specified in pom.xml


