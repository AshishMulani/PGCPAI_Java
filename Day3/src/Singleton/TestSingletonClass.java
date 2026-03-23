package Singleton;

public class TestSingletonClass {

    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        SingletonClass sc1 =  SingletonClass.getInstance();

        System.out.println(sc);
        System.out.println(sc1);
    }

}
