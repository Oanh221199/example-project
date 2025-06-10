
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
