/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author admin
 */
public class DanhMuc {
    private String MaDanhMuc;
    private String TenDanhMuc;

    public DanhMuc() {
    }

    public DanhMuc(String MaDanhMuc, String TenDanhMuc) {
        this.MaDanhMuc = MaDanhMuc;
        this.TenDanhMuc = TenDanhMuc;
    }

    public String getMaDanhMuc() {
        return MaDanhMuc;
    }

    public void setMaDanhMuc(String MaDanhMuc) {
        this.MaDanhMuc = MaDanhMuc;
    }

    public String getTenDanhMuc() {
        return TenDanhMuc;
    }

    public void setTenDanhMuc(String TenDanhMuc) {
        this.TenDanhMuc = TenDanhMuc;
    }
    
}
