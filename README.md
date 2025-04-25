# Universal Calculator

This is my 2nd Semester Project.

## What is the Universal Calculator?
The Universal Calculator is a project that demonstrates four key Object-Oriented Programming (OOP) concepts: **Composition**, **Aggregation**, **Inheritance**, and **Threading**. Think of it as a calculator that not only performs operations but also teaches you how OOP works behind the scenes.

---

## The Four OOP Concepts Explained

### 1. Composition: "The Calculator Owns Its History"
- **Analogy**: Imagine a diary that belongs to you. If you lose the diary, all its contents are gone too. That’s composition.
- **In the Project**: The `Calculator` class has a `History` object. The `History` object is created and destroyed with the `Calculator`. Without the `Calculator`, the `History` cannot exist.

### 2. Aggregation: "The Calculator Uses a UI"
- **Analogy**: Think of a car and its driver. The car needs a driver to operate, but the driver can exist without the car. That’s aggregation.
- **In the Project**: The `Calculator` class uses a `CalculatorUI` interface. The `Calculator` depends on the `UI` to interact with the user, but the `UI` can exist independently of the `Calculator`.

### 3. Inheritance: "The Scientific Calculator is a Calculator"
- **Analogy**: A smartphone is a type of phone. It has all the features of a phone but adds more functionality. That’s inheritance.
- **In the Project**: The `ScientificCalculator` class extends the `Calculator` class. It inherits basic operations like addition and subtraction and adds advanced features like trigonometric functions.

### 4. Threading: "The Calculator Multitasks"
- **Analogy**: Imagine cooking while listening to music. You’re doing two things at once. That’s threading.
- **In the Project**: The `FactorialThread` class runs calculations (like finding a factorial) in a separate thread, allowing the program to multitask.

---

## Why This Project Matters
- It simplifies complex OOP concepts into relatable examples.
- It’s a hands-on demonstration of how OOP principles work in real-world applications.
- It’s designed to be easy to understand for beginners.

---

## How It All Comes Together
- The `Calculator` is the heart of the project, showcasing **composition** and **aggregation**.
- The `ScientificCalculator` builds on the `Calculator` to demonstrate **inheritance**.
- The `FactorialThread` adds multitasking capabilities, showing **threading**.

---

## Visual Representation
- **Composition**: `Calculator` → `History` (filled diamond)
- **Aggregation**: `Calculator` → `CalculatorUI` (hollow diamond)
- **Inheritance**: `ScientificCalculator` → `Calculator` (hollow triangle)
- **Threading**: `FactorialThread` runs independently

---

## Key Takeaway
The Universal Calculator is more than just a calculator. It’s a story of how objects work together, depend on each other, and extend each other’s functionality, all while multitasking efficiently.
