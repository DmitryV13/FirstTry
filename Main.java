import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println(VariableOperations.a);
        Runnable r=()->{
            VariableOperations.inc();
            VariableOperations.dec();
            };
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();
        while(true) {
            if(!t1.isAlive() && !t2.isAlive()) {
                System.out.println(VariableOperations.a);
                break;
            }
        }
        //task 2
        Runnable r2=()->{
            Pow.pw();
        };
        Thread t3=new Thread(r2);
        Thread t4=new Thread(r2);
        t3.start();
        t4.start();
        while(true) {
            if(!t3.isAlive() && !t4.isAlive()) {
                System.out.println(Pow.thread1 +"\n"+ Pow.thread2);
                break;
            }
        }
    }
}