package Day2.Interfaces;

public class Superman implements IFly{
    @Override
    public void fly(){
       // minspeed = 100;  not possible
        System.out.println("Superman flys");  //we have to give functionality bcoz of abstract

        //logic to fly
    }
}
