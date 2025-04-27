
# Java Multithreading Notes

## 1. Process (Tiến trình)
- Là một chương trình đang được thực thi.
- Mỗi process có:
    - Vùng nhớ riêng (heap, stack, code…)
    - Tài nguyên hệ thống riêng (file, socket, v.v.)
    - Một process có thể chứa nhiều thread.

**Ví dụ:** Mở Google Chrome + Cốc Cốc  
Khi bạn mở Chrome và Cốc Cốc, mỗi ứng dụng là một process riêng biệt.  
Mỗi process có vùng nhớ riêng, nếu Chrome bị lỗi thì Cốc Cốc vẫn chạy bình thường.

---

## 2. Thread là gì?
- Thread (luồng) là đơn vị nhỏ nhất trong xử lý của CPU.
- Thread sống bên trong một process.
- Nhiều threads trong cùng một process chia sẻ:
    - Biến toàn cục
    - Heap

**Ví dụ:** Chrome mở nhiều tab  
Mỗi tab của Chrome có thể là một thread riêng biệt.  
Khi một tab load video, tab khác vẫn lướt web bình thường vì các thread chạy song song trong cùng process Chrome.

---

## 3. Thread Lifecycle (Vòng đời của Thread)
- **New** – Tạo bằng `new Thread()`
- **Runnable** – Khi gọi `start()`
- **Running** – Khi được CPU cấp thời gian
- **Blocked/Waiting** – Chờ tài nguyên hoặc tín hiệu
- **Terminated/Dead** – Khi thực thi xong hoặc bị dừng

**Ví dụ:** Tạo thread để tải ảnh đại diện
- New: tạo thread `AvatarLoader`
- Runnable: gọi `.start()`
- Running: thread bắt đầu tải ảnh
- Blocked: đợi mạng phản hồi
- Terminated: tải ảnh xong

---

## 4. Multithreading là gì?
- Tăng hiệu suất hệ thống
- Xử lý đồng thời (I/O, tính toán…)
- Đáp ứng nhanh hơn với người dùng

**Ví dụ:** Ứng dụng chat
- Thread 1: xử lý nhập tin nhắn
- Thread 2: nhận tin nhắn từ server
- Thread 3: phát âm thanh thông báo

---

## 5. Khi nào nên dùng Multithreading?
- Tác vụ **I/O bound**: đọc ghi file, giao tiếp mạng
- Tác vụ **CPU bound**: xử lý tính toán phức tạp
- Giao diện người dùng cần phản hồi nhanh

**Ví dụ:**
- I/O bound: tải 5 file từ server → 5 thread → không chờ tuần tự
- CPU bound: giải nén 1000 ảnh → chia 4 thread xử lý
- UI responsive: lưu dữ liệu trong background → UI vẫn chạy mượt

---

## 6. Multithreading vs Concurrency (Parallelism)

### Multithreading:
- Nhiều tác vụ được lên lịch xen kẽ nhau
- Có thể chạy trên 1 hoặc nhiều lõi CPU
- **Ví dụ:**
    - Bạn cần gửi 10.000 email cho khách hàng.

    - Nếu gửi tuần tự từng email → rất chậm.

    - Nên bạn dùng Multithreading để gửi nhiều email cùng lúc.



### Parallelism:
- Nhiều tác vụ chạy đồng thời thực sự
- Yêu cầu nhiều lõi CPU
- **Ví dụ:** 
    - Khi đang gửi email A mà gặp mạng chậm, CPU không ngồi chờ, mà chuyển ngay sang gửi email B.
    - Khi B cũng chậm, chuyển sang C...
    - Liên tục chuyển đổi, xử lý nhiều công việc xen kẽ, tận dụng tối đa CPU.
    - Concurrency = Một CPU luân phiên xử lý nhiều task "gần như cùng lúc".

---

## 7. Synchronized, volatile, Atomic
- `synchronized`: chỉ 1 thread truy cập code tại 1 thời điểm
- `volatile`: đảm bảo biến được đọc mới nhất giữa các thread
- `Atomic`: hỗ trợ các thao tác an toàn khi nhiều thread truy cập

**Ví dụ:**
-  Gửi nhiều email bằng multithreading  
- Đếm số email gửi thành công (sử dụng AtomicInteger)
- Có thể dừng dịch vụ giữa chừng (volatile)
- Bảo vệ các thao tác nhạy cảm (synchronized)
---

## 8. Issues trong Multithreading & cách phòng tránh

| Vấn đề         | Mô tả                                               | Cách phòng tránh                     |
|----------------|-----------------------------------------------------|--------------------------------------|
| Race Condition | Hai thread cùng truy cập và thay đổi dữ liệu       | `synchronized`, locks                |
| Deadlock       | Hai thread chờ nhau mãi mãi                         | Tránh giữ nhiều khóa cùng lúc        |
| Starvation     | Một thread không bao giờ được chạy                 | Ưu tiên thread thấp hợp lý           |
| Livelock       | Hai thread nhường nhau liên tục không tiến triển   | Cấu trúc lại logic                   |

**Ví dụ:**
- Race Condition: 2 thread cập nhật số dư tài khoản
- Deadlock: A giữ khóa X, B giữ Y → đợi nhau mãi
- Starvation: thread ưu tiên thấp bị bỏ qua
- Livelock: 2 thread liên tục nhường nhau

### 9.Context Switching
- Context switching (chuyển ngữ cảnh) là quá trình CPU lưu lại trạng thái (context) của một thread đang chạy và nạp trạng thái của một thread khác để tiếp tục thực thi.
- Context switching = Tạm ngừng thread A → Ghi nhớ mọi thứ → Chạy thread B → Lúc cần quay lại A thì khôi phục.