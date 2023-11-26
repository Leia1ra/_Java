package KDT.Alorithm.Day2;

public class N02_ArrayEx2 {
    public static void main(String args[]){
        char[][] arr = new char[5][5];
        for(int r = 0; r<arr.length; ++r){
            for(int c = 0; c<arr[r].length; ++c){                //04,13,2,13,04
                if(c == r || (c+r)%(arr[r].length-1) == 0){
                    arr[r][c] = 'X';
                }else {
                    arr[r][c] = 'O';
                }
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
