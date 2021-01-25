SELECT B.*
FROM BuuPham AS B, GiaoDich AS G, PhuongThuc AS P
WHERE P.Loai = "Đường bộ"
AND P.MaPT = G.MaPT
AND B.MaBP = G.MaBP
