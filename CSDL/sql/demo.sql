-- Create table KhachHang(
-- 	MaKH varchar(10) primary key,
--     Ten varchar(30),
--     NgaySinh date,
--     SDT varchar(12),
--     Email vbuuphamarchar(30)
-- );
-- create table b1(
-- ten char(10)
-- );

-- select * from khachhang;
-- select * from khachhang
-- where SDT = (select max(SDT) 
-- 			from Khachhang);
-- update nhanvien 
-- set KieuNV = "NV Văn Phòng"
-- where MaNV < "NV06";
-- update nhanvien 
-- set KieuNV = "NV Vận chuyển"
-- where MaNV >= "NV06";
--  update nhanvien 
-- set KieuNV = "NV Kho"
-- where MaNV = "NV06"
-- OR MaNV = "NV11"
-- SELECT MaNVVC, COUNT(MaGD) AS SL
-- 						FROM GiaoDich
-- 						GROUP BY MaNVVC
-- SELECT A.MaPT, PhuongThuc.Loai AS "Tên", (A.Dem * PhuongThuc.Gia) AS "Tổng doanh thu"
-- 						FROM (SELECT MaPT, COUNT(MaGD) AS Dem
-- 								FROM GiaoDich
--                                 GROUP BY MaPT) AS A, PhuongThuc 
--                                 WHERE PhuongThuc.MaPT = A.MaPTnhanvienk
-- SELECT G1.MaNN
-- 						FROM GiaoDich AS G1, GiaoDich AS G2
--                         WHERE G1.MaNN = G2.MaNN
--                         AND G1.MaGD != G2.MaGD    
-- CREATE TABLE NhanVienVP(
-- 	MaNVVP VARCHAR(10) PRIMARY KEY,
--     BangCap VARCHAR(30),
--     ViTri  VARCHAR(30),
--     Phongban VARCHAR(30),
--     ChiNhanh VARCHAR(30),
--     FOREIGN KEY (MaNVVP) REFERENCES nhanvien(MaNV),
--     FOREIGN KEY (Phongban) REFERENCES PhongBan(Ten),
--     FOREIGN KEY (ChiNhanh) REFERENCES PhongBan(DiaChiPB)
-- );
-- insert into NhanVienVP
-- values("NV01","DH","Tang 1","CSKH","Đà Nẵng");
-- insert into NhanVienVP
-- values("NV02","DH","Tang 2","Kho","Hà Nội");
-- insert into NhanVienVP
-- values("NV03","DH","Tang 3",null,null);
-- insert into NhanVienVP
-- values("NV04","DH","Tang 4","Tài Chính","TP Hồ Chí Minh");
-- insert into NhanVienVP
-- values("NV05","DH","Tang 4",null,null);

create table dayhoc(
	magv varchar(20) ,
    mal varchar(20),
    ky varchar(5) primary key,
    foreign key (magv) references gv(magv)
)



					
                                