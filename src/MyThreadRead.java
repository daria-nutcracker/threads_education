public class MyThreadRead extends Thread{
    @Override
    public void run () {
        int localVar = VolatileClass.i;
        while (localVar < 5) {
            if (localVar != VolatileClass.i) {
                System.out.println("new value of i is: " + VolatileClass.i);
                localVar = VolatileClass.i;
            }
        }
    }
}
