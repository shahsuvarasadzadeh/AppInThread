package main.thread;

import java.util.UUID;

public class MyProducer {
//    @Override
//    public void run() {
//        while (true) {
////            Base.list.add(UUID.randomUUID().toString());
//        }
//    }
    private Object monitor1=new Object();
    private Object monitor2=new Object();

    public void doIt1() {
        System.out.println("doIt1 basladi");
        synchronized (monitor1) {
            System.out.println("doIt1");

        }
        System.out.println("doIt1 bitdi");
    }
    public void doIt2() {
        System.out.println("doIt2 basladi");
        synchronized (monitor1) { //monitor  and lock
            System.out.println("doIt2");
        }
            System.out.println("doIt2 bitdi");

    }
    public void doIt3(){
        System.out.println("doIt3 basladi");
        synchronized (monitor2) {
            System.out.println("doIt3");
        }
        System.out.println("doIt3 bitdi");
    }

}
