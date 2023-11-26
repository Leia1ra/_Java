package KDT.Week3.Day14;
// 1명의 학생정보를 보관하는 객체
// 학년(int), 이름(String), 연락처(String), 점수(double)(국,영,수)
public class Student {
    // DTO(Data Transfer Object)는 계층 간 데이터 교환을 하기 위해 사용하는 객체
    // DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스)입니다.

    // VO(Value Object) 값 오브젝트로써 값을 위해 쓰입니다.
    // read-Only 특징(사용하는 도중에 변경 불가능하며 오직 읽기만 가능)을 가집니다.

    // 캡슐화된 정수
    private int grade;
    private String name;
    private String call;
    private double kor, eng, math;
    // private static Student stu = null;
    public Student() {

    }
    public Student(int grade, String name, String tel, double kor, double eng, double math){
        this.grade = grade;
        this.name = name;
        this.call = tel;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 싱글톤화
    // public static Student getInstance(){
    //     if(stu == null){
    //         stu = new Student();
    //     }
    //     return stu;
    // }

    @Override
    public String toString(){
        return "grade = " + grade + ", name = " + name + ", tel = " + call + ", kor = " + kor + ", eng = " + eng + ", math = " + math;
    }

    //클래스 외부로 값을 내보내는 메소드 : getter() -> 시작은 무조건 get으로 시작해야함
    public int getGrade(){
        return grade;
    }
    //클래스 외부에서 값을 변경할수 있는 메소드 : setter() -> 시작은 무조건 set으로 시작해야함
    public void setGrade(int grade){ this.grade = grade; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getCall(){ return call; }
    public void setCall(String call){ this.call = call; }

    public double getKor(){ return kor; }
    public void setKor(double kor){ this.kor = kor; }

    public double getEng(){ return eng; }
    public void setEng(double eng){ this.eng = eng; }

    public double getMath(){ return math; }
    public void setMath(double math){ this.math = math; }
}

