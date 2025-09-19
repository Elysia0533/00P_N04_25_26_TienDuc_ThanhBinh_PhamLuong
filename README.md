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

#### Playlist

<img width="1189" height="673" alt="activityDiagPL (2)" src="https://github.com/user-attachments/assets/5a5ee817-3dac-44d5-a704-9d5d1e360390" />

#### User

**Create**
**Create**
```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập thông tin User]
    B --> C{Thông tin hợp lệ?}
    C -->|Có| D[Thêm User vào danh sách]
    C -->|Không| E[Thông báo lỗi]
    D --> F([Kết thúc])
    E --> F([Kết thúc])
```

**Read**
```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Chọn yêu cầu xem danh sách User]
    B --> C[Lấy danh sách User từ bộ nhớ]
    C --> D[Hiển thị danh sách User]
    D --> E([Kết thúc])
```

**Update**
```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập ID User và thông tin mới]
    B --> C[Tìm User theo ID]
    C -->|Tìm thấy| D[Cập nhật thông tin User]
    C -->|Không tìm thấy| F[Thông báo lỗi]
    D --> E([Kết thúc])
    F --> E([Kết thúc])
```


**Delete**
```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập ID User cần xóa]
    B --> C[Tìm User theo ID]
    C -->|Tìm thấy| D[Xóa User khỏi danh sách]
    C -->|Không tìm thấy| F[Thông báo lỗi]
    D --> E([Kết thúc])
    F --> E([Kết thúc])
```
## Activity Diagram CRUD Song  

### Create Song
```mermaid
flowchart TD
    A([Start]) --> B[Nhập thông tin bài hát]
    B --> C{Dữ liệu hợp lệ?}
    C -- Không --> D[Hiển thị lỗi] --> G([End])
    C -- Có --> E[Lưu bài hát vào Repository/DB]
    E --> F[Thông báo thành công]
    F --> G([End])

### Read Song
```mermaid
flowchart TD
    A([Start]) --> B[Yêu cầu danh sách bài hát]
    B --> C[Lấy danh sách từ Repository/DB]
    C --> D[Hiển thị danh sách]
    D --> E([End])

### Update Song
```mermaid
flowchart TD
    A([Start]) --> B[Chọn bài hát cần sửa]
    B --> C[Hiển thị thông tin cũ]
    C --> D[Nhập thông tin mới]
    D --> E{Dữ liệu hợp lệ?}
    E -- Không --> F[Hiển thị lỗi] --> I([End])
    E -- Có --> G[Cập nhật bài hát trong Repository/DB]
    G --> H[Thông báo thành công]
    H --> I([End])

### Delete Song
```mermaid
flowchart TD
    A([Start]) --> B[Chọn bài hát cần xóa]
    B --> C{Xác nhận xóa?}
    C -- Không --> E([End])
    C -- Có --> D[Xóa bài hát khỏi Repository/DB]
    D --> F[Thông báo thành công]
    F --> E([End])
