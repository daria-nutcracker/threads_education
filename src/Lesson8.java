public class Lesson8 {
    //демонстрация Deadlock
    public static void funcLesson8 () {
        Thread myThread1 = new Thread (
                ()->{System.out.println(ResourceA.GetI());}
        );
        Thread myThread2 = new Thread (
                ()->{System.out.println(ResourceB.GetI());}
        );
        myThread1.start();
        myThread2.start();
    }
}
