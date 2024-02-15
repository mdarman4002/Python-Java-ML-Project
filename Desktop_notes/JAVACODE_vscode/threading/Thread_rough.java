package threading;


//class A implements Runnable{
   /*  public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("hi");
            try{
                Thread.sleep(100);
            
            }catch(Exception e){}
        }
    }*/
/*}
class B implements Runnable{
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("hello");
            try{
                Thread.sleep(100);
            
            }catch(Exception e){}
        }
    }
}*/
/* 
public class thread_rough {
    public static void main(String ars[]){
    
        Runnable obj1 =() -> 
        {
        
            for(int i = 1; i <=5; i++){
                System.out.println("hi");
                try{
                    Thread.sleep(100);
                
                }catch(Exception e){}
            }
        };
        Runnable obj2 = () ->
        {
            for(int i = 1; i <=5; i++){
                System.out.println("hello");
                try{
                    Thread.sleep(100);
                
                }catch(Exception e){}
            } 
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
    
}*/
/* 
class Thread_rough{
    public static void main(String args[]){
        Runnable obj1 = () ->
        {
            for(int i=1; i<=3; i++){
                System.out.println("hello");
                try{
                    Thread.sleep(1000);
                }catch (Exception e);{}
            }
        };
        Runnable obj2 = () ->
        {
            for(int i=1; i<=3; i++){
                System.out.println("Arman");
                try{
                    Thread.sleep(1000);
                }catch (Exception e);{}
            }
            
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
*/

class Thread_rough{
    public static void main(String args[]){
        Runnable obj1 = () ->{
            for(int i = 0;i <=3; i++){
                System.out.println("niet");
                try{
                    Thread.sleep(500);

                }catch(Exception e){}
            }
        };
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}