# Java Receipt Calculator

A simple Java console application that generates a formatted receipt using a South African business scenario.

This project was built as part of my Java learning journey while working through Java fundamentals. It focuses on core beginner concepts such as variables, data types, arithmetic operators, type casting, and console output.

## Project Objective

The goal of this project is to practice Java basics by building a receipt calculator that:

- stores item names, prices, and quantities
- calculates item subtotals
- calculates 15% VAT
- calculates the final total
- prints a neat formatted receipt to the console

## Concepts Practiced

- Java syntax
- variables
- data types
- arithmetic operators
- type casting
- constants with `final`
- `System.out.println()`
- string formatting with `String.format()`

## Technologies Used

- Java
- IntelliJ IDEA

## How It Works

The program uses hardcoded item values for:
- Bread
- Milk
- Eggs

It calculates:
- subtotal for each item
- overall subtotal
- VAT at 15%
- final total amount

Then it prints the receipt in the console.

## Example Output

```text
===========================
        LEBO'S GOODS
===========================
Bread         x2    R37.98
Milk          x3    R67.50
Eggs          x1    R45.00
---------------------------
Subtotal:           R150.48
VAT (15%):          R22.57
---------------------------
TOTAL:              R173.05
===========================
```
## Why I Built This

I am building Java projects step by step to align with my goal of becoming a Java developer in the fintech/banking industry.

This is one of my Phase 1 beginner projects focused on mastering the absolute basics before moving into object-oriented programming, Spring Boot, REST APIs, databases, and banking-related backend systems.

## Future Improvements

Possible future improvements for this project:

accept user input with Scanner
print unit prices alongside totals
improve alignment using System.out.printf()
support more items
store items in arrays or objects
generate more realistic till slip formatting
How to Run
Open the project in IntelliJ IDEA
Open the Main.java file
Run the program
View the receipt output in the console

## Author

Built by Olebogeng Raphesu as part of my Java developer learning roadmap.
