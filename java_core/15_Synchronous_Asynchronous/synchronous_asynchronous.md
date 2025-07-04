###1.Synchronous Communication (Giao tiếp đồng bộ)
    - Là kiểu giao tiếp theo tuần tự: Client gửi request và chờ response
    từ server trước khi tiếp tục.
    - Vd: Restapi
    - Luồng thực thi bị block cho đến  khi giao tiếp quay lại.
###2.Asynchronous Communication (Giao tiếp bất đồng bộ)
    - Là kiểu giao tiếp mà client không cần chờ server trả lời ngay, request được xử lý
    nền (background), và kết quả có thể đến sau.
    - Vd: Message queue( Kafka, RabbitMQ), Websocket, ...
    - Luồng thực không bị block
###3. Ưu nhược điểm
| Tiêu chí            | Synchronous                                                        | Asynchronous                                                           |
| ------------------- | ------------------------------------------------------------------ | ---------------------------------------------------------------------- |
| ✅ Ưu điểm           | - Dễ hiểu, dễ debug                    <br> - Đảm bảo thứ tự xử lý | - Hiệu suất cao (non-blocking)<br>- Linh hoạt, mở rộng dễ              |
| ❌ Nhược điểm        | - Blocking, dễ timeout<br>- Không scale tốt                        | - Khó debug, khó kiểm soát flow<br>- Phức tạp (callback, queue, retry) |
| 🔧 Use case phù hợp | - CRUD APIs<br>- Yêu cầu phản hồi ngay                             | - Xử lý nặng (background)<br>- Gửi mail, log, payment processing       |

###4 .Asynchronous Communication (Giao tiếp bất đồng bộ)
    

