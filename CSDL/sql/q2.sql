select ten, (YEAR(DATe(now()))-YEAR(DATE(NgaySinh))) AS Tuoi
from khachhang
where (YEAR(DATe(now()))-YEAR(DATE(NgaySinh))) > 25
;

