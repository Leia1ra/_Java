package KDT.KDT_assignment;

public class Dim2Array {
    static final int ARR_NUM = 11;
    public static void main(String[] a){
        int[][] array = new int[ARR_NUM][ARR_NUM];
        /* ver.1
        int buffer = 1; // 열
        // 행처리
        int c_sum = 0;
        for(int row = 0; row < array.length; ++row){
            int r_sum = 0;
            if(row == array.length -1){ buffer = c_sum;}
            int exec = buffer;

            // 열처리
            for(int column = 0; column < array[row].length; ++column){
                array[row][column] = exec;
                exec += buffer;
                if(column == array[row].length - 1 && row == array.length - 1){
                    array[row][column] = 0;
                } else if(column == array[row].length - 1) {
                    array[row][column] = r_sum;
                } else r_sum += array[row][column];

            }
            c_sum += buffer;
            ++buffer;
        }*/

        // ver.2
        for(int row = 0; row < array.length; ++row){
            int buffer = 0;
            for(int column = 0; column < array.length; ++column){
                if(column == array[row].length - 1 && row == array.length - 1){
                    array[row][column] = 0;
                } else if(column == array[row].length - 1) {
                    array[row][column] = buffer;
                } else if(row == array.length -1){
                    array[row][column] = array[column][row];
                } else{
                    array[row][column] = (row + 1) * (column + 1);
                    buffer += array[row][column];
                }
            }
        }

        // 출력구문
        for(int[] row : array){
            for(int column : row){
                System.out.printf("%-4d", column);
            }
            System.out.println();
        }
    }
}
