public class Resource {
    private int i;
    public synchronized void setI (int i) {
        this.i = i;
    }
    public int getI () {
        return i;
    }
    public Resource (int i) {
        this.i = i;
    }
    public synchronized void increaseI () {
       // synchronized (this) {} можно так
        int i = this.i;
        //чтобы показать, что любой из потоков здесь может прервать чужой поток со своими значениями без синхронизации
//        if (Thread.currentThread().getName().equals("one"))
//            Thread.yield();
        i++;
        this.i = i;

    }
}
