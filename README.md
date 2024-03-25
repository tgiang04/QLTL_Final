# QLTL_Final
<h3 style="color:red; text-align:center;"> XÂY DỰNG PHẦN MỀM QUẢN LÝ TIỀN LƯƠNG </h3>
<hr>
<h3 style="color:#1aa3ff;">Mô tả dự án </h3>
<li>Tiền lương là một vấn đề không hề đơn giản, bởi trong quan hệ giữa doanh nghiệp và người lao động tồn tại mâu thuẫn thông qua vấn đề tiền lương. Đứng dưới góc độ doanh nghiệp thì tiền lương được coi là một khoản chi phí, còn đối với người lao động thì tiền lương lại chính là khoản thu nhập giúp họ tái sản xuất sức lao động. Vì thế giải quyết tốt mâu thuẫn cố hữu này đã và đang trở thành bài toán đặt ra đối với doanh nghiệp, tổ chức.</li>
<li>Từ những phân tích trên ta thấy cần thiết phải có một cách nào đó để quản lý tốt vấn đề con người hay nhân lực của công ty và vấn đề tiền lương để doanh nghiệp vừa có một đội ngũ mạnh về chuyên môn, tốt về phẩm chất và giỏi về trí tuệ, lại vừa giải quyết tốt vấn đề an sinh của nhân viên. Hơn thế nữa, ngày nay, việc ứng dụng công nghệ thông tin đã trở nên phổ biến trong hầu hết mọi cơ quan, doanh nghiệp, đặc biệt là việc áp dụng các giải pháp tin học trong công tác quản lý. Trong đó công tác quản lý nhân sự, quản lý tiền lương là một lĩnh vực cần thiết và quan trọng đối với tất cả các doanh nghiệp. Vì vậy nhóm em đã lựa chọn đề tài “Xây dựng phần mềm quản lý tiền lương của công ty TNHH Công nghệ và Thương mại THT” là bài tập lớn của mình. Do trình độ và thời gian có hạn nên chắc chắn không thể không tránh khỏi những thiếu sót. Nhóm em rất mong được sự hướng dẫn của các thầy cô, của những người làm nghiên cứu và những người làm công tác kế toán để bài tập lớn này của nhóm em được hoàn thiện hơn.</li>

1. Thông tin các đối tượng quản lý

1.1. Quản lý thông tin giảng viên
	<p>Mỗi giảng viên được quản lý các thông tin sau đây: Họ và tên, mã giảng viên, địa chỉ, trình độ.
1.2. Quản lý tiền lương 

<p>Hệ thống cần xây dựng phải đảm bảo dễ dàng quản lý nhân viên và tính lương, xử lý nhanh công việc quản lý, cập nhật các thông tin kịp thời, dễ dàng tìm kiếm thông tin và tính lương chính xác, nhanh chóng.

2. Quy trình tính lương

Tính toán và phân bổ các khoản lương, thưởng theo hệ số của từng giảng viên

* Cách tính lương:

<p>Cách tính lương nhứ sau:</p>
<p>Thực nhận = Lương cơ bản + lương thời gian- các khoản phải trừ</p></p>

<h3 style="color:#1aa3ff;"><strong> Mục têu sử dụng</strong> </h3>
<li> Tiết kiệm công sức con người.</li>
<li> Tiết kiệm thời gian.</li>
<li> Thuận tiện cho việc tìm kiếm  và tra cứu.</li>
<li> Đảm bảo được độ chính xác cao.</li>
<li> Quản lý chi tiết thông tin nhân viên.</li>
<li> Hệ thống thưởng chi tiết rõ ràng.</li>
<li> Hệ thống tính toán lương tự động, nhanh chóng tránh tình trạng sai sót trong quá trình tính lương.</li>
<hr>
<h3 style="color:#1aa3ff"> Mục tiêu phát triển tương lai </h3>
<li> Phần mềm được sử dụng rỗng rãi trên toàn thế giới và được các công ty đón nhận.</li>
<li> Giải quyết hết mọi vấn đề về việc thưởng phạt theo từng quý từng năm.</li>
<li> Nâng cáo hỗ trợ các tiện ích về cảnh báo: Hết hạn hợp đồng, sinh nhật, cảnh báo đến hạn tăng lương, chứng minh thư…</li>
<li>Hệ thống báo cáo đa dạng, chi tiết theo từng module chức năng trong phần mềm.</li>
3. Công cụ
    Công cụ sử dụng: Neat Beans, MySQL, Navicat.
    Ngôn ngữ sử dụng: Java.
    Hỗ trợ: JDK.
4. Cài đặt
<hr>
<p>Bước 1: Tạo 1 project và thiết kế project theo mô hình MVC:</p>
<p>File -> New project -> java -> java application -> Next ->...->Finish</p>
<p>Bước 2: Tạo các package gồm Controller, View, Model:</p>
<p>Click phải chuột vào Source package -> New -> Java packge</p>
<p>Bước 3: Thêm các gói thư viên hổ trợ "rs2xml.jar & sqljdbc4.jar":</p>
<p>Bước 4: Tạo 1 class ở tầng DAO để kết nối CSDL:</p>
<p>Click phải chuột vào tầng DAO -> New -> Java class</p>
<p>Bước 5: Tạo các jframe from, jpanel ở tầng View để xử lý các form:</p>
<p>Click phải chuột vào tầng View -> New -> JFrame form</p>
<p>Bước 6: Tạo các class ở tầng Controller để tương tác với người dùng:</p>
<p>Click phải chuột vào tầng Controller -> New -> Java class</p>