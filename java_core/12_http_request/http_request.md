
# 🌐 HTTP Request – Tổng Quan & Các Loại Phổ Biến

## 1. HTTP Request là gì?

HTTP Request là một yêu cầu (request) được gửi từ **client (trình duyệt, app, API consumer,...)** đến **server**, yêu cầu server thực hiện một hành động nào đó (trả về dữ liệu, lưu thông tin, xóa dữ liệu,...).

---

## 2. Cấu trúc một HTTP Request

```http
GET /users HTTP/1.1
Host: example.com
User-Agent: Mozilla/5.0
Accept: application/json
```

### Bao gồm:
- **Request Line**: phương thức (GET, POST,...), đường dẫn, và version HTTP
- **Headers**: thông tin phụ trợ (kiểu dữ liệu, agent, authorization, ...)
- **Body** (tuỳ chọn): chỉ dùng cho các phương thức như POST/PUT chứa dữ liệu gửi đi

---

## 3. Các loại HTTP Methods phổ biến

| Method | Mô tả                                                       | Có body? |
|--------|--------------------------------------------------------------|----------|
| GET    | Lấy thông tin từ server (read-only)                          | ❌       |
| POST   | Gửi dữ liệu mới lên server (tạo mới)                         | ✅       |
| PUT    | Cập nhật toàn bộ dữ liệu đã có                               | ✅       |
| PATCH  | Cập nhật một phần dữ liệu                                     | ✅       |
| DELETE | Xóa dữ liệu trên server                                       | ❌/✅    |
| OPTIONS| Truy vấn các method được phép với endpoint                   | ❌       |

---

## 4. Ví dụ các loại Request

### 🔹 GET

```http
GET /api/products HTTP/1.1
Host: example.com
```

### 🔹 POST

```http
POST /api/products HTTP/1.1
Host: example.com
Content-Type: application/json

{
  "name": "iPhone 15",
  "price": 999
}
```

---

## 5. Status Code Phản Hồi

| Mã   | Ý nghĩa                                 |
|------|------------------------------------------|
| 200  | OK – Thành công                          |
| 201  | Created – Đã tạo thành công              |
| 204  | No Content – Thành công, không có dữ liệu|
| 400  | Bad Request – Lỗi cú pháp                |
| 401  | Unauthorized – Chưa xác thực             |
| 403  | Forbidden – Không có quyền truy cập      |
| 404  | Not Found – Không tìm thấy               |
| 500  | Internal Server Error – Lỗi server       |

---

## 6. Một số header phổ biến

| Header            | Mô tả                                       |
|-------------------|----------------------------------------------|
| Content-Type      | Định dạng dữ liệu trong body (json, form,...)|
| Authorization     | Token hoặc thông tin xác thực                |
| User-Agent        | Trình duyệt hoặc app đang gửi request        |
| Accept            | Định dạng mong muốn ở phản hồi               |
| Cookie            | Gửi cookie lên server                        |

---

## ✅ Kết luận

- HTTP Request là thành phần cơ bản trong giao tiếp client-server.
- Mỗi request gồm: method, URL, headers và có thể có body.
- Việc hiểu rõ các phương thức và status code giúp lập trình viên debug, phát triển API hiệu quả hơn.

# Naming Convention in HTTP (RESTful API)
## Định nghĩa
    - Trong thiết kế API theo chuẩn REST, Naming Convention (quy ước đặt tên) đóng vai trò rất quan trọng để đảm bảo API dễ hiểu, dễ dùng, và nhất quán.

## 📌 1. Quy tắc đặt tên đường dẫn (URL Path)

| Quy tắc                            | Giải thích                                      | Ví dụ                                  |
|------------------------------------|--------------------------------------------------|-----------------------------------------|
| Dùng **danh từ số nhiều**          | Đại diện cho tài nguyên                         | `/users`, `/products`, `/orders`       |
| Dùng **chữ thường + dấu gạch ngang (-)** | Dễ đọc, nhất quán                          | `/user-profile`, `/order-items`        |
| Tránh dùng động từ trong URL       | Hành động sẽ do HTTP method xác định           | ✅ `/orders` không phải ❌ `/getOrders`  |
| Dùng **nested resource** khi cần   | Thể hiện quan hệ cha – con                      | `/users/{id}/orders`                   |
| Không dùng phần mở rộng file (.json, .xml...) | Dùng header `Accept` để chọn định dạng | ❌ `/users.json`                        |

---

## 📌 2. Kết hợp HTTP Method + URL (chuẩn RESTful CRUD)

| Hành động     | HTTP Method | URL                    | Ý nghĩa                                |
|---------------|-------------|------------------------|-----------------------------------------|
| Lấy tất cả    | GET         | `/students`            | Lấy danh sách sinh viên                 |
| Lấy theo ID   | GET         | `/students/{id}`       | Lấy sinh viên theo ID                   |
| Tạo mới       | POST        | `/students`            | Tạo sinh viên mới                       |
| Cập nhật toàn bộ | PUT       | `/students/{id}`       | Ghi đè toàn bộ thông tin sinh viên      |
| Cập nhật một phần | PATCH    | `/students/{id}`       | Cập nhật một phần dữ liệu               |
| Xoá           | DELETE      | `/students/{id}`       | Xoá sinh viên theo ID                   |

---

## 📌 3. Best Practices (Thực hành tốt)

| ✅ Nên dùng                         | ❌ Không nên dùng                        |
|------------------------------------|-----------------------------------------|
| `/users`                           | `/getAllUsers`                          |
| `/products/123`                    | `/getProductById/123`                   |
| `/orders/789`                      | `/deleteOrder/789`                      |
| Chữ thường + gạch ngang            | camelCase hoặc snake_case               |
| Danh từ                            | Tránh dùng động từ trong URL            |

---

## 🧪 4. Ví dụ thực tế: API Quản lý Sinh viên

| Endpoint                        | Mục đích                                    |
|--------------------------------|----------------------------------------------|
| `GET /students`                | Lấy danh sách sinh viên                      |
| `GET /students/{id}`           | Lấy sinh viên theo ID                        |
| `POST /students`               | Thêm sinh viên mới                           |
| `PUT /students/{id}`           | Cập nhật toàn bộ thông tin sinh viên         |
| `PATCH /students/{id}`         | Cập nhật một phần thông tin                  |
| `DELETE /students/{id}`        | Xoá sinh viên theo ID                        |
| `GET /students/{id}/courses`   | Lấy danh sách khoá học của sinh viên đó      |

---

## 🛠️ 5. Tóm tắt nhanh quy tắc RESTful

- ✅ Sử dụng: `/resources`, `/resources/{id}`
- ✅ Lồng nhau nếu có quan hệ: `/resources/{id}/sub-resources`
- ❌ Tránh dùng động từ trong đường dẫn: `/getAll`, `/create`, `/deleteById`
- ✅ Dùng HTTP method để biểu thị hành động: `GET`, `POST`, `PUT`, `DELETE`
