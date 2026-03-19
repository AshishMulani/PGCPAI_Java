package Day2.Interfaces;

public class Superman implements IFly{
    @Override
    public void fly(){
       // minspeed = 100;  not possible
        System.out.println(minspeed);  //we have to give functionality bcoz member variable are

        //logic to fly
    }
}
