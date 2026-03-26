package Thread;

public class CustomThread extends Thread{

    public static void main(String[] args) throws InterruptedException{

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread();

        t1.setName("MyThread");

        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName());
    }
}
