package StudentSort;



import java.time.LocalDate;
import java.util.*;


//import static javax.print.attribute.Size2DSyntax.MM;

public class TestStudent {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student "+(i+1));

            System.out.println("Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Date of Birth(yyyy-mm-dd): ");
            String dobinput = sc.nextLine();

            LocalDate dob=LocalDate.parse(dobinput);
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            Date dob=sdf.parse(sc.nextLine());

            System.out.println("Percentage: ");
            Double percentage = sc.nextDouble();


            Student student = new Student(rollno,name,dob,percentage);

            studentList.add(student);
        }
        sc.close();

        // Step 1: Set pass/fail result for each student
        for (Student s : studentList) {
            PassStatus.ispass(s);
        }

        // Step 2: Sort:
        // - PASS students first, then FAIL students
        // - Within each group, sort alphabetically by name
        studentList.sort((s1, s2) -> {
            // First compare by result (PASS vs FAIL)
            int resultCompare = s1.getResult().compareToIgnoreCase(s2.getResult());

            if (resultCompare != 0) {
                // Reverse order so PASS comes before FAIL
                return resultCompare * -1;
            } else {
                // If results are same, sort by name A–Z
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });

        // Display final sorted list
        System.out.println("\nSorted Students (PASS first, then FAIL, by name):");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }


}

//Sorted Students (PASS first, then FAIL, by name):
//Student{rollno=1, name='ash', dob=2002-04-05, percentage=80.0, result=PASS}
//Student{rollno=2, name='Dhriti', dob=2003-08-26, percentage=85.0, result=PASS}
//Student{rollno=3, name='PattyaBhai', dob=2003-05-04, percentage=87.0, result=PASS}
//Student{rollno=5, name='pajjya', dob=2001-02-03, percentage=30.0, result=FAIL}
//Student{rollno=4, name='vijay', dob=2001-02-03, percentage=25.0, result=FAIL}
