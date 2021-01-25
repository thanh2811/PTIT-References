SELECT NN.*, B.TenBP 
FROM NguoiNhan AS NN, BuuPham AS B, (SELECT MaNN, COUNT(MaGD) AS Dem
										FROM GiaoDich
                                        GROUP BY MaNN) AS TMP, GiaoDich AS G
WHERE NN.MaNN = TMP.MaNN
AND TMP.MaNN = G.MaNN
AND G.MaBP = B.MaBP
AND TMP.Dem = 1;