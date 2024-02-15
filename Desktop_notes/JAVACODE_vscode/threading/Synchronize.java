package threading;
class Counter{
    int count;
    public synchronized void  increment(){
        count++;
    }
}
public class Synchronize{
    public static void main(String af[]) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable()
        {
            public void run(){
                for(int i= 1; i<=1000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run(){
                for(int i= 1; i<=1000; i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count: "+c.count);

        /*for(int i=0;i<=2;i++){
            c.increment();
            System.out.println("Count; "+c.count);
        }*/
        
    }
}