package Thread;

public class CustomeRunnable1 implements Runnable{
    @Override
    public void run(){
        synchronized (this){
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new CustomeRunnable1();
        Thread t1 = new Thread(runnable,"MyThread1");
        Thread t2 = new Thread(runnable,"MyThread2");
        t1.start();
        t2.start();
    }
}
