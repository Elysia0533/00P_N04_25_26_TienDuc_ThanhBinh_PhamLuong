

-----

#  MusicApp - Quản lý Âm nhạc (OOP Project)

Mã học phần: `00P_N04_25_26` | Nhóm: `Group7_OOP_NO4_2025`

[](https://www.java.com)
[](https://spring.io/projects/spring-boot)
[](https://www.mysql.com/)
[](https://www.thymeleaf.org/)

> Ứng dụng web âm nhạc được xây dựng bằng **Java Spring Boot** và **Thymeleaf** với mục tiêu giúp người dùng quản lý thư viện nhạc cá nhân của mình một cách hiệu quả.

-----

## I. Thành viên nhóm

| Họ tên | MSSV |
| :--- | :--- |
| Trần Tiến Đức | `23010777` |
| Lê Thanh Bình | `23010242` |
| Phạm Thị Lương | `23017258` |

-----

## II. Tính năng chính

Ứng dụng cung cấp các chức năng CRUD (Create, Read, Update, Delete) đầy đủ cho các đối tượng chính:

  * **Quản lý Âm nhạc**
      * Thêm, sửa, xóa thông tin bài hát (tên, nghệ sĩ, thể loại).
      * Liệt kê danh sách tất cả bài hát.
      * Lọc/Tìm kiếm bài hát.
  * **Quản lý Playlist & Album**
      * Tạo, sửa, xóa playlist/album.
      * Thêm bài hát vào một playlist hoặc album cụ thể.
      * Xem tất cả bài hát trong một playlist/album.
  * **Quản lý Dữ liệu**
      * Lưu trữ và đọc dữ liệu từ file nhị phân (cho mục đích demo/dữ liệu ban đầu).
      * Kết nối và thao tác với cơ sở dữ liệu MySQL.
      * Sử dụng các cấu trúc dữ liệu Java Collection (`ArrayList`, `Map`,...) để xử lý logic nghiệp vụ trong bộ nhớ.

-----

## III. Các công nghệ sử dụng

| Lĩnh vực | Công nghệ |
| :--- | :--- |
| **Backend** | ![icons](https://skillicons.dev/icons?i=java,spring,aiven) (Java 17, Spring Boot, Maven) |
| **Frontend** | ![icons](https://skillicons.dev/icons?i=html,css,thymeleaf) (HTML, CSS, Thymeleaf) |
| **Database** | ![icons](https://skillicons.dev/icons?i=mysql) (MySQL) |
| **Version Control** | ![icons](https://skillicons.dev/icons?i=git,github) (Git, Github) |
| **IDE** | ![icons](https://skillicons.dev/icons?i=vscode,idea) (VSCode, IntelliJ IDEA) |

-----

## IV. Cấu trúc dự án

Dự án được tổ chức theo kiến trúc Model-View-Controller (MVC) tiêu chuẩn của Spring Boot.

```bash
musicapp/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/musicapp/
│   │   │   ├── model/       # Các lớp Entity (Song, Playlist, Album, User)
│   │   │   ├── repository/  # Giao tiếp với CSDL (JPA Repository)
│   │   │   ├── service/     # Xử lý logic nghiệp vụ (Business Logic)
│   │   │   ├── controller/  # Điều khiển request, trả dữ liệu cho view
│   │   │   └── MusicAppApplication.java # File main khởi chạy Spring Boot
│   │   └── resources/
│   │       ├── static/      # Chứa CSS, JS, Images
│   │       ├── templates/   # Giao diện Thymeleaf (HTML)
│   │       └── application.properties # Cấu hình database, cổng, logging
└── pom.xml                  # File quản lý thư viện (Maven)
```

-----

## V. Hướng dẫn cài đặt và chạy

### 1\. Yêu cầu tiên quyết

  * **Java JDK 17** (hoặc cao hơn)
  * **Maven 3.8** (hoặc cao hơn)
  * **MySQL Server 8.0**

### 2\. Các bước cài đặt

**1. Clone Repository**

```bash
git clone [ĐƯỜNG DẪN REPO CỦA BẠN]
cd [TÊN THƯ MỤC DỰ ÁN]
```

**2. Cấu hình Cơ sở dữ liệu (MySQL)**

  * Mở MySQL Workbench hoặc terminal và tạo một database mới:
    ```sql
    CREATE DATABASE music_db;
    ```
  * Mở file `src/main/resources/application.properties`.
  * Cập nhật thông tin kết nối database của bạn:
    ```properties
    # Database Connection
    spring.datasource.url=jdbc:mysql://localhost:3306/music_db
    spring.datasource.username=root
    spring.datasource.password=[MẬT KHẨU CỦA BẠN]

    # JPA/Hibernate
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```
    *(Lưu ý: `ddl-auto=update` sẽ tự động tạo/cập nhật các bảng dựa trên các lớp Model của bạn.)*

**3. Chạy ứng dụng**

  * Sử dụng Maven để build và chạy dự án:
    ```bash
    mvn spring-boot:run
    ```
  * Hoặc bạn có thể chạy file `MusicAppApplication.java` từ IDE của mình.

**4. Truy cập ứng dụng**

  * Mở trình duyệt và truy cập vào địa chỉ: `http://localhost:8080`

-----

## VI. Thiết kế hệ thống (UML)

### 6.1 Sơ đồ Lớp (Class Diagram)

Sơ đồ lớp mô tả cấu trúc tĩnh của hệ thống, bao gồm các lớp, thuộc tính và mối quan hệ giữa chúng.

\<img width="488" height="517" alt="Class Diagram" src="[https://github.com/user-attachments/assets/431125fa-545c-4adb-b6cf-04b054098aaa](https://github.com/user-attachments/assets/431125fa-545c-4adb-b6cf-04b054098aaa)" /\>

### 6.2 Sơ đồ Tuần tự (Sequence Diagram)

Sơ đồ tuần tự mô tả luồng hoạt động của MusicApp

![alt text](<Sequence diagram.png>)

### 6.1 Sơ đồ Lớp (Class Diagram)

Sơ đồ lớp mô tả cấu trúc tĩnh của hệ thống, bao gồm các lớp, thuộc tính và mối quan hệ giữa chúng.

<img width="488" height="517" alt="Class Diagram" src="https://github.com/user-attachments/assets/431125fa-545c-4adb-b6cf-04b054098aaa" />

### 6.2 Sơ đồ Tuần tự (Sequence Diagram)




### 6.3 Sơ đồ Hoạt động (Activity Diagram)

#### CRUD: Playlist

Sơ đồ mô tả luồng hoạt động khi người dùng quản lý Playlist.

\<img width="1189" height="673" alt="Activity Diagram Playlist" src="[https://github.com/user-attachments/assets/5a5ee817-3dac-44d5-a704-9d5d1e360390](https://github.com/user-attachments/assets/5a5ee817-3dac-44d5-a704-9d5d1e360390)" /\>

#### CRUD: User

Sơ đồ mô tả các luồng hoạt động cơ bản cho việc quản lý Người dùng (User).

**1. Create (Tạo mới)**

```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập thông tin User]
    B --> C{Thông tin hợp lệ?}
    C -->|Có| D[Thêm User vào danh sách]
    C -->|Không| E[Thông báo lỗi]
    D --> F([Kết thúc])
    E --> F([Kết thúc])
```

**2. Read (Đọc/Xem)**

```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Chọn yêu cầu xem danh sách User]
    B --> C[Lấy danh sách User từ bộ nhớ/DB]
    C --> D[Hiển thị danh sách User]
    D --> E([Kết thúc])
```

**3. Update (Cập nhật)**

```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập ID User và thông tin mới]
    B --> C[Tìm User theo ID]
    C -->|Tìm thấy| D[Cập nhật thông tin User]
    C -->|Không tìm thấy| F[Thông báo lỗi]
    D --> E([Kết thúc])
    F --> E([Kết thúc])
```

**4. Delete (Xóa)**

```mermaid
flowchart TD
    A([Bắt đầu]) --> B[Nhập ID User cần xóa]
    B --> C[Tìm User theo ID]
    C -->|Tìm thấy| D[Xóa User khỏi danh sách]
    C -->|Không tìm thấy| F[Thông báo lỗi]
    D --> E([Kết thúc])
    F --> E([Kết thúc])
```

#### CRUD: Song (Bài hát)

Sơ đồ mô tả các luồng hoạt động cơ bản cho việc quản lý Bài hát (Song)

**1.Create**

```mermaid
flowchart TB
    A1([Bắt đầu]) --> B1[Nhập thông tin bài hát]
    B1 --> C1{Hợp lệ?}
    C1 -->|Không| D1[Hiển thị lỗi]
    C1 -->|Có| E1[Lưu vào CSDL]
    E1 --> F1([Kết thúc])

```

**2. Read**

```mermaid
flowchart TB
    A2([Bắt đầu]) --> B2[Mở danh sách bài hát]
    B2 --> C2{Có tìm kiếm / lọc?}
    C2 -->|Không| D2[Hiển thị tất cả]
    C2 -->|Có| E2[Hiển thị kết quả phù hợp]
    D2 --> F2([Kết thúc])
    E2 --> F2

```

**3. Update**

```mermaid
flowchart TB
    A([Bắt đầu]) --> B[Chọn bài hát cần sửa]
    B --> C[Tải thông tin chi tiết]
    C --> D[Người dùng chỉnh sửa thông tin]
    D --> E{Hợp lệ?}
    E -->|Không| F[Hiển thị lỗi]
    E -->|Có| G[Lưu thay đổi vào CSDL]
    G --> H{Lưu thành công?}
    H -->|Không| I[Hiển thị lỗi lưu]
    H -->|Có| J[Hiển thị: Cập nhật thành công]
    J --> K([Kết thúc])
    F --> K
    I --> K

```

**4. Delete**

```mermaid
flowchart TB
    A4([Bắt đầu]) --> B4[Chọn bài hát muốn xóa]
    B4 --> C4{Xác nhận xóa?}
    C4 -->|Không| D4[Hủy thao tác]
    C4 -->|Có| E4[Xóa khỏi CSDL]
    E4 --> F4([Kết thúc])
    D4 --> F4

```

**5. Chạy thử**

1. Khởi chạy ứng dụng Spring Boot:

   ```bash
   mvn spring-boot:run
   ```

2. Truy cập trình duyệt tại:
    **[http://localhost:8080/songs](http://localhost:8080/songs)**

3. Thực hiện:

   * **Thêm bài hát** bằng form trên đầu trang
   * **Xem danh sách bài hát** trong bảng
   * **Xóa bài hát** bằng nút ❌



**6. Kết quả**

Giao diện tối giản theo phong cách Spotify, hỗ trợ:

* ➕ Thêm bài hát mới
* 📜 Hiển thị danh sách bài hát
* ❌ Xóa bài hát




### **VII. Kết luận & Đóng góp**

```markdown
## 1. Kết luận
Dự án giúp nhóm áp dụng các kiến thức OOP và Spring Boot vào thực tế:
- Tổ chức code theo mô hình MVC.
- Hiểu và triển khai CRUD qua Controller – Service – Repository.
- Làm việc nhóm qua GitHub và quản lý version.

## 2. Đóng góp
Nếu bạn muốn đóng góp thêm chức năng hoặc báo lỗi:
- Fork dự án
- Tạo nhánh mới (`feature/<tên-chức-năng>`)
- Gửi Pull Request ❤️

