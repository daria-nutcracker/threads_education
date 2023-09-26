public class Lesson5 {

    public static void funcLesson5() {
        MyThreadRead myThreadRead = new MyThreadRead();
        MyThreadWrite myThreadWrite = new MyThreadWrite();
        myThreadRead.start();
        myThreadWrite.start();
    }
}
