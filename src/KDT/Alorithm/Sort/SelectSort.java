package KDT.Alorithm.Sort;

public class SelectSort {
    static int arr[];
    static void setData(int lng){
        arr = new int[lng];
        for(int i = 0; i<arr.length; ++i){
            arr[i] = (int)(Math.random()*(100-1+1)) + 1;
        }
    }
    static void selectionSort(){
        // 기준점으로 사용할 index
        for(int idx = 0; idx<arr.length-1; ++idx){
            // 기준점과 마지막데이터까지 제일 작은 값을 가진 idx를 구한다
            int minIdx = idx;
            for(int i = idx+1; i< arr.length; i++){
                if(arr[minIdx] > arr[i]){
                    minIdx = i;
                }
            }

            // minIdx의 위치의 값과 point위치의 값을 교환
            if(arr[idx] > arr[minIdx]){
                swap(minIdx, idx);
            }
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
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
        selectionSort();
        System.out.println("정렬 후");
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
