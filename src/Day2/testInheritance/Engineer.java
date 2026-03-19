package Day2.testInheritance;

public class Engineer extends Employee{
    int incentives;

    Engineer(String name,int id,int incentives){
        super(name, id);
        this.incentives=incentives;
    }

    @Override
    public void calculatesalary(){
        this.salary=1000*id+incentives;
    }

   @Override
    public String toString(){
        return super.toString()+ " " + this.salary+" "+this.incentives;
   }

    public int getIncentives(){
        return this.incentives;
    }
}
