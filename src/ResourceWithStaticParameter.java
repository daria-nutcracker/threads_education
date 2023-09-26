public class ResourceWithStaticParameter {
    static int i;

    public ResourceWithStaticParameter (int i) {
        ResourceWithStaticParameter.i = i;
    }
    public static synchronized int increaseI() {
        //synchronized(ResourceWithStaticParameter.class) - весь класс
        int i = ResourceWithStaticParameter.i;
        i++;
        ResourceWithStaticParameter.i = i;
        return i;
    }
}
