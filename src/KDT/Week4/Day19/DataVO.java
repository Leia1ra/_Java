package KDT.Week4.Day19;

import java.io.Serializable;
import java.util.Calendar;

public class DataVO implements Serializable {
    private int num = 9999;
    public int getNum() {
        return num;
    }public void setNum(int num) {
        this.num = num;
    }

    private String name = "손";
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }

    private Calendar date = Calendar.getInstance();
    public Calendar getDate() {
        return date;
    } public void setDate(Calendar date) {
        this.date = date;
    }

    public DataVO(){

    }
}
