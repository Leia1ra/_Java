package KDT.Alorithm.Day1;

public class N02_SwitchEx {
    public static void main(String args[]){
        String name = args[0];
        String grade = args[1];
        String tier = "";
        switch (grade){
            case "A" :
                tier = "Gold";
                break;
            case "B":
            case "C":
                tier = "Silver";
                break;
            default:
                tier = "Bronze";
                break;
        }
        System.out.println(name + "은 " + grade + "학점 입니다.");
        System.out.println("등급은 "+ tier + "학점 입니다.");
    }
}
