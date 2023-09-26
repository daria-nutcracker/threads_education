import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
/* lesson 4
        MyThreadForStaticPar myThreadForStaticPar1 = new MyThreadForStaticPar ();
        MyThreadForStaticPar myThreadForStaticPar2 = new MyThreadForStaticPar ();
        myThreadForStaticPar1.start();
        myThreadForStaticPar2.start();
*/
/* lesson 3
        Resource resource = new Resource(0);
       MyThread myThread1 = new MyThread();
       MyThread myThread2 = new MyThread();
       myThread1.setResource(resource);
       myThread2.setResource(resource);
       myThread1.start();
       myThread2.start();
       */
        /*lesson 5
        MyThreadRead myThreadRead = new MyThreadRead();
        MyThreadWrite myThreadWrite = new MyThreadWrite();
        myThreadRead.start();
        myThreadWrite.start();

         */
    for (int i = 0; i < 10000; i++)
        new ThreadUseAtomic().start();
    Thread.sleep(3000);


       System.out.println(currentThread().getName());
//        System.out.println(resource.getI());
    }
}