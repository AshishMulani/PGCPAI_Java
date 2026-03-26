package Day2.testInheritance;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];

        staff[0]=new Engineer("Ashish",1,500);
        staff[0].calculatesalary();

        staff[1]=new Manager("Dhriti",2,"Java");
        staff[1].calculatesalary();

        staff[2]=new Engineer("Panu",3,500);
        staff[2].calculatesalary();

        System.out.println(staff[0]);
        System.out.println(staff[1]);
        System.out.println(staff[2]);

        for (Employee e : staff){
            if(e instanceof Engineer){
                System.out.println("Engineer");
                Engineer engineer=(Engineer) e;
                System.out.println(engineer.getIncentives());
            }
            else if (e instanceof Manager) {
                System.out.println("Manager");
                Manager manager=(Manager) e;
                System.out.println(manager.getProjects());

            }
            else {
                System.out.println("None");

            }
        }

    }
}
