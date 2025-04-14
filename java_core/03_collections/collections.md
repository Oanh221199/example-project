<h1>📘 So sánh & Hướng dẫn sử dụng các Cấu trúc Dữ liệu Phổ Biến</h1>

<table>
    <thead>
        <tr>
            <th>Feature</th>
            <th>ArrayList</th>
            <th>LinkedList</th>
            <th>HashMap</th>
            <th>HashSet</th>
            <th>Queue</th>
            <th>Stack</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Cấu trúc</td>
            <td>Mảng động</td>
            <td>Danh sách liên kết đôi</td>
            <td>Bảng băm</td>
            <td>Dựa trên <code>HashMap</code></td>
            <td>Thường dùng <code>LinkedList</code> hoặc <code>ArrayDeque</code></td>
            <td>Dựa trên <code>Vector</code>, <code>ArrayDeque</code>, hoặc <code>LinkedList</code></td>
        </tr>
        <tr>
            <td>Truy cập phần tử (get)</td>
            <td>✅ Nhanh (O(1))</td>
            <td>❌ Chậm (O(n))</td>
            <td>✅ Nhanh (O(1) trung bình)</td>
            <td>❌ Không truy cập theo index</td>
            <td>❌ Không truy cập theo index</td>
            <td>❌ Chỉ xem được phần tử đỉnh (<code>peek</code>)</td>
        </tr>
        <tr>
            <td>Thêm/xóa ở cuối</td>
            <td>✅ Nhanh (O(1))</td>
            <td>✅ Nhanh (O(1))</td>
            <td>✅ Nhanh (O(1))</td>
            <td>✅ Nhanh (O(1))</td>
            <td>✅ Nhanh (<code>add</code>/<code>poll</code>)</td>
            <td>✅ Nhanh (<code>push</code>/<code>pop</code>)</td>
        </tr>
        <tr>
            <td>Thêm/xóa giữa/đầu</td>
            <td>❌ Chậm (O(n))</td>
            <td>✅ Nhanh nếu có node (O(1))</td>
            <td>❌ Không áp dụng</td>
            <td>❌ Không áp dụng</td>
            <td>✅ Nhanh ở đầu (<code>poll</code>)</td>
            <td>✅ Nhanh ở đỉnh (<code>pop</code>)</td>
        </tr>
        <tr>
            <td>Cho phép trùng lặp?</td>
            <td>✅ Có</td>
            <td>✅ Có</td>
            <td>✅ Value có thể trùng, Key không</td>
            <td>❌ Không</td>
            <td>✅ Có</td>
            <td>✅ Có</td>
        </tr>
        <tr>
            <td>Giữ thứ tự phần tử?</td>
            <td>✅ Có (theo index)</td>
            <td>✅ Có (thứ tự chèn)</td>
            <td>❌ Không (trừ <code>LinkedHashMap</code>)</td>
            <td>❌ Không (trừ <code>LinkedHashSet</code>)</td>
            <td>✅ Có (FIFO)</td>
            <td>✅ Có (LIFO)</td>
        </tr>
        <tr>
            <td>Bộ nhớ</td>
            <td>🔸 Dùng ít</td>
            <td>🔺 Tốn hơn do con trỏ</td>
            <td>🔺 Tốn nhiều do bảng băm</td>
            <td>🔺 Tốn nhiều</td>
            <td>🔸 Vừa phải</td>
            <td>🔸 Vừa phải</td>
        </tr>
        <tr>
            <td>Khi nào dùng?</td>
            <td>- Danh sách có thứ tự<br>- Cần truy cập nhanh theo chỉ số</td>
            <td>- Thêm/xoá đầu/cuối thường xuyên<br>- Duyệt tuần tự</td>
            <td>- Tra cứu nhanh theo key</td>
            <td>- Lọc phần tử duy nhất</td>
            <td>- Hệ thống hàng đợi</td>
            <td>- Undo/Redo, backtracking</td>
        </tr>
    </tbody>
</table>

<h2>📌 Một số tình huống thực tế:</h2>
<table>
    <thead>
        <tr>
            <th>Tình huống</th>
            <th>Nên dùng</th>
            <th>Lý do</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Danh sách sản phẩm trên website</td>
            <td>ArrayList</td>
            <td>Hiển thị theo thứ tự, truy cập nhanh (O(1)), không cần thêm/xoá giữa</td>
        </tr>
        <tr>
            <td>Playlist nhạc</td>
            <td>LinkedList</td>
            <td>Thêm/xoá đầu/cuối linh hoạt, duyệt dễ dàng</td>
        </tr>
        <tr>
            <td>Từ điển tra cứu nhanh</td>
            <td>HashMap</td>
            <td>Tra cứu từ khoá hoặc ID → giá trị cực nhanh (O(1) trung bình)</td>
        </tr>
        <tr>
            <td>Kiểm tra email đăng ký trùng</td>
            <td>HashSet</td>
            <td>Không cho phép phần tử trùng, kiểm tra tồn tại nhanh</td>
        </tr>
        <tr>
            <td>Xử lý đơn hàng theo thứ tự</td>
            <td>Queue</td>
            <td>FIFO: đơn vào trước xử lý trước</td>
        </tr>
        <tr>
            <td>Tính năng Undo trong trình soạn thảo</td>
            <td>Stack</td>
            <td>LIFO: lấy trạng thái gần nhất để hoàn tác</td>
        </tr>
    </tbody>
</table>

