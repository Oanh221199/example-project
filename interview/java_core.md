Tuyệt! Bây giờ mình sẽ đóng vai người phỏng vấn tuyển dụng vị trí Java Backend Developer (Java Core). Dưới đây là một loạt câu hỏi từ dễ đến khó, bao phủ các chủ đề phổ biến trong **Java Core**, như OOP, Collections, Exception, Multithreading, JVM...

---

### 📌 **Vòng phỏng vấn Java Core – Bắt đầu nhé:**

#### 🧠 **1. OOP (Object-Oriented Programming)**

1. Em hãy giải thích 4 tính chất của lập trình hướng đối tượng? Cho ví dụ thực tế trong Java.
    - Tính trừu tượng ( Ẩn đi những chi tiết triển khai , chỉ hiện thị chức năng cần thiết cho người dùng)
      Ví dụ: Sử dụng abstract class, interface trong java
      Ví như có class trừu tượng là Vehicle có phương thức move
      Không quan tâm nó là Car hay Bike , chỉ biết là nó có thể move
    - Tính đóng gói ( Giấu những thông tin biến logic trong một lớp chỉ có thể truy cập qua getter/setter)
      Ví dụ: Sử dụng private các thuộc tính của class chỉ truy cập qua getter/setter
      Như có lớp Vehicle có thuộc tính color, không thể thay đổi trực tiếp color mà phải thông qua getter/setter
    - Tính kế thừa ( Kế thừa các thuộc tính và phương thức của lớp cha để có thể tái sử dụng)
      Ví dụ: Dùng từ khóa extends
      Như class Bird kế thừa phương thức eat() của class Animal và có thể có thể có phương thức khác fly()
    - Tính đa hình ( Một đối tượng có thể triển khai theo nhiều hình thái khác nhau)
      Ví dụ sử dụng override, overload.
      Như Animal có phương thức sound , dog và cat kế thừa Animal, dog thì sound là go go, cat thì sound là meomeo
2. Em đã từng sử dụng abstract class và interface chưa? Khi nào nên dùng abstract class, khi nào nên dùng interface?
    - E từng sử dụng abtract class và interface rồi
    - Em dùng abstract class khi cần dùng lại logic, dùng interface khi muốn đa kế thừa hành vi
    - Ví dụ: 
      
3. Tính đa hình (Polymorphism) hoạt động như thế nào trong Java?
    - Tính đa hình triển khai đối tượng theo nhiều hình thái khác nhau
    - Thể hiện qua override và overloading
    - override: ghi đè phương thức, có cùng tên cùng tham số, được sử dụng ghi đè ở class con
    - overloading: 1 phương thức có thể có cùng tên nhưng khác tham số

#### 🧰 **2. Collections Framework**

4. Sự khác biệt giữa `ArrayList` và `LinkedList` là gì?
     Dựa trên list của java nhưng lại khác nhau
    - Arraylist : mảng động, thêm cuối nhanh, truy cập phần tử nhanh, thêm vào đầu giữa chậm, ít tốn bộ nhớ hơn
    - Linkedlist: dựa trên liên kết đôi, thêm vào đầu giữa nhanh nếu đã có node, tốn bộ nhớ hơn
   
5. Em có thể giải thích sự khác nhau giữa `HashMap`, `TreeMap` và `LinkedHashMap` không?
   - HashMap dựa trên hamg băm
   - Treemap dựa trên cây đỏ đen
   - LinkedHashMap dựa trên liên kết đôi
   
6. Nếu em dùng `HashMap` trong môi trường đa luồng thì có vấn đề gì không? Làm sao để xử lý?
    - HashMap không đồng bộ (non-synchronized), nên nếu nhiều thread cùng đọc/ghi vào HashMap, sẽ xảy ra race condition – dữ liệu bị ghi đè hoặc mất mát.
#### ⚙️ **3. Exception Handling**

7. Checked exception vs Unchecked exception là gì? Cho ví dụ minh họa.
   - Checked exception:  Compiler bắt buộc xử lý (vd: SQLException)
    - Unchecked exception: Compiler không bắt buộc xử lý(vd: NullPointerException)
8. Sự khác biệt giữa `throw` và `throws` trong Java?
     - throw: Ném 1 exception duy nhất 
     - throws: Có thể khai báo nhiều exception
9. Em có từng tạo custom exception chưa? Khi nào nên làm vậy?
    - E từng tạo rồi ạ
    - Mục đích là để  biểu diễn lỗi rõ ràng hơn, dễ xử lý khi xảy ra lỗi

#### 🚦 **4. Multithreading và Concurrency**

10. Em hiểu gì về Thread và Runnable? Khác nhau thế nào?
    - Thread là đơn vị nhỏ nhất của cpu thực thi 
    - Runnable là một interface đại diện cho một tác vụ có thể chạy bằng thread.
11. Giải thích về `synchronized` keyword? Có nhược điểm gì?
    - synchronized là từ khóa dùng để đảm bảo rằng chỉ một thread được truy cập một khối code hoặc method tại một thời điểm.
    - Nó giúp tránh race condition, đảm bảo thread-safety.
      Nhược điểm:
        + Gây giảm hiệu suất do blocking.
        + Dễ bị deadlock nếu dùng sai cách.
        + Không kiểm soát chi tiết được như Lock.
    
12. Em có biết về `ExecutorService` và `ThreadPoolExecutor` không? Dùng trong trường hợp nào?
    - ExecutorService là interface quản lý thread pool – giúp tái sử dụng thread, không cần tạo thread thủ công.
    - ThreadPoolExecutor là implement mạnh mẽ cho ExecutorService, cho phép cấu hình: 
        + Số thread core & max
        + Queue size
        + Rejection policy 
    - Khi dùng:
        + Khi cần thực thi song song nhiều task.
        + Khi cần tối ưu hiệu suất, tránh tạo quá nhiều thread.
        + Khi cần quản lý task timeout, shutdown, exception...
    
13. Deadlock là gì? Làm sao để tránh?
    - Hai hoặc nhiều thread chờ tài nguyên mà tài nguyên đó đang bị giữ bởi nhau,
    dẫn đến tất cả bị "đứng yên" và không thread nào tiếp tục thực thi được.

#### 🔥 **5. JVM và Memory**

14. JVM hoạt động như thế nào khi em chạy 1 chương trình Java?
    Viết code java -> biên dịch qua javac->.class chứa mã máy bytecode
15. Heap và Stack khác nhau thế nào trong Java?
    heap lưu đối tượng
    stack lưu biến cục bộ và tên phương thức
16. Em có hiểu gì về Garbage Collection? Có các loại GC nào?
    Garbage Collection dùng để thu hồi bộ nhớ khi không dùng
17. Em có thể dùng công cụ nào để theo dõi memory usage hoặc tìm memory leak?
    - Grafana
    - Profiler inteliji

#### 📌 **6. Java 8 và các version mới**

18. Em đã dùng Java 8 chưa? Lambda Expression là gì?
    - E đã dùng java 8 rồi, lambda expression là cách viết ngắn gọn của func
19. Stream API khác gì với Collection?
    -  collection là data structure , lưu trữ phần tử trong bộ nhớ
    -  Stream api là data processing, không lưu dữ liệu chỉ xử lý và trả kết quả
20. Optional trong Java dùng để làm gì? Ưu điểm?
    - Dùng để đại diện cho giá trị null hoặc không null
    - Ưu điểm:
     + Tránh nullPointerException ( không còn check if  object khác null ở mọi nơi)
     + Viết code dễ dàng hơn
    

