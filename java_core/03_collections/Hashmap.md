- HashMap là một cấu trúc dữ liệu lưu trữ các cặp key-value.
- Trùng key (Duplicate key)
   - Key trong HashMap là duy nhất. Nếu bạn chèn một cặp key-value mới với key đã tồn tại, HashMap sẽ ghi đè giá trị cũ.
- Trùng hashCode nhưng khác key
  - Hai key có thể cùng hashCode(), nhưng nếu không bằng nhau (so sánh bằng equals()), thì HashMap vẫn lưu cả hai trong cùng một bucket (nếu cần).
    