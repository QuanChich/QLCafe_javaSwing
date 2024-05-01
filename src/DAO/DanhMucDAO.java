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
 * @author admin
 */
public class DanhMucDAO {
    private static DanhMucDAO instante;
    private static DanhMucDAO getInstance(){
        if(instante == null){
            instante = new DanhMucDAO();
        }
        return instante;
    }
    public static List<DanhMuc> getDanhSachDanhMuc() {
        List<DanhMuc> danhSachDanhMuc = new ArrayList<>();
        String sql = "SELECT * FROM tblDanhMucDoUong";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String MaDanhMuc = resultSet.getString("MaDanhMuc");
                String TenDanhMuc = resultSet.getString("TenDanhMuc");
                DanhMuc danhMuc = new DanhMuc(MaDanhMuc, TenDanhMuc);
                danhSachDanhMuc.add(danhMuc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachDanhMuc;
    }
     public static void addDanhMuc(DanhMuc danhMuc) {
        String sql = "INSERT INTO tblDanhMucDoUong(MaDanhMuc, TenDanhMuc) VALUES (?, ?)";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, danhMuc.getMaDanhMuc());
            preparedStatement.setString(2, danhMuc.getTenDanhMuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void updateDanhMuc(DanhMuc danhMuc) {
        String sql = "UPDATE tblDanhMucDoUong SET TenDanhMuc=? WHERE MaDanhMuc=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, danhMuc.getTenDanhMuc());
            preparedStatement.setString(2, danhMuc.getMaDanhMuc());
       
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDanhMuc(String maDanhMuc) {
        String sql = "DELETE FROM tblDanhMucDoUong WHERE MaDanhMuc=?";
        try (Connection connection = DBConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, maDanhMuc);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
