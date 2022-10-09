package main.thread;

import java.util.concurrent.ThreadFactory;

public class MyCustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {

        if (r instanceof MyRunable){
            Thread t=newThread(r);
            t.setDaemon(true);
            return t;
        }
        else if (r instanceof MyRunable2){
            Thread t=newThread(r);
            t.setDaemon(false);
            return t;
        }
        return null;
    }
}
