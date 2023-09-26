public class ThreadUseAtomic extends Thread{
    @Override
    public void run () {
        AtomicClass.i.incrementAndGet();
        System.out.println(AtomicClass.i.get());
    }
}
