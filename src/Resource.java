public class Resource {
    int i;
    public Resource (int i) {
        this.i = i;
    }
    public synchronized void increaseI () {
        int i = this.i;
        //чтобы показать, что любой из потоков здесь может прервать чужой поток со своими значениями без синхронизации
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        i++;
        this.i = i;
    }
}
