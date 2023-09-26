public class MyThread extends Thread{
    @Override
    public void run () {
        //        someMethod();
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName());
    }

//    private void someMethod () {
//        throw new RuntimeException();
//    }
}
