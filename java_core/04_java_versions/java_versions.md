
<h2>🔸 Java 8 (2014) – Cuộc cách mạng lập trình hàm</h2>
<table>
    <tr><th>Tính năng</th><th>Giải thích</th></tr>
    <tr><td>Lambda Expressions</td><td>Viết ngắn gọn các hàm ẩn danh, xử lý logic đơn giản</td></tr>
    <tr><td>Stream API</td><td>Xử lý collection theo kiểu hàm (filter, map, reduce...)</td></tr>
    <tr><td>Functional Interface</td><td>Interface với 1 method (ví dụ: Runnable, Comparator)</td></tr>
    <tr><td>Optional</td><td>Tránh NullPointerException, đại diện cho giá trị có thể null</td></tr>
    <tr><td>Method References</td><td>Viết ngắn hơn cho lambda (System.out::println)</td></tr>
    <tr><td>Date & Time API</td><td>LocalDate, LocalDateTime, ZonedDateTime...</td></tr>
</table>

<h2>🔸 Java 11 (2018) – Nhẹ hơn, hiện đại hơn</h2>
<table>
    <tr><th>Tính năng</th><th>Giải thích</th></tr>
    <tr><td>var trong lambda</td><td>Dùng <code>var</code> cho tham số trong lambda</td></tr>
    <tr><td>String API mở rộng</td><td>Thêm <code>isBlank()</code>, <code>lines()</code>, <code>strip()</code>, <code>repeat()</code>...</td></tr>
    <tr><td>HTTP Client API</td><td>Hỗ trợ HTTP/2, đồng bộ & bất đồng bộ</td></tr>
    <tr><td>Chạy file .java trực tiếp</td><td>Không cần javac, chỉ cần <code>java Hello.java</code></td></tr>
    <tr><td>Loại bỏ API cũ</td><td>Gọn nhẹ hơn do loại bỏ Java EE, CORBA...</td></tr>
</table>

<h2>🔸 Java 17 (2021) – Ổn định, hiện đại, mạnh mẽ</h2>
<table>
    <tr><th>Tính năng</th><th>Giải thích</th></tr>
    <tr><td>Sealed Classes</td><td>Giới hạn class được phép kế thừa</td></tr>
    <tr><td>Pattern Matching (instanceof)</td><td>Không cần ép kiểu thủ công</td></tr>
    <tr><td>Switch Expressions</td><td><code>switch</code> có thể trả giá trị, viết gọn hơn</td></tr>
    <tr><td>Text Blocks</td><td>Viết chuỗi nhiều dòng dễ đọc hơn (dùng <code>"""</code>)</td></tr>
    <tr><td>Record</td><td>Class bất biến, auto constructor, getter</td></tr>
    <tr><td>Tối ưu JVM</td><td>Cải thiện G1 GC, hiệu năng tốt hơn</td></tr>
</table>

<h2>🆚 Bảng So Sánh Nhanh</h2>
<table>
    <tr>
        <th>Tính năng</th><th>Java 8</th><th>Java 11</th><th>Java 17</th>
    </tr>
    <tr><td>Lambda / Stream</td><td>✅</td><td>✅</td><td>✅</td></tr>
    <tr><td>var</td><td>❌</td><td>✅</td><td>✅</td></tr>
    <tr><td>HTTP Client mới</td><td>❌</td><td>✅</td><td>✅</td></tr>
    <tr><td>Pattern Matching</td><td>❌</td><td>❌</td><td>✅</td></tr>
    <tr><td>Record / Sealed Class</td><td>❌</td><td>❌</td><td>✅</td></tr>
    <tr><td>Text Blocks</td><td>❌</td><td>❌</td><td>✅</td></tr>
    <tr><td>Chạy .java trực tiếp</td><td>❌</td><td>✅</td><td>✅</td></tr>
    <tr><td>LTS Support</td><td>✅</td><td>✅</td><td>✅</td></tr>
</table>

<h2>🤔 Nên chọn phiên bản nào?</h2>
<table>
    <tr><th>Mục đích sử dụng</th><th>Nên dùng</th></tr>
    <tr><td>Dự án cũ, môi trường cần tương thích</td><td>Java 8</td></tr>
    <tr><td>Dự án mới, cần tính hiện đại và nhẹ</td><td>Java 11</td></tr>
    <tr><td>Dự án dài hạn, tận dụng tính năng mới</td><td><strong>Java 17 (khuyên dùng)</strong></td></tr>
</table>

