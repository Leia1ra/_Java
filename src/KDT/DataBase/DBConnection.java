package KDT.DataBase;

import java.sql.*;

public class DBConnection {
    protected Connection con = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;


    private static final String URL = "jdbc:mysql://localhost/mydb";
    private static final String USER_NAME = "root"; //  MySQL 서버 아이디
    private static final String PASSWORD = "tiger1234"; // MySQL 서버 비밀번호

    static{ // 애가 제일 먼저 실행됨
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException c){
            System.out.println("드라이브 로딩 예외 발생");
            c.printStackTrace();
        }
    }

    public DBConnection(){

    }

    // DB연결
    public void DBConnect(){
        try {
            con = DriverManager.getConnection(URL,USER_NAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }
    }
    public void DBClose(){
        try{
            if(pstmt != null) pstmt.close();
            if(con != null) con.close();
        }catch (SQLException e){
            System.out.println("닫기 에외 발생" + e.getMessage());
        }
    }
}
