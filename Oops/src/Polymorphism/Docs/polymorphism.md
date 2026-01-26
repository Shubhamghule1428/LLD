# Object-Oriented Programming (OOP) – Polymorphism

## Definition
Polymorphism is the ability of objects to take **multiple forms**.  
One interface or base type, **multiple implementations**.

Same method call.  
Different runtime behavior.

---

## Types of Polymorphism

- **Compile-time Polymorphism** → Method Overloading
- **Runtime Polymorphism** → Method Overriding

---

## Use Case
Payment processing system supporting multiple payment methods  
(Credit Card, Upi, etc.)

---

## Runtime Polymorphism (Overriding | Interface-Based)

### Class & Interface Structure

```mermaid
classDiagram
    PaymentProcessor <|.. CreditCardProcessor
    PaymentProcessor <|.. UpiProcessor

    class PaymentProcessor {
        <<interface>>
        + processPayment(amount)
        + getPaymentMethod()
    }

    class CreditCardProcessor {
        - String cardNumber
        + processPayment(amount)
        + getPaymentMethod()
    }

    class UpiProcessor {
        - String email
        + processPayment(amount)
        + getPaymentMethod()
    }
```

# **Runtime Dispatch (what actully happens)**

```mermaid
flowchart TD
    PaymentService --> PaymentProcessorRef
    PaymentProcessorRef -->|runtime binding| CreditCardProcessor
    PaymentProcessorRef -->|runtime binding| UpiProcessor

    CreditCardProcessor --> processPayment
    UpiProcessor --> processPayment
```

Important-
1. `PaymentService` depends on interface not on concrete class
2. Behaviour is decided on Runtime

-----
```mermaid

sequenceDiagram
    participant Main
    participant PaymentService
    participant CreditCardProcessor
    participant UpiProcessor

    Main ->> PaymentService: executePayment(CreditCardProcessor, 100)
    PaymentService ->> CreditCardProcessor: processPayment(100)

    Main ->> PaymentService: executePayment(UpiProcessor, 200)
    PaymentService ->> UpiProcessor: processPayment(200)

```

***
# Compile Time Polymorphism (Overloading)
**Method resolution at Compile TIme**
```mermaid
	flowchart LR
    add_int_2["add(int, int)"] --> Compiler
    add_double_2["add(double, double)"] --> Compiler
    add_int_3["add(int, int, int)"] --> Compiler

```

- Same method name

- Different parameter lists

- Decision made at compile time

- No inheritance required
***
| Concept                   | Code Element                       |
| ------------------------- | ---------------------------------- |
| Interface                 | `PaymentProcessor`                 |
| Runtime Polymorphism      | `processPayment()` override        |
| Compile-time Polymorphism | `Calculator.add()` overloads       |
| Loose Coupling            | `executePayment(PaymentProcessor)` |

