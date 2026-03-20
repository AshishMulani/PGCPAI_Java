public class TestEmployee {

    public static void main(String[] args) {
        Student s1 = new Student("a");
        Employee e1 = new Employee(101,"Ashish");
        Employee e2 = new Employee(104,"Dhriti");  //code missing

        if(e1.equals(e2))
            System.out.println("Both are Same!");
        else
            System.out.println("Not Same");
    }
}

