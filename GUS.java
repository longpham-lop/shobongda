package connecttosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class GUS {
    private Connection conn;

    public GUS() {
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

    public boolean addGuess(Guess g) {
        String sql = "INSERT INTO tblGuess(ID, name, gender, phone, email, address) VALUES(?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, g.getID());
            ps.setString(2, g.getName());
            ps.setString(3, g.getGender());           
            ps.setString(4, g.getPhone());
            ps.setString(5, g.getEmail());
            ps.setString(6, g.getAddress());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm thông tin khách hàng.");
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Guess> getListGuess() {
        ArrayList<Guess> list = new ArrayList<>();
        String sql = "SELECT * FROM tblGuess";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Guess g = new Guess();
                g.setID(rs.getString("ID"));
                g.setName(rs.getString("name"));
                g.setGender(rs.getString("gender"));
               
                g.setPhone(rs.getString("phone"));
                g.setEmail(rs.getString("email"));
                g.setAddress(rs.getString("address"));
                list.add(g);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách khách hàng.");
            e.printStackTrace();
        }
        return list;
    }
     
   public boolean deleteCustomer(String id) {
        String sql = "DELETE FROM tblGuess WHERE ID = ?"; // Câu lệnh SQL để xóa khách hàng
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id); // Gán giá trị id cho tham số trong câu lệnh SQL
            int rowsAffected = pstmt.executeUpdate(); // Thực thi câu lệnh SQL
            return rowsAffected > 0; // Trả về true nếu có hàng bị xóa
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa khách hàng.");
            e.printStackTrace(); // In ra thông tin lỗi
            return false; // Trả về false nếu có lỗi
        }
    }



    public boolean updateCustomer(Guess c) {
        String sql = "UPDATE tblGuess SET name = ?, gender = ?, phone = ?, email = ?, address = ? WHERE ID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getName());
            ps.setString(2, c.getGender());
            ps.setString(3, c.getPhone());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getAddress());
            ps.setString(6, c.getID());
            return ps.executeUpdate() > 0; // Trả về true nếu có hàng bị cập nhật
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật khách hàng.");
            e.printStackTrace();
            return false;
        }
    }



    public static void main(String[] args) {
        GUS gus = new GUS();
        // Ví dụ sử dụng:
        // Guess g = new Guess("1", "Nguyen Van A", "Nam", new Date(), "0123456789", "a@example.com", "Ha Noi");
        // boolean success = gus.addGuess(g);
        
        // Lấy danh sách khách hàng
        ArrayList<Guess> guesses = gus.getListGuess();
        for (Guess guess : guesses) {
            System.out.println(guess.getName()); // In ra tên khách hàng hoặc thông tin khác
        }
    }
}
