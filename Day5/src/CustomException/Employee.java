package CustomException;

public class Employee {
    public String name;
    public int age;
    public String email;

    public Employee(String name, int age, String email) throws AgeException{
        validateAge(age);
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public void validateAge(int age) throws AgeException{
        if(age<25)
            throw new AgeException("Age must be greater than 25 ");
    }
}
////Another way
//public Employee(String name, int age, String email) {
//    if(validateAge(age));
//    this.name=name;
//    this.age=age;
//    this.email=email;
//    else
//        throws AgeException
//}
//
//public void validateAge(int age) throws AgeException{
//    if(age<25)
//        return false;
//    else
//        return true;
//}