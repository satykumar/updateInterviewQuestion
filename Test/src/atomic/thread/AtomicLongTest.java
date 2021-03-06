package atomic.thread;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongTest {

 static AtomicLong sharedAtomicLong =new AtomicLong();
    
    public static void main(String...args) throws InterruptedException{
           MyRunnable runnable=new MyRunnable();
           Thread thread1=new Thread(runnable,"Thread-1");
           Thread thread2=new Thread(runnable,"Thread-2");
           thread1.start();
           thread2.start();
           
           Thread.sleep(1000); //delay to ensure Thread-1 and Thread-2 finish
           System.out.println("After completion of both threads, "
                        + "sharedAtomicLong = "+sharedAtomicLong);
    }
}

class MyRunnable implements Runnable{
    
    public void run(){
           for(int i=0;i<5;i++){
                  System.out.println("ThreadName="+Thread.currentThread().getName()
                               +" > "+
                               AtomicLongTest.sharedAtomicLong.incrementAndGet());
           }          
           
    }
}