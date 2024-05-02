/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
   
    private String GioiTinh;
    private String SDT;
    private LocalDateTime  NgayVaoLam;
    private String TenDangNhap;
    private String MatKhau;
    private int IdRole;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String GioiTinh, String SDT, LocalDateTime NgayVaoLam, String TenDangNhap, String MatKhau, int IdRole) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.NgayVaoLam = NgayVaoLam;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.IdRole = IdRole;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public LocalDateTime getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(LocalDateTime NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getIdRole() {
        return IdRole;
    }

    public void setIdRole(int IdRole) {
        this.IdRole = IdRole;
    }

    
    
    
}
