package StudentSort;
import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int rollno;
    private String name;
    private LocalDate dob;
    private double percentage;
    public String result;

    public Student(int rollno, String name, LocalDate dob, double percentage){
        this.rollno=rollno;
        this.name=name;
        this.dob=dob;
        this.percentage=percentage;
        //this.result=result;
    }

    public int getRollno() {
        return rollno;
    }

    public double getPercentage() {
        return percentage;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", percentage=" + percentage +
                ", result=" + result +
                '}';
    }
}
