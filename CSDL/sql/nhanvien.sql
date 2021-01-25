CREATE TABLE NhanVien(
    MaNV VARCHAR(10),
    Ten VARCHAR(20),
    GioiTinh VARCHAR(3),
    Cmt VARCHAR(15),
    Email VARCHAR(30),
    MucLuong VARCHAR(10),
    KieuNV VARCHAR (20),
    TenPB VARCHAR(20),
    DiaChiPB VARCHAR(30),
    MaTruongPhong VARCHAR(10),
    PRIMARY KEY(MaNV),
    FOREIGN KEY(TenPB, DiaChiPB) references phongban(Ten, DiaChiPB),
	FOREIGN KEY(MaTruongPhong) references nhanvien(MaNV)
);
-- insert into Nhanvien
-- values("NV01","Nguyễn Văn A","Nam","036200001111","a@gmail.com","10000000","Fulltime","Tài chính","Hà Nội","NV01") ;
-- insert into Nhanvien
-- values("NV02","Vũ Thị B","Nữ","036200001122","b@gmail.com","1000000","Fulltime","Tài chính","Hà Nội","NV01") ;
-- insert into Nhanvien
-- values("NV03","Nguyễn Văn C","Nam","036200001133","c@gmail.com","9000000","Fulltime","Tài chính","Hà Nội","NV01") ;
-- insert into Nhanvien
-- values("NV04","Nguyễn Văn D","Nam","036200001144","d@gmail.com","10000000","Fulltime","Marketing","Hà Nội","NV04") ;
-- insert into Nhanvien
-- values("NV05","Nguyễn Văn A","Nam","036200001155","a5@gmail.com","8000000","Fulltime","Marketing","Hà Nội","NV04") ;
-- insert into Nhanvien
-- values("NV06","Nguyễn Văn E","Nam","036200001166","e@gmail.com","8000000","Fulltime","Kho","Hà Nội","NV06") ;
-- insert into Nhanvien
-- values("NV07","Nguyễn Văn F","Nam","036200001177","f@gmail.com","7000000","Fulltime","Kho","Hà Nội","NV06") ;
-- insert into Nhanvien
-- values("NV08","Nguyễn Văn G","Nam","036200001188","g@gmail.com","4000000","Partime","Kho","Hà Nội","NV06") ;
-- insert into Nhanvien
-- values("NV09","Nguyễn Văn H","Nam","036200001199","h@gmail.com","3000000","Partime","Kho","Hà Nội","NV06") ;
-- insert into Nhanvien
-- values("NV10","Nguyễn Văn I","Nam","036200002211","i@gmail.com","6000000","Fulltime","Kho","Hà Nội","NV06") ;
-- insert into Nhanvien
-- values("NV11","Nguyễn Văn K","Nam","036200002222","k@gmail.com","10000000","Fulltime","Kho","Đà Nẵng","NV11") ;
-- insert into Nhanvien
-- values("NV12","Nguyễn Thị M","Nữ","036200002233","m@gmail.com","8000000","Fulltime","Kho","Đà Nẵng","NV11") ;


