public class MyThreadWrite extends Thread{


    @Override
    public void run () {
        while (VolatileClass.i<5) {
            System.out.println("increment i to " + (++VolatileClass.i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
