package connecttosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DAO {
    private Connection conn;
    
    public DAO() {
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
    
    public boolean addProduct(Product p) {
        String sql = "INSERT INTO tblProduct(ID, name, price, number, describe) VALUES(?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getID());
            ps.setString(2, p.getName());
            ps.setString(3, p.getPrice());
            ps.setString(4, p.getNumber());
            ps.setString(5, p.getDescribe());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm sản phẩm.");
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Product> getListProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM tblProduct";
        
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Product p = new Product();
                p.setID(rs.getString("ID"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getString("price"));
                p.setNumber(rs.getString("number"));
                p.setDescribe(rs.getString("describe"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách sản phẩm.");
            e.printStackTrace();
        }
        return list;
    }
   
    
     public boolean deleteProduct(String id) {
        String sql = "DELETE FROM tblProduct WHERE ID = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Trả về true nếu có hàng bị xóa
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa sản phẩm.");
            e.printStackTrace();
            return false;
        }
    }
     public boolean updateProduct(Product p) {
        String sql = "UPDATE tblProduct SET name = ?, price = ?, number = ?, describe = ? WHERE ID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getName());
            ps.setString(2, p.getPrice());
            ps.setString(3, p.getNumber());
            ps.setString(4, p.getDescribe());
            ps.setString(5, p.getID());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật sản phẩm.");
            e.printStackTrace();
            return false;
        }
    }

    
    public static void main(String[] args) {
        new DAO();
    }

}
