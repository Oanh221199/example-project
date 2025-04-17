###1. ArrayList – Bộ nhớ cấp phát dạng mảng liên tục (Contiguous Memory Allocation)
   - ArrayList sử dụng mảng động (dynamic array) để lưu trữ các phần tử.

   - Khi tạo một ArrayList, nó cấp phát sẵn một mảng có kích thước cố định, ví dụ new Object[10].

   - Nếu thêm quá nhiều phần tử vượt quá dung lượng mảng, nó sẽ:

        - Tạo một mảng mới lớn hơn (thường gấp 1.5 lần kích thước cũ),

        - Copy toàn bộ dữ liệu cũ sang mảng mới,

        - Và bỏ mảng cũ cho GC dọn.

   - Memory sử dụng:
       -  Bộ nhớ được cấp phát liên tục, do đó dễ cache hơn và truy cập phần tử theo chỉ số rất nhanh (O(1)).
       - Nhưng khi thêm/xóa ở giữa danh sách thì cần dịch chuyển phần tử, tốn thời gian và CPU.
    
       - Hình dung:
          [0] -> [1] -> [2] -> [3] -> ...
### 2. LinkedList – Bộ nhớ phân mảnh (Non-contiguous Memory Allocation)
   - LinkedList dùng các node liên kết nhau qua con trỏ.

   - Mỗi Node lưu:

        - data (giá trị phần tử)
        - next (tham chiếu đến node tiếp theo)
        - prev (nếu là Doubly LinkedList)

   - Memory sử dụng:
        - Mỗi node được cấp phát riêng biệt ở nơi nào có sẵn bộ nhớ ⇒ bộ nhớ phân mảnh, không liền nhau.
        - Truy cập tuần tự chậm hơn (O(n)) vì phải đi từng node.
        - Tuy nhiên, thêm/xóa ở đầu/cuối hoặc giữa (nếu có node trước đó) thì rất nhanh (O(1)).
        - Hình dung:
          [Head] <-> [Node1] <-> [Node2] <-> [Tail]