package threadYapisi1;

public class Ornek1 extends Thread {
    public Ornek1(){
        start();
    }

    public void run(){
        for (int i=0;i<5;i++)
            System.out.println(i);
    }
}
