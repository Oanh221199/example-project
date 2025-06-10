### 1. Maven dependency scope là gì?

* Xác định thời điểm và cách thức một thư viện/phụ thuộc (dependency) được sử dụng trong quá trình biên dịch, kiểm thử, chạy ứng dụng, hoặc đóng gói.

### 2. Kể tên và giải thích 6 loại scope trong Maven.

* **1. compile (default)**

    * Thời điểm sử dụng: compile, test, runtime.
    * Ý nghĩa: Bắt buộc khi biên dịch và sử dụng cả lúc chạy.
    * Ví dụ sử dụng: Các thư viện core mà code cần biên dịch.

  ```xml
  <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-lang3</artifactId>
      <version>3.12.0</version>
      <scope>compile</scope>
  </dependency>
  ```

* **2. provided** *(Không được đóng gói vào file .war hay .jar.)*

    * Thời điểm sử dụng: compile, test (không dùng lúc runtime)
    * Ý nghĩa: Phụ thuộc cần khi biên dịch, nhưng sẽ được cung cấp bởi môi trường runtime (như server container: Tomcat, JBoss,...).
    * Ví dụ sử dụng: Servlet API, Java EE libraries.

  ```xml
  <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
      <scope>provided</scope>
  </dependency>
  ```

* **3. runtime**

    * Thời điểm sử dụng: runtime, test (không dùng lúc compile)
    * Ý nghĩa: Phụ thuộc chỉ cần khi chạy ứng dụng, không cần khi biên dịch.
    * Ví dụ sử dụng: JDBC driver, logging implementation.

  ```xml
  <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.33</version>
      <scope>runtime</scope>
  </dependency>
  ```

* **4. test**

    * Thời điểm sử dụng: test only
    * Ý nghĩa: Phụ thuộc chỉ được dùng cho việc kiểm thử (JUnit, Mockito,...), không dùng khi build hoặc chạy ứng dụng chính.

  ```xml
  <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.8.2</version>
      <scope>test</scope>
  </dependency>
  ```

* **5. system** *(Ít dùng, không khuyến khích)*

    * Thời điểm sử dụng: compile, runtime
    * Ý nghĩa: Giống `provided` nhưng cần chỉ rõ đường dẫn file JAR cục bộ.
    * Nhược điểm: Không portable, dễ lỗi.

  ```xml
  <dependency>
      <groupId>com.example</groupId>
      <artifactId>custom-lib</artifactId>
      <version>1.0</version>
      <scope>system</scope>
      <systemPath>${project.basedir}/lib/custom-lib.jar</systemPath>
  </dependency>
  ```

* **6. import** *(chỉ dùng trong `<dependencyManagement>`)*

    * Ý nghĩa: Dùng để import các BOM (Bill of Materials), giúp quản lý version của nhiều dependencies một cách tập trung.

  ```xml
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-dependencies</artifactId>
      <version>3.2.0</version>
      <type>pom</type>
      <scope>import</scope>
  </dependency>
  ```
### 2. Sự khác biệt giữa compile và provided scope là gì?
    