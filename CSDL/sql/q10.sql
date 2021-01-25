SELECT TenPB, DiaChiPB AS ChiNhanh, AVG(MucLuong) AS LuongTrungBinh
FROM NhanVien
GROUP BY TenPB, DiaChiPB;
