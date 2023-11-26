package KDT.KDT_assignment.javaProject1;

import java.sql.*;

public class DBConnect{
    protected Connection con = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;

    private static final String URL = "jdbc:mysql://localhost/mydb";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "tiger1234";
    static{ // 1. JDBC 드라이브 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void DBConnect(){ //DB 연결
        try {
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection ERROR : " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void DBClose(){
        try{
            if(pstmt != null) pstmt.close();
            if(con != null) con.close();
        } catch (SQLException e) {
            System.out.println("닫기 예외 발생 + " + e.getMessage());
            e.printStackTrace();
        }

    }
}