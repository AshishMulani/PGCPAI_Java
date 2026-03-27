package Day2.testInheritance;

public abstract class Employee {             //as abstract function present
    String name;
    int id;
    float salary;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public abstract void calculatesalary();    //as abstract function end empty

    @Override
    public String toString(){
        return name+" "+id+" ";
    }




}
