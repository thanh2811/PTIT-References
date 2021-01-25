
package entity;

public class Bao extends TaiLieu implements TinhTien{
    String ngayph;

    public Bao(String ngayph, String ma, String nxb, int soban) {
        super(ma, nxb, soban);
        this.ngayph = ngayph;
    }


    public String getNgayph() {
        return ngayph;
    }

    public void setNgayph(String ngayph) {
        this.ngayph = ngayph;
    }
    
    
    @Override
    public double getTien() {
        if(getSoban()>=300) return 10000;
        else return 10000 * 0.9;
    }
    
}
