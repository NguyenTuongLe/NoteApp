# Note App

Note App là một ứng dụng dùng để ghi chú và hẹn lịch làm việc.

Ứng dụng hiển thị danh sách những ghi chú mà người dùng đã tạo ra trước đó, những ghi chú có đặt thời gian thì khi tới giờ sẽ tự động thông báo.

Ứng dụng được viết bằng Kotlin, dễ dàng cài đặt, giao diện trực quan dễ sử dụng.

# Chức năng

## Màn hình chính và các menu

<div>
	<img src="./image/main.png" alt="main" width="250px" height="400px">
	<img src="./image/main_menu_left.png" alt="main" width="250px" height="400px">
	<img src="./image/main_menu_right.png" alt="main" width="250px" height="400px">
</div>

## Tạo note mới

Khi bấm vào nút tạo note mới (biểu tượng dấu +) thì có 2 lựa chọn text và to do.

Sau khi tạo xong thì hiển thị ra màn hình chính.

<div>
	<img src="./image/create_note.png" alt="create_note" width="250px" height="400px">
	<img src="./image/create_text.png" alt="create_note" width="250px" height="400px">
	<img src="./image/create_todo.png" alt="create_note" width="250px" height="400px">
	<img src="./image/main1.png" alt="create_note" width="250px" height="400px">	
</div>

## Tạo note mới có chọn màu

Khi tạo 1 note mới ta có thể lựa chọn màu sắc hiển thị cho note đó.

<div>
	<img src="./image/create_color.png" alt="create_color" width="250px" height="400px">
	<img src="./image/main2.png" alt="create_color" width="250px" height="400px">
	<img src="./image/main3.png" alt="create_color" width="250px" height="400px">		
</div>

## Chọn note theo màu 

Vào menu bên phải chọn Color, khi ta nhấn chọn màu nào thì note có màu đó sẽ được hiển thị ra màn hình.

<div>
	<img src="./image/color1.png" alt="choose_color" width="250px" height="400px">
	<img src="./image/color2.png" alt="choose_color" width="250px" height="400px">
	<img src="./image/color3.png" alt="choose_color" width="250px" height="400px">	
	<img src="./image/color4.png" alt="choose_color" width="250px" height="400px">		
</div>

## Sắp xếp 

Vào menu bên phải chọn Sort, khi ta chọn tiêu chí nào thì màn hình sẽ hiển thị các note được sắp xếp theo đúng tiêu chí đó.

<div>
	<img src="./image/sort1.png" alt="sort" width="250px" height="400px">
	<img src="./image/sort2.png" alt="sort" width="250px" height="400px">
	<img src="./image/sort3.png" alt="sort" width="250px" height="400px">
	<img src="./image/sort5.png" alt="sort" width="250px" height="400px">
	<img src="./image/sort6.png" alt="sort" width="250px" height="400px">
	<img src="./image/sort7.png" alt="sort" width="250px" height="400px">		
</div>

## Hiển thị

Vào menu bên phải chọn View, ta có thể chọn cách hiển thị cho các note theo dạng List, Detail hoặc Grid.

<div>
	<img src="./image/view1.png" alt="view" width="250px" height="400px">
	<img src="./image/view2.png" alt="view" width="250px" height="400px">
	<img src="./image/view3.png" alt="view" width="250px" height="400px">
	<img src="./image/view4.png" alt="view" width="250px" height="400px">
	<img src="./image/view5.png" alt="view" width="250px" height="400px">		
</div>

## Tìm kiếm

Vào menu bên phải chọn Search, ta có thể tìm kiếm note cần tìm.

<div>
	<img src="./image/search1.png" alt="search" width="250px" height="400px">
	<img src="./image/search2.png" alt="search" width="250px" height="400px">	
</div>

## Thông báo khi tới lịch

Khi tới lịch hẹn, app sẽ thông báo cho người dùng.

<div>
	<img src="./image/alarm.png" alt="alarm" width="250px" height="400px">	
</div>

## Tắt thông báo

Ta có thể tắt thông báo của 1 note đã được set thông báo trước đó.

<div>
	<img src="./image/alarm_off_1.png" alt="alarm_off" width="250px" height="400px">
	<img src="./image/alarm_off_2.png" alt="alarm_off" width="250px" height="400px">
	<img src="./image/alarm_off_3.png" alt="alarm_off" width="250px" height="400px">
	<img src="./image/alarm_off_4.png" alt="alarm_off" width="250px" height="400px">	
</div>

## Khóa ghi chú 

Nếu muốn người khác không thể truy cập vào những note quan trọng thì có thể lock note đó lại, khi mật khẩu được nhập đúng thì mới có quyền xem nội dung note đó.

<div>
	<img src="./image/lock1.png" alt="lock" width="250px" height="400px">	
	<img src="./image/lock2.png" alt="lock" width="250px" height="400px">	
	<img src="./image/lock3.png" alt="lock" width="250px" height="400px">	
	<img src="./image/lock4.png" alt="lock" width="250px" height="400px">	
	<img src="./image/lock5.png" alt="lock" width="250px" height="400px">	
</div>

## Các note có set thời gian

Vào menu bên trái chọn Remind, ta có thể xem những note có hẹn giờ.

<div>
	<img src="./image/remind.png" alt="remind" width="250px" height="400px">	
</div>

## Xóa note

Ta có thể vào menu con trong từng note để xóa note đó đi.

<div>
	<img src="./image/delete1.png" alt="delete" width="250px" height="400px">
	<img src="./image/delete2.png" alt="delete" width="250px" height="400px">
	<img src="./image/delete3.png" alt="delete" width="250px" height="400px">	
</div>

## Thùng rác

Vào menu bên trái chọn Trash, ta có thể xem những note đã xóa.

Nếu muốn khôi phục lại note đã xóa thì nhấn giữ vào note và kéo sang phải, chọn yes.

Nếu muốn xóa luôn note trong thùng rác thì nhấn giữ vào note và kéo sang trái, chọn yes.

<div>
	<img src="./image/trash1.png" alt="trash" width="250px" height="400px">	
	<img src="./image/trash2.png" alt="trash" width="250px" height="400px">
	<img src="./image/trash3.png" alt="trash" width="250px" height="400px">
	<img src="./image/trash4.png" alt="trash" width="250px" height="400px">
	<img src="./image/trash5.png" alt="trash" width="250px" height="400px">
	<img src="./image/trash6.png" alt="trash" width="250px" height="400px">
	<img src="./image/trash7.png" alt="trash" width="250px" height="400px">
</div>

## Info nhóm

Vào menu bên phải chọn About sẽ hiển thị thông tin nhóm.

<div>
	<img src="./image/about.png" alt="about" width="250px" height="400px">	
</div>


