package KDT.Alorithm.Day2;

import java.io.*;

public class N03_ArrayScore {
    static int stuCount;
    static int subCount;
    static String[] names;
    static int[][] stuScore;
    public static void main(String args[]){
        try{
            setData();//선처리
            process();//처리
            print();//출력
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print() {
        for(int i = 0; i<stuCount; ++i){
            System.out.printf("%-10s", names[i]);//이름
            for(int j=0; j<stuScore[i].length; ++j){
                System.out.printf("%d ",stuScore[i][j]);
            }
            System.out.println();
        }
        //과목별 총점
        System.out.print("과목별총점 ");
        for(int j=0; j<stuScore[0].length; ++j){
            System.out.print(stuScore[stuCount][j] + " ");
        }
        System.out.println();
        System.out.print("과목별평균 ");
        //과목별 평균
        for(int j=0; j<stuScore[0].length; ++j){
            System.out.print(stuScore[stuCount+1][j] + " ");
        }
    }

    static void setData() throws FileNotFoundException, IOException{
        File f = new File("/Volumes/Disk_2ra/Code/Back_End/Java/_Java/src/KDT/Alorithm/N04_sungjuk.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        stuCount = Integer.parseInt(br.readLine());
        subCount = Integer.parseInt(br.readLine());
        names = new String[10];// 10 + 2
        stuScore = new int[stuCount+2][subCount+3];

        for(int i =0; i<stuCount; ++i){
            String data[] = br.readLine().split(",");
            names[i] = data[0];
            for(int j = 0; j < subCount; ++j){
                stuScore[i][j] = Integer.parseInt(data[j+1]);

            }
        }

    }
    static void process(){
        for(int r = 0; r<stuCount; r++){
            for(int c = 0; c<subCount; c++){
                stuScore[r][subCount] += stuScore[r][c]; // 개인별 총점
                stuScore[stuCount][c] += stuScore[r][c]; // 과목별 총점
            }
            stuScore[r][subCount+1] = stuScore[r][subCount]/subCount;
        }
        // 과목별평균
        for(int c = 0; c<subCount; c++){
            stuScore[stuCount+1][c] = stuScore[stuCount][c] / stuCount;
        }
        scoreRank();
    }

    private static void scoreRank() {
        for(int i=0; i<stuCount; ++i){

            for(int j=0; j<stuCount; ++j){
                if(stuScore[i][subCount] < stuScore[j][subCount]){
                    ++stuScore[i][subCount+2];
                }
            }
            ++stuScore[i][subCount+2];
        }
    }
}
