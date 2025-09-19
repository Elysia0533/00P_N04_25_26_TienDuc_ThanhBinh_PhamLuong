# 00P_N04_25_26_TienDuc_ThanhBinh

## Thành viên nhóm
- **Trần Tiến Đức** – MSV: 23010777  
- **Lê Thanh Bình** – MSV: 23010242  
- **Phạm Thị Lương** – MSV: 23017258 

## 📌 Mô tả dự án
Ứng dụng web âm nhạc được xây dựng bằng **Java Spring Boot** với các chức năng chính:

- **Quản lý âm nhạc**  
  - Thêm, sửa, xóa bài hát  
  - Liệt kê thông tin bài hát  
  - Lọc bài hát theo playlist hoặc album  

- **Quản lý playlist & album**  
  - Thêm, sửa, xóa playlist/album  
  - Gán bài hát vào playlist hoặc album  

- **Quản lý dữ liệu**  
  - Lưu trữ dữ liệu xuống file nhị phân  
  - Khi làm việc trong bộ nhớ, dữ liệu được quản lý bằng các **Collection** như `ArrayList`, `LinkedList`, `Map`, …  


## Sơ đồ UML
### 1.1 UML Class Diagram
<img width="488" height="517" alt="image" src="https://github.com/user-attachments/assets/431125fa-545c-4adb-b6cf-04b054098aaa" />

### 1.2 Sequence Diagram

### 1.3 Activity Diagram (CRUD)

#### User
**Create**
```mermaid

flowchart TD
    A([Bắt đầu]) --> B[Nhập thông tin User]
    B --> C[Tạo đối tượng User]
    C --> D[Lưu User vào danh sách]
    D --> E([Kết thúc])

flowchart TD
    A([Bắt đầu]) --> B[Chọn yêu cầu xem danh sách User]
    B --> C[Lấy danh sách User từ bộ nhớ]
    C --> D[Hiển thị danh sách User]
    D --> E([Kết thúc])

flowchart TD
    A([Bắt đầu]) --> B[Nhập ID User cần xóa]
    B --> C[Tìm User theo ID]
    C -->|Tìm thấy| D[Xóa User khỏi danh sách]
    C -->|Không tìm thấy| F[Thông báo lỗi]
    D --> E([Kết thúc])
    F --> E
