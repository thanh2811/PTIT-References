SELECT A.MaPT, PhuongThuc.Loai AS "Tên", (A.Dem * PhuongThuc.Gia) AS "Tổng doanh thu"
	FROM (SELECT MaPT, COUNT(MaGD) AS Dem
			FROM GiaoDich
            GROUP BY MaPT) AS A, PhuongThuc 
	WHERE PhuongThuc.MaPT = A.MaPT