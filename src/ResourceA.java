public class ResourceA {
    static ResourceB resourceB = new ResourceB();
    public static synchronized int GetI () {
        //Deadlock
        return resourceB.returnI();
    }
    public synchronized int returnI () {
        return 2;
    }
}
