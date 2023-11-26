package KDT.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class N01_INSERTTest {
    Connection con = null;
    PreparedStatement pstmt = null;

    static final String SERVER = "localhost"; // MySQL 서버 주소
    static final String DATABASE = "mydb"; // MySQL DATABASE 이름
    static final String USER_NAME = "root"; //  MySQL 서버 아이디
    static final String PASSWORD = "tiger1234"; // MySQL 서버 비밀번호

    public N01_INSERTTest() {

    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.print("사원 번호 -> ");
        int empno = Integer.parseInt(scan.nextLine());

        System.out.print("사원명 -> " );
        String ename = scan.nextLine();

        System.out.print("직업 -> " );
        String job = scan.nextLine();

        System.out.println("급여 -> ");
        int sal = Integer.parseInt(scan.nextLine());

        // 1. JDBC 드라이브 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }
        // // 1. JDBC 드라이브 로딩
        // try {
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        // }catch(ClassNotFoundException cnfe)
        // {
        //     System.out.println("드라이브 로딩 실패... " + cnfe.getMessage());
        // }

        // 2. DB 연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + SERVER + "/" +  DATABASE, USER_NAME, PASSWORD);

            // 3. 쿼리문 -> PreparedStatement생성
            String sql = "INSERT INTO emp(empno, ename, job, hiredate, sal) values (?,?,?,now(),?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            // ?이 있는 쿼리문은 값을 세팅해야한다.
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4,sal);

            // 4. 실행 insert한 레코드 수 반환
            int result = pstmt.executeUpdate();
            if(result > 0){
                System.out.println(result + "사원이 등록되었습니다.");
            }else{
                System.out.println("사원등록이 실패하였습니다.");
            }

        } catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null){
                    pstmt.close();
                }
                if(con != null){
                    con.close();
                }
            }catch (SQLException s){
                System.out.println("닫기 에외 발생" + s.getMessage());
            }
        }


    }

    public static void main(String args[]){
        new N01_INSERTTest().start();
    }
}
