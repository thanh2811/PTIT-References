SELECT K.*,Dem.SoLuong 
FROM KhachHang AS K, (SELECT MaKH, COUNT(TenBP) AS SoLuong
						FROM BuuPham
						GROUP BY MaKH) AS Dem
WHERE K.MaKH = Dem.MaKH
AND Dem.SoLuong > 1
