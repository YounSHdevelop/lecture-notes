package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test_db";
    private static final String USER = "root";
    private static final String PASS = "password"; // 실제 루트 패스워드 사용!
    
    public static void insertData(String name, String department, int salary) {
        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // 1. 플레이스 홀더에 값 설정, JDBC의 인덱스는 1부터 시작
            pstmt.setString(1, name);
            pstmt.setString(2, department);
            pstmt.setInt(3, salary);
            
            // 2. 쿼리 실행
            int rows = pstmt.executeUpdate();
            
            System.out.println(name + " 삽입 성공: " + rows + "개의 행이 삽입됨");
            
        } catch (SQLException e) {
            System.err.println("삽입 중 SQL 오류: " + e.getMessage());
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
        
        System.out.println("--- 새로운 직원 데이터 삽입 시작 ---");
        insertData("정민지", "회계", 5200);
        insertData("최현우", "마케팅", 4900);
        insertData("강하늘", null, 4000); 
        System.out.println("--- 삽입 작업 완료 ---");
    }
}