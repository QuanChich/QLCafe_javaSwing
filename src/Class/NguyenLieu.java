/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Admin
 */
public class NguyenLieu {
    private String MaNguyenLieu;
    private String TenNguyenLieu;
    private int SoLuong;

    public NguyenLieu() {
    }

    public NguyenLieu(String MaNguyenLieu, String TenNguyenLieu, int SoLuong) {
        this.MaNguyenLieu = MaNguyenLieu;
        this.TenNguyenLieu = TenNguyenLieu;
        this.SoLuong = SoLuong;
    }

    public String getMaNguyenLieu() {
        return MaNguyenLieu;
    }

    public void setMaNguyenLieu(String MaNguyenLieu) {
        this.MaNguyenLieu = MaNguyenLieu;
    }

    public String getTenNguyenLieu() {
        return TenNguyenLieu;
    }

    public void setTenNguyenLieu(String TenNguyenLieu) {
        this.TenNguyenLieu = TenNguyenLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
