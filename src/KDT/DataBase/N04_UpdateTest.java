package KDT.DataBase;

import java.sql.SQLException;
import java.util.Scanner;

public class N04_UpdateTest extends DBConnection{
    Scanner scan = new Scanner(System.in);
    public N04_UpdateTest() {

    }
    private void updateStart() {
        // 1. 데이터 준비
        System.out.print("수정할 사원 번호 -> ");
        int empno = Integer.parseInt(scan.nextLine());
        System.out.print("담당업무 -> ");
        String job = scan.nextLine();
        System.out.print("급여    -> ");
        int sal = Integer.parseInt(scan.nextLine());
        System.out.print("추가수당 -> ");
        int comm = Integer.parseInt(scan.nextLine());
        System.out.print("부서코드 -> ");
        int deptno = Integer.parseInt(scan.nextLine());


        try{
            //1. DB 연결
            DBConnect();

            //2. PreparedStatement객체 생성
            String quary = "UPDATE emp SET job = ?, sal = ?, comm = ?, deptno = ? WHERE empno = " + empno;

            pstmt = con.prepareStatement(quary);
            pstmt.setString(1, job);
            pstmt.setInt(2, sal);
            pstmt.setInt(3, comm);
            pstmt.setInt(4,deptno);
            // pstmt.setInt(5,empno);

            Integer result = (Integer) pstmt.executeUpdate();
            if(result > 0){
                System.out.println(result + "개의 레코드가 수정되었습니다.");
            }else{
                System.out.println("사원정보 수정을 실패하였습니다");
            }
        } catch (SQLException e) {
            System.out.println("Prepared객체생성 예외 발생..." + e.getMessage());
        } finally {
            DBClose();
        }
    }

    public static void main(String args[]){
        new N04_UpdateTest().updateStart();
    }

}
