package KDT.Week4.Day16;

import java.util.Stack;

public class N02_StackTest {
    public N02_StackTest() {
        // Stack : 먼저 입력한 객체가 나중에 출력된다 (Last in First Out : 후입선출 구조)
        Stack stack = new Stack();

        // push() : 객체 추가
        stack.push("이선왕");
        stack.push("가");
        stack.push("나");
        stack.push("다");

        while(!stack.empty()){
            String str = (String) stack.pop();
            System.out.println(str);
        }

    }
    public static void main(String args[]){
        new N02_StackTest();
    }
}
