# Simple JSF Web Application (CRUD)

A Jakarta EE 10 web application built with **JSF (Jakarta Faces) 4.0** and **Maven**, designed to run on **Apache Tomcat 11**. This project demonstrates a simple Product Management CRUD (Create, Read, Update, Delete) system.

## 🚀 Technologies Used
* **Java 21** (Eclipse Adoptium)
* **JSF 4.0** (Mojarra)
* **CDI 4.0** (Weld Servlet Shaded)
* **Apache Tomcat 11.0.18**
* **Maven** (Build tool)
* **IntelliJ IDEA Community Edition**

## 🛠️ Project Setup

### 1. Prerequisites
* Ensure you have **JDK 21** installed.
* Download the **Apache Tomcat 11 (Binary Distribution)**.
* Install the **Smart Tomcat** plugin in IntelliJ IDEA.

### 2. Configuration in IntelliJ
1. **Maven Sync**: Open the `pom.xml` and click the "Reload All Maven Projects" button to download dependencies (Mojarra, Weld, etc.).
2. **Run Configuration**:
    * Go to `Add Configuration` > `Smart Tomcat`.
    * **Deployment Directory**: `src/main/webapp`
    * **Context Path**: `/`
    * **Server Port**: `8080`

### 3. Running the App
1. Click the **Green Play button** in IntelliJ.
2. Wait for the console to show: `Server startup in [X] milliseconds`.
3. Open your browser to: `http://localhost:8080/index.xhtml`

## 📂 Folder Structure
* `src/main/java`: Contains the `Product` model and `ProductBean` controller.
* `src/main/webapp`: Contains `index.xhtml` and `WEB-INF/web.xml`.
* `pom.xml`: Project dependencies and build configuration.

## 📝 Features
- [x] JSF 4.0 Integration
- [x] CDI Support via Weld
- [x] Product List Display
- [x] Add, Edit, and Delete functionality (Session Scoped)# sample-jsf-web-app
