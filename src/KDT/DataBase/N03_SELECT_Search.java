package KDT.DataBase;

import java.sql.SQLException;
import java.util.Scanner;

public class N03_SELECT_Search extends DBConnection {
    public N03_SELECT_Search() {
        // 콘솔에서 부서코드를 입력받아 해당 부서 사원 목록(사업번호, 사원명, 업무, 급여, 부서코드)을 불러오기
    }
    public void emplist(){
        // DB 연결
        DBConnect();

        // 쿼리문 작성
        Scanner scan = new Scanner(System.in);
        System.out.print("부서번호 -> ");
        int deptno_input = scan.nextInt();
        String sql = "SELECT empno, ename, job, sal, deptno FROM emp WHERE deptno = " + deptno_input;

        try{
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();
            System.out.printf("|%8s |%10s |%12s |%8s |%8s|\n", "empno", "ename", "job", "sal", "deptno");
            System.out.println("+------------------------------------------------------+");
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                int deptno = rs.getInt("deptno");
                System.out.printf("|%8d |%10s |%12s |%8.2f |%8d|\n", empno, ename, job, sal, deptno);
            }
            System.out.println("+------------------------------------------------------+");
        }catch (SQLException e){
            System.out.println("Prepared객체생성 예외 발생..." + e.getMessage());
        }finally {
            DBClose();
        }
    }
    public static void main(String[] args){
        new N03_SELECT_Search().emplist();
    }
}
