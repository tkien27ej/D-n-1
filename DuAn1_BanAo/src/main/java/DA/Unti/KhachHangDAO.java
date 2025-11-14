/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA.Unti;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    private Connection getConnection() throws SQLException {
        String url = "String url = \"jdbc:sqlserver://localhost:1433;databaseName=DB_DA1_Nhom4;encrypt=true;trustServerCertificate=true;\";";
        String user = "sa";
        String pass = "123"; 
        return DriverManager.getConnection(url, user, pass);
    }

    public List<KhachHangModel> getAll() {
        List<KhachHangModel> list = new ArrayList<>();
    String sql = "SELECT ma_khach_hang, ten_khach_hang, sdt, gioi_tinh, email, trang_thai FROM Khach_hang WHERE trang_thai = 1";
    
    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            KhachHangModel kh = new KhachHangModel();
            kh.setMaKhachHang(rs.getString("ma_khach_hang"));
            kh.setTen(rs.getString("ten_khach_hang"));
            kh.setSdt(rs.getString("sdt"));
            kh.setGioiTinh(rs.getBoolean("gioi_tinh"));
            kh.setEmail(rs.getString("email"));
            kh.setTrangThai(rs.getBoolean("trang_thai"));
            list.add(kh);
            System.out.println("Đọc được dòng: " + rs.getString("ma_khach_hang"));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
    }

    public boolean insert(KhachHangModel kh) {
        String sql = "INSERT INTO Khach_hang(ma_khach_hang, ten_khach_hang, sdt, gioi_tinh, email, trang_thai) VALUES (?, ?, ?, ?, ?, 1)";
    try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, kh.getMaKhachHang());
        ps.setString(2, kh.getTen());
        ps.setString(3, kh.getSdt());
        ps.setBoolean(4, kh.isGioiTinh());
        ps.setString(5, kh.getEmail());
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }
    
    public boolean delete(String maKH) {
    String sql = "UPDATE Khach_hang SET trang_thai = 0 WHERE ma_khach_hang = ?";
    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, maKH);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    
    public List<KhachHangModel> search(String keyword) {
    List<KhachHangModel> list = new ArrayList<>();
    String sql = "SELECT ma_khach_hang, ten_khach_hang, sdt, gioi_tinh, email, trang_thai " +
                 "FROM Khach_hang WHERE trang_thai = 1 AND " +
                 "(ma_khach_hang LIKE ? OR ten_khach_hang LIKE ?)";

    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        String kw = "%" + keyword + "%";
        ps.setString(1, kw);
        ps.setString(2, kw);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            KhachHangModel kh = new KhachHangModel();
            kh.setMaKhachHang(rs.getString("ma_khach_hang"));
            kh.setTen(rs.getString("ten_khach_hang"));
            kh.setSdt(rs.getString("sdt"));
            kh.setGioiTinh(rs.getBoolean("gioi_tinh"));
            kh.setEmail(rs.getString("email"));
            kh.setTrangThai(rs.getBoolean("trang_thai"));
            list.add(kh);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

}
