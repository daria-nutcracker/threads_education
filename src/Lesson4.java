public class Lesson4 {
    public static void funcLesson4 () {
        MyThreadForStaticPar myThreadForStaticPar1 = new MyThreadForStaticPar ();
        MyThreadForStaticPar myThreadForStaticPar2 = new MyThreadForStaticPar ();
        myThreadForStaticPar1.start();
        myThreadForStaticPar2.start();
    }
}
