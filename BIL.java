package connecttosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BIL {

    private Connection conn;

    public BIL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=shopdabong;user=sa;password=123456;encrypt=true;trustServerCertificate=true"
            );
        } catch (ClassNotFoundException e) {
            System.out.println("SQLServerDriver không được tìm thấy.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu.");
            e.printStackTrace();
        }
    }

    // Phương thức thêm sản phẩm vào hóa đơn với các trường dữ liệu kiểu String
    public boolean addProductToInvoice(String ID, String name, String price, String number, String describe) {
        String sql = "INSERT INTO tblBill ( IdSanPham, TenSanPham, SoLuong, Gia, MoTa) VALUES ( ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Gán giá trị cho PreparedStatement    
            stmt.setString(2, ID);      // ID sản phẩm
            stmt.setString(3, name);     // Tên sản phẩm
            stmt.setString(4, price);        // Số lượng sản phẩm
            stmt.setString(5, number);            // Giá sản phẩm
            stmt.setString(6, describe);           // Mô tả sản phẩm

            // Thực thi câu lệnh SQL
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;  // Trả về true nếu đã thêm thành công
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm sản phẩm vào hóa đơn.");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng DAO để kết nối với cơ sở dữ liệu
        new BIL();
    }
}
