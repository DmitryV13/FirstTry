import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Pow {
    long il=9888;
    public static AtomicInteger i=new AtomicInteger(1);
    public static ArrayList<Double> thread1=new ArrayList<>();
    public static ArrayList<Double> thread2=new ArrayList<>();
    public static void pw(){
        for (i.get(); i.get() < 10; i.getAndIncrement()) {
                if (Thread.currentThread().getName().equals("Thread-2")) {
                    thread1.add(Math.pow(i.get(), 2));
                    System.out.println(Math.pow(i.get(),2));
                }
                else {
                    thread2.add(Math.pow(i.get(), 2));
                    System.out.println(Math.pow(i.get(),2));
                }
        }
    }
    
}
