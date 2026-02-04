# 💼 MoneyTransfer System – Single Responsibility Principle (SRP)

## 🚀 Project Overview
This project demonstrates a **MoneyTransfer system implemented in Java**, refactored to follow the **Single Responsibility Principle (SRP)** from SOLID principles.  

The goal was to **identify responsibilities in a monolithic class** and **refactor them into independent, maintainable, and loosely-coupled components**.

---

## 🏗 Problem Statement
The original code combined multiple responsibilities in a single class, including:  

- Account operations (deposit, withdraw, transfer, balance retrieval)  
- Account validation  
- Notifications  
- Account statements  

This made the code **hard to maintain, test, and extend**.

---

## ✅ Solution & Design
The system was refactored into **independent classes**, each with a single responsibility:

- **AccountService** – Handles all account operations.  
- **ValidationService** – Validates account numbers and account names.  
- **NotificationService** – Sends notifications after transactions.  
- **AccountException** – Custom exception for invalid operations.

**Key Highlights:**  
- Clear separation of concerns → each class has **one reason to change**  
- Loosely coupled services → easy to reuse and extend  
- Readable and testable → each component can be **unit tested independently**  
- Demonstrates **professional refactoring and design thinking**

---
## ⚡ How to Run

1. Compile all classes:

```bash
javac SOLIDCode/SRP/MoneyTransfer/AfterRefactor/*.java

java SOLIDCode.SRP.MoneyTransfer.AfterRefactor.MainAfterRefactor

💻 Sample Output

Balance in account 10 is 20000
Balance in account 65 is 20000
Amount transfer from Karthik
Amount received to account Raj with account number 65, now available balance is 24000 after transaction


Key Takeaways

Clean and modular design:   Each class has a single, well-defined responsibility

Refactoring : Improved maintainability and readability of existing code

OOP & SRP : Demonstrated  design and separation of behaviours

Scalable code: Components are independent and scalable


👤 Author

Karthik Kolli 
## 📂 Folder Structure

SOLIDCode/
└── SRP/
└── MoneyTransfer/
├── BeforeRefactor/ # Original monolithic code
│ └── MoneyTransferSystem.java
└── AfterRefactor/ # SRP refactored code
├── AccountService.java
├── ValidationService.java
├── NotificationService.java
├── AccountException.java
└── MainAfterRefactor.java
