
### 🚀 **PHỎNG VẤN SPRING CORE**

#### 🔹 Câu 1:

**Bạn hiểu Spring Framework là gì? Tại sao lại cần dùng Spring thay vì Java thuần?**

    - Spring là framework giúp quản lý, tổ chức code Java hiệu quả
    - Spring giúp quản lý các bean  và kết nối các module một cách linh hoạt thay vì
    khởi tạo và quản lý bằng tay như java thuần


#### 🔹 Câu 2:

**Spring Container là gì? Có những loại ApplicationContext nào trong Spring?**

    - Spring Container là thành phần chịu trách nhiệm tạo, quản lý vòng đời và cấu hình các bean trong
        ứng dụng
    - Các loại ApplicationContext phổ biến:
        - ClassPathXmlApplicationContext
        - AnnotationConfigApplicationContext
        - WebApplicationContext (cho Spring Web MVC)

#### 🔹 Câu 3:

**Dependency Injection (DI) là gì? Spring hỗ trợ những loại DI nào? Cho ví dụ.**
    - Dependency Injection (DI) là tiêm sự phụ thuộc , cung cấp phụ thuộc bên ngoài thay vì tạo trực tiếp trong đối tượng
    - Spring hỗ trợ những loại DI:
        + Constructter Injection
        + Setter Injection

---

#### 🔹 Câu 4:

**Sự khác biệt giữa @Component, @Service, @Repository, @Controller là gì?**
    - Tất cả đều là  annotation, đánh dấu class là Bean để Spring quản lý.
    - @Component: Đánh dấu bean thông thường
    - @Service: Dùng cho tầng bussiness/service
    - @Repository: Dùng cho tầng kết nối db
    - @Controller: Dùng cho tầng web controller

---

#### 🔹 Câu 5:

**Scope của bean trong Spring là gì? Các loại scope phổ biến là gì?**
    - Scope xác định vòng đời của Bean
    - Các loại scope phổ biến:
        + singleton (mặc định) – chỉ có 1 instance trong toàn bộ container
        + prototype – mỗi lần yêu cầu sẽ tạo mới
        + (Trong web): request, session, application, websocket

---

#### 🔹 Câu 6:

**Spring Bean Lifecycle gồm những giai đoạn nào? Có cách nào để can thiệp vào quá trình khởi tạo hoặc huỷ bean không?**
    - Spring Bean Lifecycle:
     + IoC container tạo bean bằng cách gọi constructor (có thể inject các bean dependency vào đây)
     + Gọi các setter method để inject các bean vào bằng setter based injection
     + Các method khởi tạo khác được gọi (không cần quan tâm nhiều)
     + @PostConstructor được gọi
     Init method được gọi
     Sau đó bean sẽ sẵn sàng hoạt động. Nếu sau đó bean không dùng nữa thì nó sẽ được hủy:
     + Gọi @PreDestroy
     + Hủy bean như các object thông thường
---

#### 🔹 Câu 7:

**Sự khác biệt giữa Bean và POJO trong Spring là gì?**
    - POJO (Plain Old Java Object): class Java thông thường, không phụ thuộc framework nào.
    - Bean trong Spring: là POJO nhưng được Spring quản lý vòng đời và phụ thuộc.
    - Tức là: mọi Spring Bean là POJO, nhưng không phải mọi POJO là Spring Bean.

---

#### 🔹 Câu 8:

**Làm sao Spring biết được class nào là Bean? Có thể định nghĩa Bean theo bao nhiêu cách?**

    Spring nhận biết Bean qua:
    - Annotation
    -Java Config (@Bean trong @Configuration)

---

#### 🔹 Câu 9:

**Annotation `@Autowired` hoạt động như thế nào? Có bao nhiêu cách autowire một bean?**
    - @Autowired tự động tìm và inject Bean phù hợp trong Spring context.

    Các cách Autowire:
    - Constructor (khuyến khích)
    - Setter
    - Field (ít dùng, khó test)
---

#### 🔹 Câu 10:

**Sự khác nhau giữa `@Qualifier` và `@Primary` là gì? Khi nào nên dùng từng cái?**

    - @Primary: ưu tiên Bean này nếu có nhiều Bean cùng loại
    - @Qualifier: chỉ định rõ tên Bean cần inject
    - Nếu dùng @Primary thì không cần @Qualifier, ngược lại nếu có nhiều Bean → @Qualifier giúp Spring biết chọn đúng bean.