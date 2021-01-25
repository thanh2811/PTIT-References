-- Tên BP được giao tới địa chỉ HN
SELECT B.TenBP, NN.Ten AS "Tên người nhận"
FROM BuuPham AS B, GiaoDich AS G, NguoiNhan AS NN
WHERE B.MaBP = G.MaBP
AND G.MaNN = NN.MaNN
AND NN.DiaChi = "Hà Nội"