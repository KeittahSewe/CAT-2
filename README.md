# CAT 2 - Object Oriented Programming I

## Name & Admission
- Name: Keittah Sewe
- Admission: 151426

---

## Question 1

### **Part A: Encapsulation**
#### **Solution:**
- Created a `Student` class with private attributes: `name`, `age`, and `grade`.
- Provided public **getter and setter** methods to access and modify these attributes.
- Used a `Main` class to create an instance of `Student` and modify its values through setters.

### **Part B: Method Overloading**
#### **Solution:**
- Created a `MathOperations` class with **overloaded** `multiply()` methods that handle:
  - Multiplication of **two integers**.
  - Multiplication of **three integers**.
- Used a `Main` method inside `MathOperations` to **test method overloading**.

### **Part C: Polymorphism (Method Overriding)**
#### **Solution:**
- Created a **parent class** `Animal` with a method `makeSound()`.
- Created two subclasses **`Dog` and `Cat`**, each **overriding** `makeSound()`.
- Used **polymorphism** by creating `Animal` references for `Dog` and `Cat`, then calling `makeSound()`.

---

## Question 2: Advanced OOP Concepts

### **Part A: Abstraction**
#### **Solution:**
- Created an **abstract class** `Appliance` with an **abstract method** `turnOn()`.
- Created two subclasses **`Fan` and `TV`**, each **implementing** `turnOn()` differently.
- Used **polymorphism** to create `Appliance` references for `Fan` and `TV`, then called `turnOn()`.

📌 *This is similar to **Polymorphism (1C)**, but uses an **abstract class** instead of a normal parent class.*

### **Part B: Exception Handling**
#### **Solution:**
- Used **Scanner** to get two numbers from the user.
- Attempted **division (`num1 / num2`)**, which may cause an `ArithmeticException` if `num2` is **zero**.
- Used **`catch (ArithmeticException e)`** to handle **division by zero**.
- Used **`finally`** to **close the scanner** and prevent resource leaks.

---

## How to Run the Programs
1. Clone this repository:
   ```bash
   git clone https://github.com/KeittahSewe/CAT-2.git
   cd CAT-2
   ```
2. Compile the Java files using:
   ```bash
   javac Filename.java
   ```
3. Run the Java programs using:
   ```bash
   java ClassName
   ```

---



### Author
**Keittah Sewe**



