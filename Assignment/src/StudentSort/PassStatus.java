package StudentSort;

public class PassStatus {
    public static void ispass(Student s){
        if (s.getPercentage() >=40) {
            s.setResult("PASS");

        }else{
            s.setResult("FAIL");
        }
    }
}
