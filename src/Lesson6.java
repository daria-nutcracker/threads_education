public class Lesson6 {
    public static void funcLesson6 () throws InterruptedException {
        for (int i = 0; i < 10000; i++)
            new ThreadUseAtomic().start();
        Thread.sleep(3000);
    }
}
