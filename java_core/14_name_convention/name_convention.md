# 🧠 Java Naming Convention

## 1. 📦 Package

- ✅ Chữ thường toàn bộ
- ✅ Theo dạng: tổ chức → dự án → module

```java
package com.example.studentmanagement.controller;
```

---

## 2. 🧱 Class / Interface

- ✅ PascalCase (UpperCamelCase)
- ✅ Tên là danh từ

```java
public class StudentService { }
public interface Printable { }
```

---

## 3. 🔧 Method

- ✅ camelCase
- ✅ Tên là động từ hoặc hành động rõ ràng

```java
public void calculateSalary() { }
public boolean isAvailable() { }
```

---

## 4. 🧮 Variable

- ✅ camelCase
- ✅ Tên rõ nghĩa, không viết tắt tùy tiện

```java
String studentName;
int totalScore;
boolean isActive;
```

---

## 5. 🧊 Constant (Static Final Variable)

- ✅ UPPER_CASE
- ✅ Dùng dấu gạch dưới `_` để phân tách từ

```java
public static final int MAX_RETRY = 5;
public static final String DEFAULT_LANGUAGE = "en";
```

---

## 6. 🎭 Enum

- ✅ Enum class: PascalCase
- ✅ Enum constants: UPPER_CASE

```java
public enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED
}
```

---

## 7. 🧬 Generic Type Parameter

| Chữ | Ý nghĩa  |
|------|---------|
| `T`  | Type     |
| `E`  | Element  |
| `K`  | Key      |
| `V`  | Value    |

```java
public class Box<T> {
    private T item;
}
```

---

## 8. 📥 Getter / Setter

| Thuộc tính        | Getter        | Setter                |
|-------------------|---------------|------------------------|
| `boolean active`  | `isActive()`  | `setActive(boolean)`  |
| `String name`     | `getName()`   | `setName(String)`     |

---

## 📌 Tổng hợp nhanh

| Thành phần       | Kiểu chữ     | Ví dụ                     |
|------------------|--------------|---------------------------|
| Package          | lowercase     | `com.example.app`         |
| Class/Interface  | PascalCase    | `StudentService`          |
| Method           | camelCase     | `calculateSalary()`       |
| Variable         | camelCase     | `studentName`             |
| Constant         | UPPER_CASE    | `MAX_RETRY`               |
| Enum constant    | UPPER_CASE    | `OrderStatus.PENDING`     |
| Generic Type     | Single letter | `T`, `E`, `K`, `V`         |

---

> ✅ Áp dụng naming convention giúp code rõ ràng, nhất quán và chuyên nghiệp hơn.