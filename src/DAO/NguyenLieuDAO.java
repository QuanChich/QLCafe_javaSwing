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

/**
 *
 * @author Admin
 */
public class NguyenLieuDAO {
    public static List<NguyenLieu> getDanhSachNguyenLieu() {
        List<NguyenLieu> danhSachNguyenLieu = new ArrayList<>();
        String sql = "SELECT * FROM tblNguyenLieu";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String MaNguyenLieu = resultSet.getString("MaNguyenLieu");
                String TenNguyenLieu = resultSet.getString("TenNguyenLieu");
                int SoLuong = resultSet.getInt("SoLuong");
                NguyenLieu nguyenLieu = new NguyenLieu(MaNguyenLieu, TenNguyenLieu,SoLuong);
                danhSachNguyenLieu.add(nguyenLieu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachNguyenLieu;
    }
     public static void addNguyenLieu(NguyenLieu nguyenLieu) {
        String sql = "INSERT INTO tblNguyenLieu(MaNguyenLieu, TenNguyenLieu,SoLuong) VALUES (?, ?, ?)";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nguyenLieu.getMaNguyenLieu());
            preparedStatement.setString(2, nguyenLieu.getTenNguyenLieu());
            preparedStatement.setInt(3, nguyenLieu.getSoLuong());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void updateNguyenLieu(NguyenLieu nguyenLieu) {
        String sql = "UPDATE tblNguyenLieu SET TenNguyenLieu=?, SoLuong=? WHERE MaNguyenLieu=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nguyenLieu.getTenNguyenLieu());
            preparedStatement.setInt(2, nguyenLieu.getSoLuong());
            preparedStatement.setString(3, nguyenLieu.getMaNguyenLieu());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteNguyenLieu(String maNguyenLieu) {
        String sql = "DELETE FROM tblNguyenLieu WHERE MaNguyenLieu=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, maNguyenLieu);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
