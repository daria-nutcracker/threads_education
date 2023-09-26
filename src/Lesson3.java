public class Lesson3 {
    public static void funcLesson3() {
        Resource resource = new Resource(0);
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setResource(resource);
        myThread2.setResource(resource);
        myThread1.start();
        myThread2.start();
    }
}
