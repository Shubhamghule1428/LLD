# Low-Level Design (LLD) Master Guide

A comprehensive guide to mastering Low-Level Design (LLD) in Java with detailed explanations, real-world examples, and practical implementations.

This document is written from a **design-review perspective**, not a tutorial.
Assume the reader already knows basic OOP.

---

## 📚 Table of Contents

### [Part 1: Object-Oriented Programming Fundamentals](./part1-oop-fundamentals)

#### 1.1 Core OOP Principles
- **[Encapsulation](./part1-oop-fundamentals/encapsulation.md)**
  - Definition and Concepts
  - Access Modifiers
  - Data Hiding
  - Real-world Example: Banking System
  
- **[Inheritance](./part1-oop-fundamentals/inheritance.md)**
  - Types of Inheritance
  - Method Overriding
  - super Keyword
  - Real-world Example: Employee Management System

- **[Polymorphism](./part1-oop-fundamentals/polymorphism.md)**
  - Compile-time Polymorphism (Method Overloading)
  - Runtime Polymorphism (Method Overriding)
  - Real-world Example: Payment Processing System

- **[Abstraction](./part1-oop-fundamentals/abstraction.md)**
  - Abstract Classes
  - Interfaces
  - Abstract vs Interface
  - Real-world Example: Database Connection Management

#### 1.2 SOLID Principles
- **[Single Responsibility Principle (SRP)](./part1-oop-fundamentals/solid/srp.md)**
  - Definition
  - Bad vs Good Examples
  - Real-world Example: User Management System

- **[Open/Closed Principle (OCP)](./part1-oop-fundamentals/solid/ocp.md)**
  - Definition
  - Strategy Pattern Implementation
  - Real-world Example: Discount Calculation System

- **[Liskov Substitution Principle (LSP)](./part1-oop-fundamentals/solid/lsp.md)**
  - Definition
  - Violations and Solutions
  - Real-world Example: Shape Area Calculation

- **[Interface Segregation Principle (ISP)](./part1-oop-fundamentals/solid/isp.md)**
  - Definition
  - Fat vs Segregated Interfaces
  - Real-world Example: Worker Interfaces

- **[Dependency Inversion Principle (DIP)](./part1-oop-fundamentals/solid/dip.md)**
  - Definition
  - Dependency Injection
  - Real-world Example: Notification System

---

### [Part 2: Design Patterns](./part2-design-patterns)

#### 2.1 Creational Patterns
- **[Singleton Pattern](./part2-design-patterns/creational/singleton.md)**
  - Eager Initialization
  - Lazy Initialization
  - Double-Checked Locking
  - Bill Pugh Singleton
  - Enum Singleton
  - Examples: Logger, Database Connection Pool, Configuration Manager

- **[Factory Pattern](./part2-design-patterns/creational/factory.md)**
  - Simple Factory
  - Factory Method
  - Product and Creator Hierarchies
  - Examples: Vehicle Factory, Payment Method Factory

- **[Abstract Factory Pattern](./part2-design-patterns/creational/abstract-factory.md)**
  - Family of Related Objects
  - Cross-platform UI Components
  - Examples: GUI Factory (Windows/Mac), Database Factory

- **[Builder Pattern](./part2-design-patterns/creational/builder.md)**
  - Fluent Interface
  - Immutable Objects
  - Step-by-step Construction
  - Examples: User Builder, HTTP Request Builder, SQL Query Builder

- **[Prototype Pattern](./part2-design-patterns/creational/prototype.md)**
  - Cloning Objects
  - Shallow vs Deep Copy
  - Prototype Registry
  - Examples: Shape Cloning, Game Characters

#### 2.2 Structural Patterns
- **Adapter Pattern** _(Coming Soon)_
- **Bridge Pattern** _(Coming Soon)_
- **Composite Pattern** _(Coming Soon)_
- **Decorator Pattern** _(Coming Soon)_
- **Facade Pattern** _(Coming Soon)_
- **Flyweight Pattern** _(Coming Soon)_
- **Proxy Pattern** _(Coming Soon)_

#### 2.3 Behavioral Patterns
- **Observer Pattern** _(Coming Soon)_
- **Strategy Pattern** _(Coming Soon)_
- **Command Pattern** _(Coming Soon)_
- **State Pattern** _(Coming Soon)_
- **Template Method Pattern** _(Coming Soon)_
- **Iterator Pattern** _(Coming Soon)_
- **Chain of Responsibility Pattern** _(Coming Soon)_
- **Mediator Pattern** _(Coming Soon)_
- **Memento Pattern** _(Coming Soon)_
- **Visitor Pattern** _(Coming Soon)_

---

### [Part 3: UML Diagrams & Relationships](./part3-uml-diagrams)

#### 3.1 UML Diagrams

- **[Class Diagram](./part3-uml-diagrams/class-diagram.md)**
  - Class Notation
  - Attributes and Methods
  - Visibility Modifiers
  - Stereotypes (abstract, interface, enum)
  - Complete Example: E-Commerce System

- **[Sequence Diagram](./part3-uml-diagrams/sequence-diagram.md)**
  - Actors and Objects
  - Messages (Synchronous, Asynchronous, Return)
  - Activation Boxes
  - Control Structures (alt, loop, opt)
  - Examples: User Login, Online Shopping Flow

- **[Use Case Diagram](./part3-uml-diagrams/use-case-diagram.md)**
  - Actors (Primary, Secondary, System)
  - Use Cases
  - Relationships (Association, Include, Extend, Generalization)
  - System Boundary
  - Examples: Library Management, ATM System
  - Use Case Documentation Template

- **[Activity Diagram](./part3-uml-diagrams/activity-diagram.md)** _(Coming Soon)_
  - Activities and Actions
  - Decision Nodes
  - Fork and Join
  - Swim Lanes

- **[State Diagram](./part3-uml-diagrams/state-diagram.md)** _(Coming Soon)_
  - States and Transitions
  - Entry/Exit Actions
  - Guard Conditions

#### 3.2 Relationships in Detail

- **[Association](./part3-uml-diagrams/relationships/association.md)**
  - Definition: Uses-A Relationship
  - Bidirectional vs Unidirectional
  - Multiplicity (1, 0..1, 1..*, 0..*)
  - Examples:
    - Doctor-Patient (Many-to-Many)
    - Author-Book (Many-to-Many)
    - Employee-Printer (Unidirectional)

- **[Aggregation](./part3-uml-diagrams/relationships/aggregation.md)**
  - Definition: Has-A / Weak Ownership
  - Lifecycle Independence
  - Shared Ownership
  - Hollow Diamond Notation (◇)
  - Examples:
    - University-Professor
    - Team-Player
    - Playlist-Song

- **[Composition](./part3-uml-diagrams/relationships/composition.md)**
  - Definition: Part-Of / Strong Ownership
  - Lifecycle Dependency
  - Exclusive Ownership
  - Filled Diamond Notation (♦)
  - Examples:
    - House-Room
    - Car-Engine
    - Book-Chapter
    - Order-OrderItem

- **[Inheritance/Generalization](./part3-uml-diagrams/relationships/inheritance.md)** _(Coming Soon)_
  - Definition: Is-A Relationship
  - Parent-Child Hierarchy
  - Method Overriding
  - Hollow Triangle Notation (△)
  - Examples:
    - Shape Hierarchy (Circle, Rectangle, Triangle)
    - Employee Types (FullTime, Contract, Intern)

- **[Realization/Implementation](./part3-uml-diagrams/relationships/realization.md)** _(Coming Soon)_
  - Definition: Implements Relationship
  - Interface Implementation
  - Dashed Line with Triangle (┄┄△)
  - Examples:
    - Payment Methods (CreditCard, PayPal, Crypto)
    - Drawable Shapes

- **[Dependency](./part3-uml-diagrams/relationships/dependency.md)** _(Coming Soon)_
  - Definition: Uses Temporarily
  - Method Parameters, Local Variables
  - Dashed Arrow (----->)
  - Examples:
    - Report-Printer
    - Service-Logger

- **[Relationship Comparison Chart](./part3-uml-diagrams/relationships/comparison.md)**
  - Association vs Aggregation vs Composition
  - When to Use Which Relationship
  - Decision Tree for Choosing Relationships

---

### [Part 4: Real-World System Design Examples](./part4-real-world-examples)

#### 4.1 Classic LLD Problems
- **[Parking Lot System](./part4-real-world-examples/parking-lot/)** _(Coming Soon)_
  - Requirements Analysis
  - Class Diagram
  - Sequence Diagrams
  - Complete Implementation

- **[Library Management System](./part4-real-world-examples/library-management/)** _(Coming Soon)_
  - Use Cases
  - Class Relationships
  - Implementation

- **[Hotel Booking System](./part4-real-world-examples/hotel-booking/)** _(Coming Soon)_
- **[Elevator System](./part4-real-world-examples/elevator/)** _(Coming Soon)_
- **[Chess Game](./part4-real-world-examples/chess/)** _(Coming Soon)_
- **[Snake and Ladder](./part4-real-world-examples/snake-ladder/)** _(Coming Soon)_
- **[Tic-Tac-Toe](./part4-real-world-examples/tic-tac-toe/)** _(Coming Soon)_
- **[Movie Ticket Booking](./part4-real-world-examples/movie-booking/)** _(Coming Soon)_
- **[ATM System](./part4-real-world-examples/atm/)** _(Coming Soon)_
- **[Restaurant Management](./part4-real-world-examples/restaurant/)** _(Coming Soon)_

#### 4.2 E-Commerce Applications
- **[Shopping Cart](./part4-real-world-examples/shopping-cart/)** _(Coming Soon)_
- **[Order Management](./part4-real-world-examples/order-management/)** _(Coming Soon)_
- **[Inventory System](./part4-real-world-examples/inventory/)** _(Coming Soon)_

#### 4.3 Social Media Applications
- **[News Feed](./part4-real-world-examples/news-feed/)** _(Coming Soon)_
- **[Notification System](./part4-real-world-examples/notification/)** _(Coming Soon)_
- **[Chat Application](./part4-real-world-examples/chat/)** _(Coming Soon)_

---

### [Part 5: Advanced Topics](./part5-advanced-topics)

#### 5.1 Design Principles
- **[DRY (Don't Repeat Yourself)](./part5-advanced-topics/principles/dry.md)** _(Coming Soon)_
- **[KISS (Keep It Simple, Stupid)](./part5-advanced-topics/principles/kiss.md)** _(Coming Soon)_
- **[YAGNI (You Aren't Gonna Need It)](./part5-advanced-topics/principles/yagni.md)** _(Coming Soon)_
- **[Composition over Inheritance](./part5-advanced-topics/principles/composition-over-inheritance.md)** _(Coming Soon)_
- **[Law of Demeter](./part5-advanced-topics/principles/law-of-demeter.md)** _(Coming Soon)_

#### 5.2 Code Quality
- **[Clean Code Practices](./part5-advanced-topics/clean-code/)** _(Coming Soon)_
  - Naming Conventions
  - Function Design
  - Comment Best Practices
  - Error Handling

- **[Refactoring Techniques](./part5-advanced-topics/refactoring/)** _(Coming Soon)_
  - Code Smells
  - Refactoring Patterns
  - Extract Method
  - Replace Conditional with Polymorphism

#### 5.3 Testing
- **[Unit Testing](./part5-advanced-topics/testing/unit-testing.md)** _(Coming Soon)_
- **[Test-Driven Development (TDD)](./part5-advanced-topics/testing/tdd.md)** _(Coming Soon)_
- **[Mocking and Stubbing](./part5-advanced-topics/testing/mocking.md)** _(Coming Soon)_

#### 5.4 Concurrency
- **[Thread Safety](./part5-advanced-topics/concurrency/thread-safety.md)** _(Coming Soon)_
- **[Synchronization](./part5-advanced-topics/concurrency/synchronization.md)** _(Coming Soon)_
- **[Concurrent Design Patterns](./part5-advanced-topics/concurrency/patterns.md)** _(Coming Soon)_

---

### [Part 6: Interview Preparation](./part6-interview-prep)

#### 6.1 Interview Questions
- **[OOP Concepts Questions](./part6-interview-prep/questions/oop.md)** _(Coming Soon)_
- **[SOLID Principles Questions](./part6-interview-prep/questions/solid.md)** _(Coming Soon)_
- **[Design Pattern Questions](./part6-interview-prep/questions/patterns.md)** _(Coming Soon)_
- **[UML Diagram Questions](./part6-interview-prep/questions/uml.md)** _(Coming Soon)_

#### 6.2 Problem-Solving Approach
- **[How to Approach LLD Problems](./part6-interview-prep/approach/problem-solving.md)** _(Coming Soon)_
  - Understanding Requirements
  - Identifying Entities and Relationships
  - Choosing Design Patterns
  - Drawing UML Diagrams
  - Writing Clean Code

#### 6.3 Common Mistakes
- **[Anti-Patterns to Avoid](./part6-interview-prep/mistakes/anti-patterns.md)** _(Coming Soon)_
- **[Design Pitfalls](./part6-interview-prep/mistakes/pitfalls.md)** _(Coming Soon)_

#### 6.4 Practice Problems
- **[Easy Level](./part6-interview-prep/practice/easy/)** _(Coming Soon)_
- **[Medium Level](./part6-interview-prep/practice/medium/)** _(Coming Soon)_
- **[Hard Level](./part6-interview-prep/practice/hard/)** _(Coming Soon)_

---

## 🎯 Learning Path

### For Beginners
1. Start with [Part 1: OOP Fundamentals](./part1-oop-fundamentals)
2. Master [SOLID Principles](./part1-oop-fundamentals/solid/)
3. Learn [UML Class Diagrams](./part3-uml-diagrams/class-diagram.md)
4. Understand [Relationships](./part3-uml-diagrams/relationships/)
5. Practice with [Simple Design Patterns](./part2-design-patterns/creational/)

### For Intermediate
1. Review [All Design Patterns](./part2-design-patterns)
2. Study [UML Sequence Diagrams](./part3-uml-diagrams/sequence-diagram.md)
3. Work on [Real-World Examples](./part4-real-world-examples)
4. Practice [LLD Interview Problems](./part6-interview-prep/practice/)

### For Advanced
1. Deep dive into [Advanced Topics](./part5-advanced-topics)
2. Master [All UML Diagrams](./part3-uml-diagrams)
3. Implement [Complex Systems](./part4-real-world-examples)
4. Focus on [Clean Code](./part5-advanced-topics/clean-code/) and [Refactoring](./part5-advanced-topics/refactoring/)

---

## 📖 How to Use This Guide

### Reading the Documentation
- Each topic includes:
  - **Definition**: Clear explanation of the concept
  - **Use Cases**: When and why to use it
  - **Examples**: Multiple real-world implementations
  - **Code**: Fully working Java code with detailed comments
  - **Diagrams**: UML diagrams for visual understanding

### Running the Code
```bash
# Clone the repository
git clone https://github.com/Shubhamghule1428/LLD.git

# Navigate to specific example
cd LLD/part2-design-patterns/creational/singleton

# Compile Java files
javac *.java

# Run the demo
java SingletonDemo
```

### Contributing
See [CONTRIBUTING.md](./CONTRIBUTING.md) for guidelines on:
- Adding new examples
- Improving existing content
- Reporting issues
- Suggesting enhancements

---

## 🔑 Key Features

✅ **Comprehensive Coverage**: From basics to advanced concepts  
✅ **Real-World Examples**: Practical implementations you'll use in production  
✅ **Visual Learning**: UML diagrams for every concept  
✅ **Interview Ready**: Focused on commonly asked questions  
✅ **Best Practices**: Industry-standard coding conventions  
✅ **Complete Code**: Fully working, runnable examples  
✅ **Progressive Learning**: Structured path from beginner to expert  

---

## 📊 Progress Tracker

| Part | Status | Completion |
|------|--------|------------|
| Part 1: OOP Fundamentals | ✅ Complete | 100% |
| Part 2: Design Patterns | 🟡 In Progress | 25% |
| Part 3: UML & Relationships | ✅ Complete | 100% |
| Part 4: Real-World Examples | 🔴 Planned | 0% |
| Part 5: Advanced Topics | 🔴 Planned | 0% |
| Part 6: Interview Prep | 🔴 Planned | 0% |

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. ⭐ Star this repository
2. 🐛 Report bugs or issues
3. 💡 Suggest new topics or examples
4. 📝 Improve documentation
5. 🔧 Submit pull requests

See [CONTRIBUTING.md](./CONTRIBUTING.md) for detailed guidelines.

---

## 📚 Resources

### Books
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gang of Four
- "Head First Design Patterns" by Eric Freeman
- "Clean Code" by Robert C. Martin
- "Effective Java" by Joshua Bloch

### Online Resources
- [Refactoring.Guru](https://refactoring.guru/design-patterns)
- [SourceMaking](https://sourcemaking.com/design_patterns)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)

---

## 📧 Contact

**Shubham Ghule**
- GitHub: [@Shubhamghule1428](https://github.com/Shubhamghule1428)
- Email: shubham.ghule.1428@gmail.com

---

---

## ⭐ Star History

If this guide helped you, please consider giving it a star! ⭐

---

## 🙏 Acknowledgments

Special thanks to:
- Gang of Four for Design Patterns
- Robert C. Martin for SOLID Principles
- The Java Community
- All contributors to this repository

---

<div align="center">

### 🚀 Happy Learning! 🚀

**Master Low-Level Design | Ace Your Interviews | Build Better Software**

[⬆ Back to Top](#low-level-design-lld-master-guide)

</div>