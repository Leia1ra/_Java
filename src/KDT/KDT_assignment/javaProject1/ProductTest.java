package KDT.KDT_assignment.javaProject1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

// 1. JDBC 드라이브 로딩
public class ProductTest extends DBConnect{
	ProductVO[] v;
	public void SQLProc(){
		//2. DB 연결
		DBConnect();
		//3. PreparedStatement객체 생성 + Quary문 작성
		String quary = "SELECT * FROM JavaP1";
		try {
			pstmt = con.prepareStatement(quary,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//4. 실행
			rs = pstmt.executeQuery();
			// ResultSet에서 데이터 가져오기
			rs.last();
			v = new ProductVO[3];
			rs.beforeFirst();
			int i = 0;
			while(rs.next()){
				v[i] = new ProductVO();
				v[i].setPrdNo(rs.getInt(1));
				v[i].setPrdName(rs.getString(2));
				v[i].setPrdPrice(rs.getInt(3));
				v[i].setPrdYear(Calendar.getInstance(), rs.getInt(4));
				v[i].setPrdMaker(rs.getString(5));
				++i;
			}
		} catch (SQLException e) {
			System.out.println("Prepared객체생성 예외 발생..." + e.getMessage());
		} finally {
			DBClose();
		}
	}
	public void exec(){
		System.out.printf("%-8s %-6s %-10s %-6s %s\n",
				"상품번호",
				"상품명",
				"가격",
				"연도",
				"제조사"
		);
		System.out.println("+--------------------------------------------+");
		for(ProductVO K : v){
			System.out.println(K.toString());
		}
	}
	public static void main(String[] args) {
		ProductTest p = new ProductTest();
		p.SQLProc();
		p.exec();
	}
}
