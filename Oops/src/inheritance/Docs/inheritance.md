# Object-Oriented Programming (OOP) – Inheritance

## Definition
Inheritance is a mechanism where a new class **derives properties and behaviors** from an existing class.  
It enables **code reuse**, **polymorphism**, and **clear hierarchies**.

---

## Use Case
Employee management system with different employee types sharing common attributes and behavior.

---

## Class Hierarchy (Inheritance Structure)

```mermaid
classDiagram
    Employee <|-- FullTimeEmployee
    Employee <|-- ContractEmployee

    class Employee {
        # String name
        # String employeeId
        # double baseSalary
        + calculateSalary()
        + displayInfo()
    }

    class FullTimeEmployee {
        - double benefits
        + calculateSalary()
    }

    class ContractEmployee {
        - int hoursWorked
        - double hourlyRate
        + calculateSalary()
    }
```

**Runtime behaviour**
```mermaid
	
flowchart TD
    App --> EmployeeRef
    EmployeeRef -->|runtime binding| FullTimeEmployee
    EmployeeRef -->|runtime binding| ContractEmployee

    FullTimeEmployee --> calculateSalary
    ContractEmployee --> calculateSalary

```

-----

# Types

**Single Inheritance**
```mermaid

	classDiagram
		A <|-- B

```

**Multilevel Inheritance**

```mermaid
	classDiagram
		A<|-- B
		B<|-- C
```

**Hierarchical Inheritance**

```mermaid
	classDiagram
		A<|--B
		A<|--C
		A<|--D
```

**Multiple Inheritance** - Not supported by java

```mermaid

	classDiagram
	A<|-- B
	C<|-- B
```
*Note - Diamond ambiguity problem (Used Interface for this)