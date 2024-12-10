/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethitracnghiem.server;

/**
 *
 * @author USER
 */
public class CauHoi {
    private DeThi dethi;
    private Integer cauHoiID;
    private String noiDung;
    private String A;
    private String B;
    private String C;
    private String D;
    private String dapAn;

    public CauHoi() {
    }
    

    public CauHoi(DeThi dethi, String noiDung, String A, String B, String C, String D, String dapAn) {
        this.dethi = dethi;
        this.noiDung = noiDung;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.dapAn = dapAn;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    public DeThi getDethi() {
        return dethi;
    }

    public void setDethi(DeThi dethi) {
        this.dethi = dethi;
    }

    public Integer getCauHoiID() {
        return cauHoiID;
    }

    public void setCauHoiID(Integer cauHoiID) {
        this.cauHoiID = cauHoiID;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    public String getD() {
        return D;
    }

    public void setD(String D) {
        this.D = D;
    }
    
    
}