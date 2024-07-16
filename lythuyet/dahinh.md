# Tính đa hình (polymorphism)

Trong lập trình, đa hình giúp một đối tượng có khả năng nhận nhiều dạng khác nhau.

Trong Java, tính đa hình cho phép xử lý đối tượng con thông qua tham chiếu đến lớp cha của chúng. Khi gọi phương thức trên đối tượng con thông qua tham chiếu lớp cha, phiên bản phương thức được thực thi sẽ phụ thuộc vào kiểu của đối tượng thực tế.

## 1. Ghi đè phương thức (Overriding):
Overriding là kỹ thuật cho phép lớp con định nghĩa lại phương thức của lớp cha với cùng tên, cùng tham số và cùng kiểu trả về. Khi gọi phương thức thông qua đối tượng của lớp con, phương thức của lớp con sẽ được thực thi thay vì phương thức của lớp cha.   
*** 
Ưu điểm của overriding

Cho phép mở rộng và tùy biến hành vi của lớp con mà không ảnh hưởng đến lớp cha.
Tăng tính đa hình và linh hoạt khi thao tác với các đối tượng có quan hệ kế thừa.
Nhược điểm của overriding

Khi sử dụng nhiều lớp kế thừa đa tầng, code trở nên phức tạp hơn, khó quản lý.
Khả năng xảy ra lỗi khi ghi đè sai quy tắc, dẫn tới hành vi không mong muốn.

## 2. Ghi chồng phương thức (Overloading): 
Overloading là kỹ thuật tạo ra nhiều phương thức cùng tên nhưng khác nhau về số lượng hoặc kiểu dữ liệu của tham số. Các phương thức được gọi tương ứng với các tham số truyền vào. Môt ví dụ thực tế để bạn dễ hiểu hơn là máy giặt có nhiều chế độ giặt khác nhau. Máy giặt sử dụng kỹ thuật nạp chồng (overloading) để cung cấp cho bạn nhiều tùy chọn khác nhau như giặt nhanh, giặt êm, giặt bằng nước nóng để giặt các loại quần áo khác nhau
***
Ưu điểm của overloading

Tăng tính linh hoạt, cho phép sử dụng cùng một phương thức cho nhiều kiểu tham số.
Code ngắn gọn, dễ đọc và bảo trì hơn.
Nhược điểm của overloading

Dễ gây nhầm lẫn giữa các phiên bản phương thức, đặc biệt nếu chúng có tên giống nhau.
Có thể dẫn đến lỗi thời gian chạy nếu sử dụng sai kiểu dữ liệu.