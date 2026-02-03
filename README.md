Calculator (Java Console Application)
📌 Overview

This is a simple Java console-based calculator that performs basic arithmetic operations. The program takes two numbers from the user and allows them to choose an operation: addition, subtraction, multiplication, or division.

It’s designed as a beginner-friendly example to practice:

User input with Scanner

Conditional logic using switch

Basic arithmetic operations

Handling invalid input and division by zero

🛠 Features

Accepts two numbers from the user

Supports four operations:

Addition

Subtraction

Multiplication

Division

Prevents division by zero

Displays clear error messages for invalid choices

🚀 How It Works

The program prompts the user to enter two numbers.

The user selects an operation from a menu (1–4).

The calculator performs the selected operation.

The result is displayed in the console.

🧮 Operations Menu
1. Addition
2. Subtraction
3. Multiplication
4. Division

📂 Project Structure
day3Package
└── Calculator.java

▶️ How to Run

Make sure you have Java JDK installed.

Compile the program:

javac day3Package/Calculator.java


Run the program:

java day3Package.Calculator

⚠️ Notes

If the user selects division and the second number is 0, the program displays:

Division by 0 not possible


If the user enters an invalid operation choice, the program prompts:

Please enter valid choice ( 1, 2, 3 or 4 )

📚 Concepts Used

Scanner for user input

switch-case statements

Basic arithmetic operators

Input validation

✨ Possible Enhancements

Loop the program to allow multiple calculations

Add support for more operations (modulus, power, etc.)

Improve input validation (non-numeric input handling)

Convert to a GUI-based calculator
