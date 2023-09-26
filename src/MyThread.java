public class MyThread extends Thread{

    Resource resource;

    public void setResource (Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run () {

        for (int i = 0; i < 5; i++) {
            resource.increaseI();
            System.out.println("Current thread " + Thread.currentThread().getName() + "  i: " + resource.getI());
        }
        //        someMethod();
//        for (int i = 0; i < 5; i++)
//            System.out.println(Thread.currentThread().getName());
//        try {
//            sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
      //  Thread.yield(); //отказ от приоритета - уступает место
    }
}
