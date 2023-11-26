package KDT.Alorithm.Sort;

import java.util.Random;

public class InsertSort {
    static int arr[];
    static Random ran = new Random();
    static void setData(int size){
        arr = new int[size];

        for(int i = 0; i<arr.length; ++i){
            arr[i] = ran.nextInt(100) + 1;
        }
    }
    static void print(){
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }
    static void insertionSort(){
        // 기준 데이터의 idx
        for(int i = 1; i< arr.length; ++i){
            int tmp = arr[i];
            int j;
            for(j = i-1; j>=0 && tmp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = tmp;
        }
    }
    static void swap(int minIdx, int idx){
        int temp = arr[idx];
        arr[idx] = arr[minIdx];
        arr[minIdx] = temp;
    }
    public static void main(String args[]){
        setData(10);
        System.out.println("정렬 전");
        print();

        insertionSort();
        System.out.println("정렬 후");
        print();
    }
}
