package main.thread;

public class MyRunable2 implements Runnable {
    private int index;
    public MyRunable2(int index){
        this.index=index;
    }

    @Override
    public void run() {
        System.out.println("runable ise dusdu ve 10 saniye isleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("runable isi bitirdi");
    }
}
