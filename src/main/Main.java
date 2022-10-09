package main;

import main.thread.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("run...");

        ExecutorService service= Executors.newSingleThreadExecutor();
        MyCallable [] arr=new MyCallable[3];
        arr[0]=new MyCallable(1);
        arr[1]=new MyCallable(2);
        arr[2]=new MyCallable(2);

        List<Future<Object>> list=service.invokeAll(Arrays.asList(arr));
        Future f=list.get(0);

        service.shutdown();
        service.awaitTermination(1,TimeUnit.DAYS);
        System.out.println("Termineted");
    }
    private static void scheduleThreadPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
        ex.schedule(new MyRunable(1), 2, TimeUnit.SECONDS);
        ex.schedule(new MyRunable(1), 2, TimeUnit.SECONDS);
    }

    private static void cachedThreadPool() {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
//        ExecutorService service=Executors.newCachedThreadPool(tpe.getThreadFactory());
    }

    private static void fixedThreadPool(){
        ExecutorService service=Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++){
            System.out.println(new MyRunable(i));
        }
    }

        private static void singleThreadExecutor(){
    ExecutorService service= Executors.newSingleThreadExecutor();

    Future f=service.submit(new MyRunable(1));

    service.submit(new MyRunable(2));
        service.submit(new MyRunable(3));
        service.submit(new MyRunable(4));
        service.submit(new MyRunable(5));


//    public static void main(String[] args) throws Exception {
//
//        MyProducer m =new MyProducer();
//        m.doIt1();
//        m.doIt2();
//        m.doIt3();









//        System.out.println("Thread count="+Thread.activeCount());
//        System.out.println("all thrads are starting");
//
//        Thread[] threads=new Thread[100];
//        for (int i=0;i<100;i++){
//            threads[i]=new Thread(new MyConsumer("Test"));
//
//        }
//
//        for (int i=0;i<100;i++){
//            threads[i].start();
//        }
//        System.out.println("Thread count="+Thread.activeCount());
//
//        Thread.sleep(3000);
//        System.out.println(Base.getA());



//        Thread p=new Thread(new MyProducer());
//        Thread p2=new Thread(new MyProducer());
//        Thread m1=new Thread(new MyConsumer("azay"));
//        Thread m2=new Thread(new MyConsumer("eldar"));
//        Thread m3=new Thread(new MyConsumer("javid"));
//        Thread m4=new Thread(new MyConsumer("nargiz"));
//        Thread m5=new Thread(new MyConsumer("rashid"));
//        Thread m6=new Thread(new MyConsumer("tural"));
//
//        p.start();
//        p2.start();
//        m1.start();
//        m2.start();
//        m3.start();
//        m4.start();
//        m5.start();
//        m6.start();






    }
}
