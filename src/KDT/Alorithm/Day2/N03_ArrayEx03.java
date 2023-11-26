package KDT.Alorithm.Day2;

public class N03_ArrayEx03 {
    static int[][] arr;
    public static void main(String[] args){
        setData(4,5);
        for(int[] k : arr){
            for(int l : k){
                System.out.print(l + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int r = 0; r<arr.length-1; ++r){
            for(int c = 0; c<arr[r].length-1; ++c){
                arr[r][arr[r].length-1] += arr[r][c];
                arr[arr.length-1][c] += arr[r][c];
            }
        }

        for(int[] k : arr){
            for(int l : k){
                System.out.print(l + "\t");
            }
            System.out.println();
        }
    }
    static void setData(int row, int col){
        arr = new int[row][col];
        int value = 1;
        for(int r = 0; r<arr.length; ++r){
            for(int c = 0; c<arr[r].length; ++c){
                if(r == (arr.length - 1) || c == (arr[r].length - 1)){
                    arr[r][c] = 0;
                }else {
                    arr[r][c] = value;
                    ++value;
                }
            }
        }
    }
}
