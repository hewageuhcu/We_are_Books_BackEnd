# We Are Books Project README

## Getting Started

Follow these steps to set up and run We Are Books locally.

### Prerequisites
- Java 21 or 22(This project is built on Java 22)
- Maven (v3.6.x or later recommended)
- An IDE (e.g., IntelliJ IDEA) is recommended for running the application

---

### 1. Clone the Project
Create a folder in your machine.

Clone this repository to your local machine using the command:

```bash
git clone -b master<repository_url>
```

Replace `<repository_url>` with the actual URL of this repository.

---

### 2. Go to the Root Directory
Navigate to the root directory of the project using the terminal:

```bash
cd <project_folder_name>
```

Replace `<project_folder_name>` with the name of the cloned folder.

---

### 3. Install Maven Packages
Install the required Maven dependencies by running:

```bash
mvn clean install
```

This will download and configure all necessary project dependencies. 

---

### 4. Run the Application
Run the `main` method in the `WeAreBooksApplication` class, located at:

```
src\main\java\com\example\WeAreBooks\WeAreBooksApplication.java
```

You can use your IDE's built-in functionality to execute the `main` method.

---

### Backend Database
The project uses a MongoDB database hosted online via MongoDB Atlas.  
All necessary configuration details, including connection credentials, are provided in the `application.properties` file located in:

```
src\main\resources\application.properties
```

---
Thank you for enjoying the project👋
