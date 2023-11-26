package KDT.Week1.Day1;

public class N2_VariableTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 : 값을 보관하는 것
		// 정수 : byte(1byte), short(2byte), int(4byte:기본데이터형), long(8byte)
		System.out.println("\n# 정수 : byte(1byte), short(2byte), int(4byte:기본데이터형), long(8byte)");
		int age; 		// 변수 선언
		int age2 = 25; 	// 변수선언, 초기
		byte kor = 50;
		//byte mat = 130; // byte는 -128부터127의 볌위를 벗어났 때문
		
		long maxData = 12345678L;
		
		// "문자열"과 숫자형 변를 +연산을 하면 연결된다. age는 지역번수인데초기값이 없으므로 사용 불
		//	System.out.println("age : " + age);
		System.out.println("age : " + age2);
		System.out.println("kor -> " + kor + "\tmaxData ->" + maxData);
		
		// 실수 : float(4byte), double(8byte)
		System.out.println("\n# 실수 : float(4byte), double(8byte)");
		float height = 175.6F;
		double key = 175.6;
		System.out.println("height : " + height);
		System.out.println("key : " + key);
		
		// 논리 : boolean -> true, false
		System.out.println("\n# 논리 : boolean -> true, false");
		boolean boo = false;
		System.out.println("boo -> " + boo);
		
		// 문자 : char(2byte) : 1개의 문자만 보관할 수 있다.
		System.out.println("\n# 문자 : char(2byte) : 1개의 문자만 보관할 수 있다.");
		char c1 = 'A';
		char c2 = '컴';
		char[] _c3 = new char[]{'a', 'b', 'c', 'd', 'e'};
		int r1 = c1 + 1;
		c1 = (char)(c1 + 1);
		System.out.println("r1 : " + r1 + " -> 강제형변환(type casting) : " + (char)r1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 강제형변환 : type casting, 
		System.out.println("\n# 강제형변환(type casting)");
		int keyInt = (int)key;
		System.out.println("keyInt -> " + keyInt);
		//작은형 데이터를 큰 데이터형에 대입할 때에는 자동으로 형변환이 된다.
		double data1 = 2356;
		System.out.println("data1 : " + data1);
		
		String name = new String("홍길동");
		System.out.println("name : " + name);
		
		// 큰형식의 데이터를 작은 데이터형에 대입할 때에는 데이터의 소실의 우려가 있음
		byte num1 = (byte)130;
		System.out.println("num1(byte : 130) -> " + num1);


	}

}
