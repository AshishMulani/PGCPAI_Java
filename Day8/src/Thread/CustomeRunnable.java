package Thread;

public class CustomeRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable runnable = new CustomeRunnable();
        Thread t1 = new Thread(runnable,"MyThread");
        t1.start();
    }
}
