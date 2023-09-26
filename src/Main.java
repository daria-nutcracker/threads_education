import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource(0);
       MyThread myThread1 = new MyThread();
       myThread1.setName("one");
       MyThread myThread2 = new MyThread();
       myThread1.setResource(resource);
       myThread2.setResource(resource);
       myThread1.start();
      // myThread1.join();
       myThread2.start();

       System.out.println(currentThread().getName());
        System.out.println(resource.getI());
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread1 = new Thread(myRunnable);
//        thread1.start();

    }
}