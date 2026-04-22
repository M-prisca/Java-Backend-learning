# Reading Input in Java with Scanner

In Java, programs often need to **receive input from the user**.  
The most common way to read input from the **standard input (keyboard)** is by using the **`Scanner` class** from the `java.util` package.

The `Scanner` class provides many methods for reading different types of input, including **strings, numbers, and booleans**.

---

## 1. Importing the Scanner Class

Before using `Scanner`, it must be imported from the `java.util` package.

Example:

```java
import java.util.Scanner;
```

---

## 2. Creating a Scanner Object

To read input, you must create a **Scanner object** connected to the **standard input stream (`System.in`)**.

Example:

```java
Scanner scanner = new Scanner(System.in);
```

Explanation:

- `Scanner` → the class
- `scanner` → the object name
- `System.in` → the standard input (keyboard)

---

## 3. Reading Strings with `next()`

The **`next()`** method reads input **until the next whitespace** (space, tab, or newline).

This means it reads **only one word at a time**.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String name = scanner.next();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
```

Input:

```
John Doe
```

Output:

```
Hello John
```

Explanation:

- `next()` stops reading when it encounters a **space**.
- Only `"John"` is stored.

---

## 4. Reading Full Lines with `nextLine()`

The **`nextLine()`** method reads **the entire line until the Enter key is pressed**.

This means it can read **multiple words including spaces**.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Hello " + fullName);

        scanner.close();
    }
}
```

Input:

```
John Doe
```

Output:

```
Hello John Doe
```

Explanation:

- `nextLine()` reads **everything on the line**.

---

## 5. Difference Between `next()` and `nextLine()`

| Method       | What It Reads | Stops When                          |
| ------------ | ------------- | ----------------------------------- |
| `next()`     | One word      | At whitespace (space, tab, newline) |
| `nextLine()` | Entire line   | At the end of the line              |

Example demonstrating the difference:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String line = scanner.nextLine();

        System.out.println("Word: " + word);
        System.out.println("Line: " + line);

        scanner.close();
    }
}
```

Input:

```
Hello World
```

Output:

```
Word: Hello
Line:  World
```

Explanation:

- `next()` reads `"Hello"`
- `nextLine()` reads the **remaining part of the line**.

---

## 6. Why Scanner is Useful

The `Scanner` class is one of the **simplest and most commonly used ways** to read input in Java.

It is especially useful for:

- Programming challenges
- Beginner Java programs
- Console-based applications
- Reading different types of input (strings, integers, doubles, etc.)

Example reading multiple inputs:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        scanner.close();
    }
}
```

---

## 7. Key Takeaways

- The **`Scanner` class** is used to read input from the keyboard.
- It belongs to the **`java.util` package**.
- `next()` reads **a single word until whitespace**.
- `nextLine()` reads **the entire line**.
- `Scanner` is commonly used in **Java learning and programming exercises**.
