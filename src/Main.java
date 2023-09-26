import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {

        MyThreadForStaticPar myThreadForStaticPar1 = new MyThreadForStaticPar ();
        MyThreadForStaticPar myThreadForStaticPar2 = new MyThreadForStaticPar ();
        myThreadForStaticPar1.start();
        myThreadForStaticPar2.start();
//        Resource resource = new Resource(0);
//       MyThread myThread1 = new MyThread();
//       MyThread myThread2 = new MyThread();
//       myThread1.setResource(resource);
//       myThread2.setResource(resource);
//       myThread1.start();
//       myThread2.start();

       System.out.println(currentThread().getName());
//        System.out.println(resource.getI());
    }
}