package Day2.Interfaces;

public class TestInterface {
    public static void main(String[] args) {
//        IFly fly = new IFly() {
//        } not possible
        IFly ifly = new Superman();  //interface ref var knows who are the implementors

        ifly.fly();  //in compile time checks for reference variable and in runtime

        ifly = new Airplane();  //interface ref var knows who are the implementors

        ifly.fly();
    }
}
