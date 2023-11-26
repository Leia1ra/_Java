package KDT.Week1.Day1;

public class N3_Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 : ++, --
        // 산술 : +(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)
        // 시프트 : >>, <<, >>>
        // 비교 : >, <, >=, <=, !=
        // 비트 : &, |, ^, ~
        // 논리 : &&(And), ||(Or), !(Not), ^(Xor)
        // 조건 : ?, :
        // 대입 : =, (산술)=, (비트)=, (시프트)=
		
		// 산술연산자 : +(덧셈), -(뺄셈), [ < ] *(곱셈), /(나눗셈), %(나머지)
		System.out.println("\n#// 산술연산자 : +, -, [ < ] *, /, %");
		// 정수 = 정수 / 정수
		// 실수 = 정수 / 실수
		// 실수 = 실수 / 정수
		// 실수 = 실수 / 실수
		int n1 = 14;
		int n2 = 3;
		int r1 = n1 / n2;
		System.out.print("r1 : "  + r1);
		System.out.println(" -> n1/n2 : " + n1%n2);
		double r2 = (double)n1 / n2;
		System.out.println(r2);
		
		int a = 10;
		a = a + 1;
		System.out.println("a = a+1 : " + a);
		a += 1;
		System.out.println("a += 1 \t: " + a);
		
		// 증감(단항)연산자 : ++, --
		a++; // ++a와 같은 수식, 변수가 씩 증가
		System.out.println("a++ \t: " + a);
		
		int b = a++; // 우선순위문제 : a가 먼저 b에 대입되고, 증가
		System.out.println("b = a++ : " + a + " -> b : " + b);
		
		int c = ++a; // a가 먼저 증가하고, b에 대입
		System.out.println("c = ++a : " + a + " -> c : " + c);
		
		int d = a--;
		System.out.println("d = a-- : " + a + " -> d : " + d);
		
		int e = --a;
		System.out.println("e = --a : " + a + " -> e : " + e);
		
		// 대입연산자 : =, [(산술) : +=, -=, *=, /=, %=], (비트)=, (시프트)= ...
		int x = 5;
//		x = x + 10 / 3 * 4;
		x += 10 / 3 * 4;
		System.out.println("x : " + x);
		
		int y = 10;
		y = y * 2 % 3 + 7 / 3;
//		y *= 2 % 3 + 7 / 3; // X *=의 우선순위가 낮기 때문
		System.out.println("y : " + y);
	}

}
