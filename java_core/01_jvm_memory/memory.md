# Java Memory Model
#####Java tự động quản lý bộ nhớ qua garbage collection. Bạn không cần phải lo lắng quá nhiều về việc cấp phát và giải phóng bộ nhớ, nhưng cần lưu ý để tránh memory leaks và OutOfMemoryError bằng cách quản lý tốt các tham chiếu đối tượng.
##1. Các khu vực bộ nhớ trong Java:

<html>
<table border="1" cellspacing="0" cellpadding="8">
  <tr>
    <th colspan="2">Java Memory</th>
  </tr>
  <tr>
    <th>Stack</th>
    <th>Heap</th>
  </tr>
  <tr>
    <td>
      <div><strong>Thread 1</strong></div>
      <div>├─ a = 5</div>
      <div>└─ temp()</div>
      <br>
      <div><strong>Thread 2</strong></div>
      <div>├─ x = 10</div>
      <div>└─ run()</div>
    </td>
    <td>
      <div>Object 1</div>
      <div>Object 2</div>
      <div>Object 3</div>
    </td>
  </tr>
  <tr>
    <td colspan="2">
      <strong>Metaspace</strong> (Class info)<br>
      Method Area
    </td>
  </tr>
</table>
</html>

- **1. Stack (Biến cục bộ và Thông tin phương thức)**:
    - Stack là khu vực bộ nhớ nơi biến cục bộ và thông tin về các phương thức (stack frames) được lưu trữ khi một phương thức được gọi.
    -  Mỗi khi một phương thức được gọi, một khung mới sẽ được tạo ra trên Stack để lưu trữ các biến cục bộ của phương thức đó, và khi phương thức kết thúc, khung này sẽ được xóa.
- **2. Heap (Đối tượng và Garbage Collection)**:
    - Heap là khu vực trong bộ nhớ dùng để lưu trữ các đối tượng trong Java.
    - Các đối tượng này được tạo ra khi bạn sử dụng từ khóa new trong Java.
    - JVM quản lý bộ nhớ trong Heap thông qua cơ chế Garbage Collection (GC), có nhiệm vụ tự động thu hồi bộ nhớ khi một đối tượng không còn được tham chiếu nữa.
    - Ghi chú: Garbage Collection là quá trình tự động dọn dẹp bộ nhớ trong Java — nó giúp thu hồi (xóa) các object không còn được sử dụng nữa để giải phóng vùng nhớ trong Heap.
    - Vì sao cần GC? 
        - Tránh Memory Leak (rò rỉ bộ nhớ)(tắt khi không sử dụng). 
        - Tăng hiệu suất và tối ưu vùng nhớ.
        - Giảm nguy cơ lỗi khi giải phóng vùng nhớ sai cách (common bug in C/C++).
    - Memory Leaks:
        - Memory leak xảy ra khi một đối tượng không còn sử dụng nhưng vẫn còn được tham chiếu đâu đó, làm cho nó không bị GC thu hồi.
    - Xử lý bộ nhớ trong Java:
        - Dù Java có GC, nhưng bạn vẫn có thể ảnh hưởng đến việc thu hồi bộ nhớ bằng cách nullify các tham chiếu đối tượng không cần thiết và yêu cầu GC chạy bằng System.gc(), mặc dù việc này không đảm bảo.
        - Nếu bộ nhớ cạn kiệt, Java có thể ném ra lỗi OutOfMemoryError.

    - Lỗi OutOfMemoryError:
        - Sự cố này xảy ra khi Java không thể cấp phát thêm bộ nhớ cho các đối tượng do không đủ dung lượng heap. Bạn có thể cấu hình dung lượng heap bằng cách sử dụng các tham số -Xms (bộ nhớ ban đầu) và -Xmx (bộ nhớ tối đa).
- **3. Method Area (Thông tin lớp và phương thức)**:
    - Method Area chứa các thông tin về lớp (class), phương thức và các biến tĩnh của lớp đó.
    - Đây là khu vực bộ nhớ dùng để lưu trữ thông tin cấu trúc của các lớp khi chương trình Java được tải vào JVM.
    - Các phương thức và các thuộc tính tĩnh của các lớp sẽ được lưu trong Method Area.
- **4. PC Register (Program Counter Register)**:
    - Quản lý địa chỉ lệnh hiện tại của mỗi luồng.
    - Mỗi luồng trong chương trình Java sẽ có một PC Register riêng.
    - Địa chỉ trong PC Register cho phép JVM biết được đâu là lệnh tiếp theo cần thực thi trong mã bytecode.
    - Ví dụ:
        - Khi một phương thức được gọi, PC Register sẽ trỏ đến địa chỉ của lệnh đầu tiên trong phương thức đó. Sau mỗi lần thực thi lệnh, địa chỉ trong PC Register sẽ được cập nhật để trỏ đến lệnh kế tiếp.
- **5. Native Method Stack (Các phương thức gốc)**:
    - Native Method Stack là khu vực bộ nhớ dùng để lưu trữ thông tin về các phương thức gốc (native methods).
    - Các phương thức gốc là những phương thức không được viết bằng Java mà được thực thi bằng một ngôn ngữ khác như C hoặc C++ (thông qua JNI - Java Native Interface).(Java Native Interface (JNI) là một framework trong Java cho phép các chương trình Java giao tiếp với các thư viện hoặc mã được viết bằng ngôn ngữ khác như C, C++)
    - Địa chỉ trong PC Register cho phép JVM biết được đâu là lệnh tiếp theo cần thực thi trong mã bytecode.
    - Ví dụ:
        - Khi một phương thức được gọi, PC Register sẽ trỏ đến địa chỉ của lệnh đầu tiên trong phương thức đó. Sau mỗi lần thực thi lệnh, địa chỉ trong PC Register sẽ được cập nhật để trỏ đến lệnh kế tiếp.
- **6. Native Method Stack (Các phương thức gốc)**:
    - Native Method Stack là khu vực bộ nhớ dùng để lưu trữ thông tin về các phương thức gốc (native methods).
    - Các phương thức gốc là những phương thức không được viết bằng Java mà được thực thi bằng một ngôn ngữ khác như C hoặc C++ (thông qua JNI - Java Native Interface).(Java Native Interface (JNI) là một framework trong Java cho phép các chương trình Java giao tiếp với các thư viện hoặc mã được viết bằng ngôn ngữ khác như C, C++)
    - Ví dụ:
        - Nếu bạn gọi một phương thức gốc để thực hiện một tác vụ hệ thống như truy cập vào phần cứng hoặc giao tiếp với một thư viện C, thông tin về các lời gọi phương thức đó sẽ được lưu trong Native Method Stack.