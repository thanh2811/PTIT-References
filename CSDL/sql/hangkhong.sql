CREATE TABLE DVHangKhong(
	MaDVHK VARCHAR(10) PRIMARY KEY,
    Hang VARCHAR(20),
    DoCao INT,
    FOREIGN KEY (MaDVHK) references PhuongThuc(MaPT)
);

-- INSERT INTO DVHangKhong
-- VALUES ("DVHK1","VN Air Line",2000);
-- INSERT INTO DVHangKhong
-- VALUES ("DVHK2","VietJet Air",2000);



