# 📘 Java Platform Support – Những nền tảng Java có thể và không thể chạy

Java được thiết kế để **"Write Once, Run Anywhere"** – tức là viết một lần, chạy ở mọi nơi. Tuy nhiên, vẫn có một số giới hạn nhất định.

---

## ✅ Bảng tổng hợp các nền tảng và mức độ hỗ trợ Java

| **Nền tảng**             | **Java có chạy được không?** | **Ghi chú** |
|--------------------------|-------------------------------|-------------|
| **Windows, macOS, Linux**| ✅ | Cài đặt JDK/JRE để chạy và phát triển Java |
| **Android**              | ✅ | Java/Kotlin chạy qua Android Runtime (ART) |
| **iOS (iPhone/iPad)**    | ❌ (trực tiếp) | iOS không cho chạy JVM. Muốn dùng Java phải biên dịch sang native qua tool như **Codename One**, **Gluon**, **GraalVM** |
| **Web browser**          | ❌ (đã khai tử) | Java Applets đã bị loại bỏ từ Java 11 vì bảo mật. Trình duyệt hiện đại không còn hỗ trợ |
| **Server (AWS, GCP, Azure)** | ✅ | Java rất phổ biến trong phát triển backend, microservices, cloud-native |
| **Thiết bị nhúng (IoT)** | ✅ | Java ME, Java Embedded dùng trên Raspberry Pi, hệ thống điều khiển, smart card,... |

---

## 📌 Lý do vì sao Java **không chạy trực tiếp trên iOS**

| Lý do | Giải thích |
|------|------------|
| 🔒 Chính sách Apple | Apple cấm máy ảo như JVM để đảm bảo bảo mật & kiểm soát chặt chẽ |
| 🚫 Không có JVM chính thức cho iOS | Không thể chạy `.class` hay `.jar` trên iOS một cách trực tiếp |
| 🛠 Cần công cụ trung gian | Dùng GraalVM, Codename One, Gluon để convert Java thành native app iOS |

---

## 🧠 Tóm tắt nhanh

- ✅ Java hỗ trợ rất tốt trên: **PC (Windows/macOS/Linux)**, **Android**, **server/cloud**, **IoT**
- ❌ Không chạy trực tiếp trên: **iOS**, **trình duyệt**, **thiết bị không có JVM**

---
