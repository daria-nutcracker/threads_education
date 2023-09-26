public class MyThread extends Thread{
    @Override
    public void run () {
        System.out.println("this is new thread");
        System.out.println(Thread.currentThread().getName());
        someMethod();
    }
    private void someMethod () {
        throw new RuntimeException();
    }
}
