-- Mã, Tên khách hàng và tổng số tiền phải thanh toán
SELECT BangChiPhi.MaKH, K.Ten AS "Tên KH", SUM(BangChiPhi.Gia) AS "Tổng chi phí"
FROM KhachHang AS K, (SELECT K.MaKH, B.MaBP, P.Gia AS Gia
						FROM KhachHang AS K, BuuPham AS B, GiaoDich AS G, PhuongThuc AS P
                        WHERE K.MaKH = B.MaKH
                        AND B.MaBP = G.MaBP
                        AND G.MaPT = P.MaPT
                        ) AS BangChiPhi
WHERE BangChiPhi.MaKH = K.MaKH	
GROUP BY BangChiPhi.MaKH	