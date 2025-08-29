# 🚗 Car Rental System (OOP Activity)

A simple Java program that demonstrates the use of **Object-Oriented Programming (OOP)** concepts such as **interfaces, polymorphism, and abstraction**.  
The project simulates a basic car rental scenario with different types of vehicles.

---

## 📌 Features
- Define a `Vehicle` interface with methods `start()`, `stop()`, and `calculateRental()`.
- Implement two vehicle types:
  - **Car** → rental calculated per day.
  - **Truck** → rental calculated per kilometer.
- Demonstrates polymorphism by treating both Car and Truck as `Vehicle`.

---

## 🛠️ Technologies Used
- **Java (JDK 22)** – Core programming language  
- **NetBeans IDE 21** – Project development and execution  

---

## 📂 Project Structure
CarRental/

│── src/carrental/

│ ├── Vehicle.java # Interface

│ ├── Car.java # Implements Vehicle

│ ├── Truck.java # Implements Vehicle

│ ├── CarRental.java # Main class (entry point)

│── README.md

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/xebec1234/Car-Rental-.git
Open in NetBeans or any Java IDE.

Run the CarRental.java file.

🖥️ Example Output

Toyota Vios is starting...

Car Rentals: 6000.0

Isuzu truck is starting...

Truck Rentals: 5000.0

🎯 Learning Objectives

Understand and apply interfaces in Java.

Demonstrate polymorphism by using different classes with the same interface.

Learn to structure Java classes into a simple real-world example.

👨‍💻 Author
Developed by Xebec1234 as part of a Java OOP recap activity.
