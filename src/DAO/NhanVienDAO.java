/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Class.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {
    public static List<NhanVien> getDanhSachNhanVien() {
        List<NhanVien> danhSachNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM tblNhanVien";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String MaNV = resultSet.getString("MaNV");
                String TenNV = resultSet.getString("TenNV");
                String GioiTinh = resultSet.getString("GioiTinh");
                String SDT = resultSet.getString("SDT");
                LocalDateTime NgayVaoLam = resultSet.getTimestamp("NgayVaoLam").toLocalDateTime();
                String TenDangNhap = resultSet.getString("TenDangNhap");
                String MatKhau = resultSet.getString("MatKhau");
                
                
                int IdRole = resultSet.getInt("IdRole");
                NhanVien nhanVien = new NhanVien(MaNV, TenNV,GioiTinh, SDT, NgayVaoLam, TenDangNhap, MatKhau, IdRole);
                danhSachNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachNhanVien;
    }
     public static void addNhanVien(NhanVien nhanVien) {
        String sql = "INSERT INTO tblNhanVienu(MaNV, TenNV,GioiTinh, SDT, NgayVaoLam, TenDangNhap, MatKhau, IdRole) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nhanVien.getMaNV());
            preparedStatement.setString(2, nhanVien.getTenNV());
          
            preparedStatement.setString(3, nhanVien.getGioiTinh());
            preparedStatement.setString(4, nhanVien.getSDT());
           
            preparedStatement.setTimestamp(5, Timestamp.valueOf(nhanVien.getNgayVaoLam()));
            preparedStatement.setString(6, nhanVien.getTenDangNhap());
            preparedStatement.setString(7, nhanVien.getMatKhau());
             preparedStatement.setInt(8, nhanVien.getIdRole());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void updateNhanVien(NhanVien nhanVien) {
        String sql = "UPDATE tblNhanVien SET TenNV=?, GioiTinh=?, SDT=?, NgayVaoLam=?, TenDangNhap=?, MatKhau=?, IdRole=? WHERE MaNV=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nhanVien.getTenNV());
          
            preparedStatement.setString(2, nhanVien.getGioiTinh());
            preparedStatement.setString(3, nhanVien.getSDT());
           
            preparedStatement.setTimestamp(4, Timestamp.valueOf(nhanVien.getNgayVaoLam()));
            preparedStatement.setString(5, nhanVien.getTenDangNhap());
            preparedStatement.setString(6, nhanVien.getMatKhau());
             preparedStatement.setInt(7, nhanVien.getIdRole());
              preparedStatement.setString(8, nhanVien.getMaNV());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteNhanVien(String maNV) {
        String sql = "DELETE FROM tblNhanVien WHERE MaNV=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, maNV);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
