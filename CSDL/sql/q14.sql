SELECT K.Ten AS "Tên khách hàng", B.TenBP, NN.Ten AS "Người nhận"
FROM KhachHang AS K, BuuPham AS B, GiaoDich AS G,
	NhanVienVC AS NVVC,NguoiNhan AS NN,NhanVien AS N
WHERE B.MaBP=G.MaBP
AND B.MaKH = K.MaKH
AND NN.MaNN=G.MaNN
AND NVVC.MaNVVC=G.MaNVVC
AND NVVC.MaNVVC=N.MaNV
AND N.Ten="Nguyễn Văn F";

