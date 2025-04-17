## 1. Stream là gì?
- Là một API trong Java 8 trở lên để xử lý dữ liệu tuần tự hoặc song song theo kiểu functional programming (lập trình hàm).
- Thường áp dụng trên **Collections** (`List`, `Set`, `Map`...).

---

## 2. Luồng xử lý trong Stream

### Gồm 3 bước chính:
1. Tạo stream từ collection.
2. Thực hiện các thao tác trung gian (intermediate operations) trên stream ban đầu để chuyển đổi nó thành một stream khác và tiếp tục thực hiện các hoạt động trung gian khác
   ( Có thể có nhiều hoạt động trung gian)
   - vd: filter(), map(), sorted(), distinct(),..
3. Thực hiện thao tác đầu cuối (terminal operation) trên stream cuối cùng để nhận kết quả và sau đó bạn không thể sử dụng lại chúng.
   - vd: collect(), forEach(), count(), reduce(), anyMatch(),..
   
## 3. Lưu ý
   - Stream không lưu trữ dữ liệu.
   - Không thay đổi collection gốc.
   - Sau khi gọi terminal operation, stream không dùng lại được.
   - Dùng .parallelStream() để xử lý song song.

