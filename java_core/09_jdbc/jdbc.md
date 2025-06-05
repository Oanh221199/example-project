### jdbc là gì?
 - jdbc là một api để kết nối db (cơ sở giữ liệu quan hệ).
### jdbc - các bước
 - 1. Khởi tạo connection.
 - 2. Tạo đối tượng statement.
 - 3. Thực hiện lấy hàng ( pass a sql statement)
 - 4. Gửi hàng lên xe( Result set)
### Ví dụ
    - Xem như chúng ta lấy hàng từ kho hàng (db)
    - B1:  Khởi tạo connection. Trước tiên muốn lấy hàng phải kết nối đến kho hàng
        (getConnection). Làm việc thông qua người điều phối (DriverManager)
    - B2: Tạo đối tượng statement: Sau khi đã kết nối đến được kho hàng thì cần người
        đem giấy tờ đến để lấy hàng, mang tới kho hàng.
    - B3:Thực hiện lấy hàng( Pass a query statement):
        Với danh sách được người liên lạc (statement) đưa tới , kho dàng (db) sẽ thực hiện lấy hàng từ kho.
    - B4: Gửi hàng lên xe( Result Set): Các món hàng được lấy từ xe sẽ được xem lên xe để trả về cho kh yêu cầu
###

