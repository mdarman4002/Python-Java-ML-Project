package threading;

class Hi implements Runnable {
    public void run(){
        for(int i = 0; i<5; i++){
            

            try {
                if (i%2==0):
                    System.out.println("even: "+i);
                    Thread.sleep(100);} catch(Exception e){}
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            
            try{
                if (i%2!=0):
                    System.out.println("odd: "+i);
                    Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
}
public class Threads{
    public static void main(String args[]){
        Runnable obj1 =new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
    
        t1.start();
        t2.start();
        //obj1.run();
        //obj2.run();

        //obj1.start();
        //obj2.start();
    }
}
