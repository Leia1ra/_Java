package KDT.Week1.Day5;
// import java.util.Random;
public class N4_Array04 {
    public static void main(String args[]){
        int[] scores = new int[6];
        // Random r = new Random();
        // for(int i = 0; i< scores.length; ++i){
        //     scores[i] = r.nextInt(100);
        // }
        for(int i = 0; i< scores.length; ++i){
            scores[i] = (int)(Math.random()*100);
        }
        for(int k : scores){
            System.out.println(k);
        }
    }
}
