package Singleton;

public class SingletonClass {

    private static SingletonClass singletonClass = null;
    private SingletonClass(){}


    public static SingletonClass getInstance(){
        if(singletonClass == null)
            singletonClass = new SingletonClass();
        return singletonClass;
    }
}
