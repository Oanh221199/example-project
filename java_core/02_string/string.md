##1.String
- **1. String là Immutable:**:
    - String trong Java là immutable, có nghĩa là bạn không thể thay đổi giá trị của một đối tượng String sau khi nó được tạo ra.

    - Khi bạn thực hiện một thao tác thay đổi một chuỗi String, Java sẽ tạo ra một đối tượng mới thay vì thay đổi trực tiếp đối tượng String cũ.

    - Tính bất biến này có ưu điểm là giúp bảo vệ dữ liệu chuỗi khỏi sự thay đổi ngoài ý muốn trong môi trường đa luồng và giúp tối ưu bộ nhớ (do các chuỗi giống nhau có thể chia sẻ một vùng nhớ).
- **2.Lợi ích của String Immutable**:
    
    - Thread Safety: Vì chuỗi không thể thay đổi sau khi tạo, nhiều thread có thể an toàn chia sẻ cùng một đối tượng String mà không cần lo lắng về việc đồng bộ hóa.

    - Caching: JVM có thể tối ưu hóa bộ nhớ bằng cách chia sẻ các chuỗi giống nhau.
- **3.Hạn chế**:

  - Hiệu suất: Khi thực hiện nhiều phép nối chuỗi, String sẽ kém hiệu quả do tạo ra quá nhiều đối tượng String tạm thời, gây áp lực cho bộ nhớ và làm giảm hiệu suất.
##2. StringBuilder và StringBuffer
- **1.StringBuilder và StringBuffer đều là mutable**:
    - StringBuilder và StringBuffer đều là lớp mutable trong Java, có nghĩa là chúng có thể thay đổi giá trị chuỗi mà không tạo ra đối tượng mới, giúp cải thiện hiệu suất khi nối chuỗi nhiều lần.
    - StringBuilder nhanh hơn StringBuffer trong môi trường đơn luồng vì không cần đồng bộ hóa.
    - Khi nào dùng:
        - Sử dụng StringBuilder trong môi trường đơn luồng để tối ưu hiệu suất.
        - Sử dụng StringBuffer nếu bạn cần đồng bộ hóa trong môi trường đa luồng.