
package model;

import java.io.Serializable;

/**
 *
 * @author Pham Thanh
 */
public class QLDK implements Serializable{
    SinhVien sv;
    MonHoc mh;
    String tg;

    public QLDK(SinhVien sv, MonHoc mh, String tg) {
        this.sv = sv;
        this.mh = mh;
        this.tg = tg;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }
    public Object[] toObject(){
        return new Object[]{
            sv.getMa(),sv.getTen(),mh.getMa(),tg
        };
    }
}
