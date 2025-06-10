
##  💡 Dependency Injection (DI)

### Định nghĩa:
DI là kỹ thuật đưa (inject) các dependencies (đối tượng phụ thuộc) vào class thay vì class tự tạo.

### Ví dụ:

```java
// Thay vì:
UserService service = new UserService(new UserRepository());

// Dùng DI (Spring):
@Autowired
private UserService userService;
