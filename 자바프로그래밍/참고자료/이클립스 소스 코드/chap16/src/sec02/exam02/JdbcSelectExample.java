package sec02.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 		// ResultSet 클래스 임포트
import java.sql.SQLException;

public class JdbcSelectExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test_db";
    private static final String USER = "root";
    private static final String PASS = "password"; // 실제 루트 패스워드 사용!
    
    public static void selectEmployeeData() {
        String sql = "SELECT name, salary FROM employees";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {   // 실행 및 결과 저장
            
            System.out.println("---------------------------------");
            System.out.println("직원 이름 및 연봉 목록");
            System.out.println("---------------------------------");
            
            while (rs.next()) {
                String name = rs.getString("name"); 
                int salary = rs.getInt("salary");
                
                System.out.printf("이름: %-8s | 연봉: %d만원\n", name, salary); 
            }
            System.out.println("---------------------------------");
            
        } catch (SQLException e) {
            System.err.println("조회 중 SQL 오류: " + e.getMessage());
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
        
        System.out.println("--- 직원 데이터 조회 시작 ---");
        selectEmployeeData();   // 조회 메서드 호출
        System.out.println("--- 조회 작업 완료 ---");
    }
}