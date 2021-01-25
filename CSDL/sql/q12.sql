SELECT B.TenBP, NVVC.MaNVVC,NhanVien.Ten
FROM BuuPham AS B, NhanVienVC AS NVVC,NhanVien, GiaoDich AS G
WHERE B.MaBP = G.MaBP
AND G.MaNVVC = NVVC.MaNVVC
AND NVVC.MaNVVC = NhanVien.MaNV
AND G.TrangThai = "Đang giao"