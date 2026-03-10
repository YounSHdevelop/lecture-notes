package sec02.exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test_db";
    private static final String USER = "root";
    private static final String PASS = "password"; // 실제 루트 패스워드 사용!
    
    public static void updateDepartment(int id, String newDepartment) {
        String sql = "UPDATE employees SET department = ? WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setString(1, newDepartment);
            pstmt.setInt(2, id);
            
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("ID " + id + " 직원 부서 변경 성공:" + newDepartment + " (총 " + rows + "개 행 업데이트)");
            } else {
                System.out.println("ID " + id + " 직원 부서 변경 실패: 해당 ID를 가진 행이 존재하지 않음");
            }
            
        } catch (SQLException e) {
            System.err.println("업데이트 중 SQL 오류: " + e.getMessage());
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
        
        final int TARGET_ID = 1;
        final String NEW_DEPARTMENT = "마케팅";
        
        System.out.println("ID " + TARGET_ID + " 직원 데이터 업데이트 시작 (부서: " + NEW_DEPARTMENT + ") ---");
        updateDepartment(TARGET_ID, NEW_DEPARTMENT);
        System.out.println("--- 업데이트 작업 완료 ---");
    }
}