import java.util.concurrent.atomic.AtomicInteger;

public class VariableOperations {
    public static int a = 0;
    public static AtomicInteger i=new AtomicInteger(0);
    public static AtomicInteger j=new AtomicInteger(0);
    
    public static synchronized void inc() {
        for ( i.get(); i.get() < 5000; i.getAndIncrement()) {
            a++;
        }
    }// условие странное, по нему один поток выполняет по одному методу, потому что цикл в методе,
    // а он синхронизирован
    public static synchronized void dec() {
        for (j.get(); j.get() < 1000; j.getAndIncrement()) {
            a--;
        }
    }
}
