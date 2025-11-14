package DA.Unti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Phương thức lấy kết nối
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=DuAn;encrypt=true;trustServerCertificate=true;";
        String user = "sa";      // đổi thành username của bạn
        String pass = "123";  // đổi thành password của bạn

        return DriverManager.getConnection(url, user, pass);
    }

    // Chạy thử kết nối
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại!");
            e.printStackTrace();
        }
    }
}
