SElECT X.DacDiem, MAX(X.SoLuong) AS Max 
FROM (SELECT DacDiem, COUNT(MaBP) AS SoLuong 
  FROM BUUPHAM
 	  GROUP BY(DacDiem)) AS X;