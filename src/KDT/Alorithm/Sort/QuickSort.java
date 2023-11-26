package KDT.Alorithm.Sort;

import Standard_Java.HelloKot;

import java.util.Random;

public class QuickSort {
    // 하나의 값을 기준(pivot)으로 기준값보다 큰 그룹과 작은 그룹을 나누어 정렬을 반복함
    // 모든 그룹이 1명이 되면 정렬을 종료함
    static int[] data;
    public static void main(String[] args){
        data = new int[10];
        Random rand = new Random();
        for(int i = 0; i< data.length; i++){
            data[i] = rand.nextInt(100) + 1;
        }
        System.out.println("정렬전");
        print();

        quickSort(0, data.length-1);
        System.out.println("정렬후");
        print();
    }

    private static void quickSort(int left, int right) {
        int pLeft = left;
        int pRight = right;

        int pivot_idx = (left + right)/2; // 피벗
        int pivot = data[pivot_idx];

        do{
            while(data[pLeft] < pivot){// pivot보다 큰 값을 왼쪽에서 찾기
                pLeft++;
            } // pivot보다 큰 값의 index가 반환

            while(data[pRight] > pivot){// pivot보다 작은 값을 오른쪽에서 찾기
                pRight--;
            }

            if(pLeft <= pRight)
                swap(pLeft++, pRight--); // 증감연산자를 뒤에 두면 작업을 실행 후 수행

        }while(pLeft <= pRight);

        // 재귀호출
        if(left < pRight){ quickSort(left, pRight); }
        if(pLeft < right){ quickSort(pLeft, right); }
    }

    private static void swap(int pf, int pl) {
        int tmp = data[pf];
        data[pf] = data[pl];
        data[pl] = tmp;
    }

    private static void print() {
        for(int k : data){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
