### 1.websocket
- websocket là giao thức 2 chiều, realtime thời gian thực giữa client và server.
- Ứng dụng thực tế:
    - Dùng khi truyền thời gian thực cần giao tiếp nhanh giữa web với server.
    - Ví dụ: 
        - Ứng dụng chat ( zalo, message) : Gửi nhận tin nhắn theo thời gian thực.
        - Gọi điện
### 2. Restapi
- Restapi là một kiến trúc api hoạt động thông qua http protocol.
Mỗi endpoint đại diện cho 1 loại tài nguyên.
- Các method http tiêu chuẩn trong restapi:
  GET, POST, PUT, PATCH,  DELETE.
### 3.Nên dùng websocket với
- Sử dụng restapi  cho các thao tác tiêu chuẩn như CRUD, vì dễ quản lý và mở rộng. 
- Sử dụng websocket chức năng cần realtime như chat, thông báo, hay giám sát dữ liệu để tăng tốc độ phản hồi.
