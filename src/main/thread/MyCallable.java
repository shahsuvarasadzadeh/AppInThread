package main.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

    private int index;
    public MyCallable(int index){
        this.index=index;
    }
    @Override
    public Object call() throws Exception {
        doIt();

        return this;
    }
private void doIt(){

    System.out.println("runable ise dusdu ve 10 saniye isleyecek...");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("runable isi bitirdi");
}

}
