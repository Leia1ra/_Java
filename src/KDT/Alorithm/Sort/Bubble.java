package KDT.Alorithm.Sort;

import java.util.Random;

public class Bubble {
    public static void main(String args[]){
        // 버블정렬 : 인접한 2개의 값을 비교하여 교환하는 정렬방법
        //          역순으로 정렬된 데이터를 정렬할 경우 속도가 매우 느림
        //          어느정도 정렬이 된 경우에는 속도가 매우 빠름
        //          구현하기 쉽다
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*(100-1+1)) + 1;
        }
        System.out.println("정렬 전");
        for(int k : arr){
            System.out.print(k + "\t");
        }
        System.out.println();

        System.out.println("정렬 중");
        for(int k = 0; k< arr.length; k++){
            for(int i = arr.length - 1; i>0; --i){
                if(arr[i-1] > arr[i]){
                    swap(arr,i-1, i);
                }
            }
            for(int p : arr){
                System.out.print(p + "\t");
            }
            System.out.println();
        }


        System.out.println("정렬 후");
        for(int k : arr){
            System.out.print(k + "\t");
        }
        System.out.println();
    }

    private static void swap(int arr[], int front, int rear) {
        int tmp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = tmp;
    }
}
