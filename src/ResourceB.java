public class ResourceB {
    static ResourceA resourceA = new ResourceA();
    public static synchronized int GetI () {
        //Deadlock
        return resourceA.returnI();
    }
    public synchronized int returnI () {
        return 1;
    }
}
