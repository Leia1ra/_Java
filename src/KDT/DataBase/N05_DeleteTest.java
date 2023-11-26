package KDT.DataBase;

import java.util.Scanner;

public class N05_DeleteTest extends DBConnection{
    public N05_DeleteTest(){

    }
    public void deleteStart(){
        Scanner scan = new Scanner(System.in);
        System.out.print("삭제할 사원번호 -> ");
        int empno = scan.nextInt();

        try{
            DBConnect();
            String quary = "DELETE FROM emp WHERE empno = ?";
            pstmt = con.prepareStatement(quary);
            pstmt.setInt(1, empno);

            int result = pstmt.executeUpdate();
            if(result > 0){
                System.out.println(result + "개의 레코드가 수정되었습니다.");
            }else{
                System.out.println("사원정보 수정을 실패하였습니다");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DBClose();
        }
    }
    public static void main(String args[]){
        new N05_DeleteTest().deleteStart();
    }
}
