package KDT.Alorithm.Sort;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    int max;
    int[][] lot_arrays;
    Lotto(int max){
        this.max = max;
        this.lot_arrays = new int[this.max][7];
    }
    private int[] insertSort(int[] arr){
        int[] now = arr;
        for(int i = 1; i<now.length; ++i){
            int tmp = now[i];
            int j;
            for(j = i-1; j>=0&&tmp<now[j]; --j){
                now[j+1] = now[j];
            }
            now[j+1] = tmp;
        }
        return now;
    }
    void Lotto_Set(){
        Random rand = new Random();
        for(int row = 0; row<lot_arrays.length; ++row){
            for(int col = 0; col<lot_arrays[row].length; ++col){
                lot_arrays[row][col] = rand.nextInt(45) + 1;
                for(int k = 0; k<col; k++){
                    if(lot_arrays[col] == lot_arrays[k]){
                        col--;
                        break;
                    }
                }
            }
            // 정렬
            lot_arrays[row] = insertSort(lot_arrays[row]);
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("게임 수 -> ");
            Lotto l = new Lotto(scan.nextInt());
            l.Lotto_Set();
            int i = 1;
            for(int[] k : l.lot_arrays){

                System.out.printf("%3d게임 -> [ ",i);
                for(int j = 0; j<k.length-1; j++){
                    System.out.printf("%-3d", k[j]);
                }
                System.out.println("] 보너스 -> " + k[k.length-1]);
                ++i;
            }
        }


    }
}
