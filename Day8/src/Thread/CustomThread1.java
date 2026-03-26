package Thread;

public class CustomThread1 extends Thread {
    @Override
    public void run() {
//        System.out.println("Inside Run");
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException{

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new CustomThread1();
        t1.setName("MyThread");

        t1.start();
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName());
    }
}
