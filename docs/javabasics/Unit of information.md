# Units of Information

Understanding the **units of information** is fundamental in computer science. These units describe how data is represented, stored, and processed in digital systems.

---

## 1. Bit (Binary Digit)

The **bit** is the **smallest unit of information** in computing.

A bit can only have **two possible values**:

```
0
1
```

Every piece of digital data — text, images, videos, and programs — is ultimately represented as sequences of **bits**.

---

## 2. Byte

A **byte** is a group of **8 bits**.

```
1 byte = 8 bits
```

Bytes are commonly used because they are large enough to represent meaningful data.

### Example

```
01000001
```

This binary sequence represents the character **"A"** in many character encoding systems.

---

## 3. Binary-Based Units

To make it easier to measure large amounts of data, computer science uses **binary-based units** derived from powers of 2.

These units are based on the fact that computers operate using **binary (base 2)**.

### Common Binary Units

| Unit             | Value in Bytes      | Power of 2 |
| ---------------- | ------------------- | ---------- |
| 1 Byte (B)       | 8 bits              | -          |
| 1 Kibibyte (KiB) | 1024 bytes          | 2¹⁰        |
| 1 Mebibyte (MiB) | 1,048,576 bytes     | 2²⁰        |
| 1 Gibibyte (GiB) | 1,073,741,824 bytes | 2³⁰        |

### Conversion Examples

```
1 KiB = 2¹⁰ = 1024 bytes
1 MiB = 2²⁰ = 1,048,576 bytes
1 GiB = 2³⁰ = 1,073,741,824 bytes
```

---

## 4. Decimal vs Binary Units

It is important to distinguish between **decimal units** and **binary units**, because they are not the same.

### Decimal Units (Used by Storage Manufacturers)

These are based on **powers of 10**.

| Unit | Value               |
| ---- | ------------------- |
| 1 kB | 1000 bytes          |
| 1 MB | 1,000,000 bytes     |
| 1 GB | 1,000,000,000 bytes |

### Binary Units (Used by Operating Systems)

These are based on **powers of 2**.

| Unit  | Value               |
| ----- | ------------------- |
| 1 KiB | 1024 bytes          |
| 1 MiB | 1,048,576 bytes     |
| 1 GiB | 1,073,741,824 bytes |

---

## 5. Why the Difference Matters

Understanding the difference between **decimal** and **binary** units helps avoid confusion.

For example:

- A **500 GB hard drive** (decimal units) may appear as about **465 GiB** in an operating system.
- This happens because the OS calculates storage using **binary units**.

---

## 6. Key Takeaways

- The **bit** is the smallest unit of information.
- **1 byte = 8 bits**.
- Computers use **binary-based units** such as **KiB, MiB, and GiB**.
- Binary units are based on **powers of 2**.
- Storage devices often use **decimal units (kB, MB, GB)**, while operating systems use **binary units (KiB, MiB, GiB)**.
- Knowing the difference prevents confusion when calculating **memory and storage sizes**.
