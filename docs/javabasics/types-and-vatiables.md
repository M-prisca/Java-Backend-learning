# Java Basics: Types and Variables

## Overview

A **variable** is a named container used to store data. Each variable has a **type** that determines what values it can hold and what operations can be performed on it.

---

## Declaring and Initializing Variables

### Syntax

```java
DataType variableName = initialization;
```

### Components

| Part           | Description                         |
| -------------- | ----------------------------------- |
| DataType       | Type of data the variable can store |
| variableName   | Name used to access the variable    |
| =              | Assignment operator                 |
| initialization | Value assigned to the variable      |

### Examples

```java
String language = "java";
int numberOfApples = 5;
```

- `String` stores text
- `int` stores integer numbers

---

## Variable Naming Rules

Variable names (**identifiers**) must follow these rules:

- Cannot start with a number
- Usually start with a letter
- Are **case-sensitive**
- Should be meaningful

### Example

```java
String language = "Java";
String Language = "Python"; // different variable
```

---

## Accessing Variable Values

After declaration, a variable can be used by its name.

```java
String dayOfWeek = "Monday";
System.out.println(dayOfWeek);
```

**Output**

```
Monday
```

---

## Assigning One Variable to Another

A variable can receive the value of another variable.

```java
int one = 1;
int num = one;

System.out.println(num);
```

**Output**

```
1
```

---

## Changing Variable Values

Variables can be **updated after declaration**.

```java
String dayOfWeek = "Monday";
System.out.println(dayOfWeek);

dayOfWeek = "Tuesday";
System.out.println(dayOfWeek);
```

**Output**

```
Monday
Tuesday
```

---

## Type Restrictions

A variable can only store values of its **declared type**.

### Correct

```java
int number = 10;
number = 11;
```

### Incorrect

```java
int number = 10;
number = "twelve"; // ERROR
```

---

## Alternative Declarations

### Multiple Variables

```java
String language = "java", version = "8 or newer";
```

### Separate Declaration and Initialization

```java
int age; // declaration
age = 35; // initialization
```

These styles are valid but **less commonly used**.

---

## Type Inference (`var`) — Java 10+

Java 10 introduced `var`, allowing the compiler to **infer the variable type automatically**.

### Syntax

```java
var variableName = initialization;
```

### Example

```java
var language = "Java"; // String
var version = 10;      // int
```

### Notes

**Advantages**

- Less typing
- Cleaner code

**Disadvantages**

- Type is not explicit
- May reduce readability

---

## Summary

| Concept        | Description                                  |
| -------------- | -------------------------------------------- |
| Variable       | Container used to store data                 |
| Declaration    | Defining a variable with a type and name     |
| Initialization | Assigning a value to a variable              |
| Assignment     | Using `=` to set or change values            |
| Type Safety    | Variables accept only their declared type    |
| Type Inference | `var` lets Java infer the type automatically |

---

## Key Takeaways

- Variables store data such as **numbers and text**.
- Every variable needs a **type and a name**.
- Variables can **change value**, but must **keep the same type**.
- Java 10 introduced **`var`** for automatic type inference.
