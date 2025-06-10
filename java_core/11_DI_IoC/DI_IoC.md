
# 💡 Dependency Injection (DI) & Inversion of Control (IoC)

## 1. Inversion of Control (IoC)

### 🔎 Định nghĩa:
Inversion of Control (IoC) là một nguyên lý trong lập trình hướng đối tượng, trong đó **control của chương trình (tạo và quản lý đối tượng) được chuyển từ chính class sang một entity bên ngoài**, thường là **IoC Container**.

### 🧠 Ví dụ trước khi có IoC:
```java
public class UserService {
    private UserRepository repo;

    public UserService() {
        this.repo = new UserRepository(); // tự tạo đối tượng phụ thuộc
    }
}
```

---

## 2. 💡 Dependency Injection (DI)

### 🔎 Định nghĩa:
Dependency Injection (DI) là kỹ thuật đưa (inject) các dependencies (đối tượng phụ thuộc) vào class thay vì class tự tạo.

### 🔧 Ví dụ:

```java
// Không sử dụng DI
UserService service = new UserService(new UserRepository());

// Sử dụng DI với Spring
@Component
public class MyController {
    @Autowired
    private UserService userService;
}
```

### ⚙️ Các hình thức DI:
| Hình thức DI    | Mô tả                                                            |
|----------------|-------------------------------------------------------------------|
| Constructor     | Inject thông qua constructor (an toàn và phổ biến nhất)          |
| Setter          | Inject thông qua setter method                                   |
| Field           | Inject trực tiếp vào trường (dễ dùng nhưng khó test)             |

### 🧪 Ví dụ bổ sung:

```java
// Constructor Injection
@Component
public class BookService {
    private final BookRepository repo;

    @Autowired
    public BookService(BookRepository repo) {
        this.repo = repo;
    }
}
```

```java
// Setter Injection
@Component
public class BookService {
    private BookRepository repo;

    @Autowired
    public void setRepo(BookRepository repo) {
        this.repo = repo;
    }
}
```

```java
// Field Injection
@Component
public class BookService {
    @Autowired
    private BookRepository repo;
}
```

---

## 3. Spring IoC Container

Spring Framework cung cấp một **IoC Container** quản lý lifecycle của các bean (object) và thực hiện DI thông qua:
- `@Component`, `@Service`, `@Repository`, `@Controller`
- `@Autowired`, `@Inject`, `@Qualifier`,...

---

## 4. ⚖️ So sánh IoC vs DI

| Tiêu chí         | IoC                                       | DI                                           |
|------------------|--------------------------------------------|----------------------------------------------|
| Bản chất         | Nguyên lý thiết kế                         | Kỹ thuật cụ thể để thực hiện IoC              |
| Mục tiêu          | Đảo ngược quyền kiểm soát                 | Cung cấp phụ thuộc từ bên ngoài              |
| Thực thi         | Thông qua container/framework             | Thông qua constructor, setter, field,...     |

---

## ✅ Kết luận

- **IoC** là khái niệm tổng quát: ứng dụng không kiểm soát chính nó nữa, framework sẽ làm việc đó.
- **DI** là kỹ thuật cụ thể dùng để thực hiện IoC.
- Sử dụng DI giúp tăng tính mở rộng, dễ kiểm thử và bảo trì hệ thống.
