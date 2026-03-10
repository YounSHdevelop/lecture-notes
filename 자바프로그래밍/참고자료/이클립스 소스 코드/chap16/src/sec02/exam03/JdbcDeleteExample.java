package sec02.exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test_db";
    private static final String USER = "root";
    private static final String PASS = "password"; // 실제 루트 패스워드 사용!
    
    public static void deleteData(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("ID " + id + " 직원 삭제 성공: " + rows + "개의 행이 삭제됨");
            } else {
                System.out.println("ID " + id + " 직원 삭제 실패: 해당 ID를 가진 행이 존재하지 않음");
            }
            
        } catch (SQLException e) {
            System.err.println("삭제 중 SQL 오류: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC 드라이버를 찾을 수 없음!");
            e.printStackTrace();
            return;
        }
        
        final int ID_TO_DELETE = 6;
        
        System.out.println("ID " + ID_TO_DELETE + " 직원 데이터 삭제 시작 ");
        deleteData(ID_TO_DELETE); 	// ID 6번 직원 삭제 호출
        System.out.println("--- 삭제 작업 완료 ---");
    }
}