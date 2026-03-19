package Day2.testInheritance;

public class Manager extends Employee{
    String projects;

    Manager(String name,int id, String projects){
        super(name, id);
        this.projects=projects;
    }

    @Override
    public void calculatesalary(){
        this.salary=5000*id;
    }

    @Override
    public String toString(){
        return super.toString()+ " " + this.salary + " "+ this.projects;
    }

    public String getProjects(){
        return this.projects;

    }
}
