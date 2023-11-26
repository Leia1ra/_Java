package KDT.Week4.Day16;

class MemberVO{
    private int num;
    private String name;
    private String tel;
    private String addr;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public MemberVO(){ }
    public MemberVO(int num, String name, String tel, String addr){
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    public String toString(){
        return num + "\t" + name + "\t" + tel + "\t" + addr;
    }
}
