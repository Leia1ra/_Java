package KDT.DataBase;

import java.sql.SQLException;

public class N02_SELECT_Test extends DBConnection {
    public N02_SELECT_Test() {
    }
    public void empList(){
        try {
            // 연결
            DBConnect();

            // 쿼리문 만들기
            String sql = "SELECT empno, ename, job, hiredate, sal FROM emp ORDER BY ename";
            pstmt = con.prepareStatement(sql);

            // 실행
            rs = pstmt.executeQuery();

            // ResultSet에서 데이터 가져오기
            System.out.printf("|%8s |%10s |%12s |%20s |%8s|\n", "empno", "ename", "job", "hiredate", "sal");
            System.out.println("+------------------------------------------------------------------+");
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString(2);
                String job = rs.getString(3);
                String hiredate = rs.getString(4);
                double sal = rs.getDouble(5);
                System.out.printf("|%8d |%10s |%12s |%20s |%8.2f|\n", empno, ename, job, hiredate, sal);
            }
        } catch (SQLException e) {
            System.out.println("Prepared객체생성 예외 발생..." + e.getMessage());
        }finally {
            // DB닫기
            DBClose();
        }
    }
    public static void main(String args[]){
        new N02_SELECT_Test().empList();
    }
}
