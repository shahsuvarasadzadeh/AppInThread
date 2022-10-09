package main.thread;

public class MyConsumer implements Runnable{
    private String name;
    public MyConsumer(String name){
        this.name=name;
    }
    @Override
public void run() {
       System.out.println("im started and waiting");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex){

        }
//        while (true) {
         Base.incA();
//            System.out.println("Azay="+Base.a);

//            int lastIndex = Base.list.size() - 1;
//            if (lastIndex > -1) {
//                String s = Base.list.remove(lastIndex);
//                System.out.println("s=" + s);
//            }
//        }
    }
}
