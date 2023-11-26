package KDT.Alorithm;

import java.util.Scanner;

public class Encryption {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        StringBuilder value = new StringBuilder(scan.nextLine());
        StringBuilder key = new StringBuilder(scan.nextLine());

        System.out.println(new Encryption().decrypt(value, key));
    }

    private String decrypt(StringBuilder value, StringBuilder key){
        int idx = 0; // key의 Index번호
        int valueIdx = 0; // value의 Index번호
        int[] buf = new int[key.length()]; // 탐색한 배열의 위치 Index를 저장

        while(true){
            if(idx == key.length()){ // 입력받은 Key값 만큼 검사했을경우 반복문 탈출
                break;
            } else if(valueIdx==value.length()){ // 복호화 시 조건이 불일치한 경우
                return "잘못된 Key";
            }
            // 현재 탐색중인 Key의 값과 value의 값을 비교
            // value의 현재 탐색중인 값의 Index = 이전 인덱스(buf[ReLU(idx-1)]) + 진행횟수(valueIdx)
            else if(value.charAt(buf[ReLU(idx-1)] + valueIdx) == key.charAt(idx)){
                buf[idx] = buf[ReLU(idx-1)] + valueIdx;
                valueIdx = 1; // 동일한 인덱스 재탐색을 방지하기 위함
                ++idx; // 다음 Key의 Index를 참조하기 위함
            } else { // 일치하지 않는다면 value의 Index를 가리키기 위함
                ++valueIdx;
            }
        }

        // 따로 참조를 만들지 않아도 value또한 객체이므로 그대로 진행
        for(int i=0; i<buf.length; ++i){
            value.deleteCharAt(buf[i]-i);// 문자를 지우면 Index가 -1씩 줄어들기 때문
        }
        return value.toString();
    }

    private int ReLU(int idx){
        // 배열의 이전 상태를 불러야 하는데 -1의 결과를 받을 수 있기에 방지하기 위한 ReLU활성화 함수
        if(idx <= 0){ // 0보다 작다면 0을 반환
            return 0;
        } else {    // 0보다 크다면 입력값 그대로 반환
            return idx;
        }
    }
}
