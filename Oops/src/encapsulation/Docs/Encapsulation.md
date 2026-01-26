# Object-Oriented Programming (OOP) – Encapsulation

## 1. Encapsulation

### Definition

**Bundling data (attributes) and methods that operate on that data within a single unit (class), and hiding internal details.**

Encapsulation means **hiding internal state** and **forcing controlled access** through methods.  
Direct access to sensitive data is blocked by design.

---

## Class-Level View

```mermaid
classDiagram
    class BankAccount {
        - double balance
        - String accountNumber
        + deposit(amount)
        + withdraw(amount)
        + getBalance()
    }
	
```

```mermaid
flowchart LR
    User -->|calls| deposit
    User -->|calls| withdraw
    User -->|calls| getBalance

    deposit --> balance
    withdraw --> balance
    getBalance --> balance

    User -. cannot access .-> balance

```

```mermaid
flowchart LR
	user --> deposit
	user --> withdraw
	user --> getBalance
	deposit --> balance
	withdraw --> balance
	getBalance --> balance

```