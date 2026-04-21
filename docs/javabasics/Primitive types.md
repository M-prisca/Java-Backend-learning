# Java Primitive Data Types and their size

In Java, data is stored using **data types**. These types define **what kind of value a variable can hold** and **how much memory is allocated** for it.

Java primitive data types can be grouped into several categories:

- **Integer types** – store whole numbers
- **Floating-point types** – store numbers with fractional parts
- **Character type** – stores a single character
- **Boolean type** – stores logical values (true or false)

Understanding the **size and range** of these types is important, especially for **technical interviews and efficient programming**.

---

## 1. Integer Types

Integer types store **whole numbers without decimal points**.

Java provides four integer primitive types:

| Type  | Size    | Range             | Example                             |
| ----- | ------- | ----------------- | ----------------------------------- |
| byte  | 8 bits  | -128 to 127       | `byte age = 25;`                    |
| short | 16 bits | -32,768 to 32,767 | `short temperature = 1200;`         |
| int   | 32 bits | -2³¹ to 2³¹-1     | `int population = 1000000;`         |
| long  | 64 bits | -2⁶³ to 2⁶³-1     | `long distanceToMoon = 384400000L;` |

### Example

```java
byte smallNumber = 100;
short mediumNumber = 20000;
int largeNumber = 1000000;
long veryLargeNumber = 9000000000L;
```

Notes:

- `int` is the **most commonly used integer type**.
- `long` requires the suffix **L** when assigning large numbers.

---

## 2. Floating-Point Types

Floating-point types represent **numbers with fractional or decimal parts**.

Java provides two floating-point types:

| Type   | Size    | Precision           | Example                          |
| ------ | ------- | ------------------- | -------------------------------- |
| float  | 32 bits | ~6–7 decimal digits | `float price = 19.99f;`          |
| double | 64 bits | ~15 decimal digits  | `double pi = 3.141592653589793;` |

### Example

```java
float temperature = 36.6f;
double pi = 3.141592653589793;
double gravity = 9.81;
```

Notes:

- `double` is **more precise** and therefore **used by default**.
- `float` requires the suffix **f**.

---

## 3. Character Type

The `char` type stores **a single character**, such as:

- Letters (A, B, C, a, b, c)
- Digits (0–9)
- Symbols (!, @, #)

A `char` occupies **16 bits** and stores characters using **Unicode**.

### Example

```java
char letter = 'A';
char digit = '7';
char symbol = '#';
```

Characters are written using **single quotes `' '`**.

---

## 4. Boolean Type

The `boolean` type represents **logical values**.

It can store **only two possible values**:

- `true`
- `false`

This type is commonly used in **conditions, decisions, and control flow**.

### Example

```java
boolean isJavaFun = true;
boolean isLoggedIn = false;
```

Example in a condition:

```java
boolean isAdult = true;

if (isAdult) {
    System.out.println("Access granted");
}
```

---

## 5. Summary of Java Primitive Types

| Category       | Type    | Size          | Description                      |
| -------------- | ------- | ------------- | -------------------------------- |
| Integer        | byte    | 8 bits        | Small integer values             |
| Integer        | short   | 16 bits       | Medium integer values            |
| Integer        | int     | 32 bits       | Standard integer type            |
| Integer        | long    | 64 bits       | Very large integers              |
| Floating-point | float   | 32 bits       | Decimal numbers (less precision) |
| Floating-point | double  | 64 bits       | Decimal numbers (high precision) |
| Character      | char    | 16 bits       | Single Unicode character         |
| Logical        | boolean | JVM dependent | True or false values             |

---

## 6. Key Takeaways

- Java primitive data types define **how data is stored in memory**.
- **Integer types** store whole numbers (`byte`, `short`, `int`, `long`).
- **Floating-point types** store numbers with decimals (`float`, `double`).
- **char** stores a single character using Unicode.
- **boolean** stores logical values (`true` or `false`).
- Knowing the **size and range** of these data types is useful for **efficient programming and technical interviews**.
