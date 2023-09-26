public class MyThreadForStaticPar extends Thread{


    @Override
    public void run () {

        for (int i = 0; i < 5; i++) {
            System.out.println("Current thread " + Thread.currentThread().getName() + "  i: " + ResourceWithStaticParameter.increaseI(););
        }
    }
}
