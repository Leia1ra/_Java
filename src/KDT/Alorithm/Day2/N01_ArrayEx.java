package KDT.Alorithm.Day2;

public class N01_ArrayEx {
    static int row;
    static int col;
    private static int value = 1;
    private static int[][] arr;

    public static void main(String args[]){
        setData(3,4);
        //행우선탐색
        searchByRow();
        System.out.println();
        //열우선탐색
        searchByCol();
        System.out.println();
        searchByZ();
    }
    static void setData(int row, int col){
        N01_ArrayEx.row = row;
        N01_ArrayEx.col = col;
        
        arr = new int[row][col];
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = value++;
            }
        }
    }
    static void searchByRow(){
        for(int r=0; r<arr.length; r++){
            for(int c= 0; c<arr[r].length; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    static void searchByCol(){
        for(int c=0; c<col; c++){
            for(int r=0; r<row; r++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    static void searchByZ(){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(r%2 == 0){
                    System.out.print(arr[r][c] + " ");
                } else if(r%2 == 1){
                    System.out.print(arr[r][arr[r].length - c - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}
