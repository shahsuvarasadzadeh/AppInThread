package main.thread;

import java.util.ArrayList;
import java.util.List;

public class Base {
//    public static List<String>list = new ArrayList<String>(); //genisleye bilen massiv
    private static volatile int a=0;

    public static int getA(){
        return a;

    }

       public synchronized static void incA(){
        a++;
    }

}
