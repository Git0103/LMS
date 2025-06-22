# Library Management System

This project is a Library Management System designed using Java Swing for the graphical user interface and MySQL for the database management. The application allows users to manage books in a library, including adding, updating, deleting, and retrieving book information.

## Project Structure

```
library-management-system
├── src
│   ├── Main.java               # Entry point of the application
│   ├── gui
│   │   └── LibraryUI.java      # User interface components
│   ├── db
│   │   └── DatabaseConnection.java # Manages database connection
│   ├── models
│   │   └── Book.java           # Represents a book in the library
│   └── controllers
│       └── LibraryController.java # Handles business logic
├── lib
│   └── mysql-connector-java.jar # MySQL JDBC driver
├── README.md                   # Project documentation
└── pom.xml                     # Maven configuration file
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd library-management-system
   ```

2. **Install dependencies:**
   Ensure you have Maven installed. Run the following command to install the required dependencies:
   ```
   mvn install
   ```

3. **Database Configuration:**
   - Create a MySQL database for the library management system.
   - Update the `DatabaseConnection.java` file with your database credentials.

4. **Run the Application:**
   Execute the following command to run the application:
   ```
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Usage Guidelines

- The application provides a user-friendly interface to manage library books.
- Users can add new books, update existing book information, delete books, and view the list of available books.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.