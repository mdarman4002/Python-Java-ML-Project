package threading;



public class daemon {
  public static void main(String args[])throws Exception
  {
    Thread t1 = new Thread(()->
    {
        for(int i= 0; i<=5; i++){
            //System.out.println("Hi");
            System.out.println("hi: "+ Thread.currentThread().getPriority());
            //System.out.println("hi: "+ Thread.currentThread().getName());
            try{Thread.sleep(1000); }catch(Exception e){}
        }
    },"hi thread");
    Thread t2 = new Thread(()->
    {
        for(int i=0; i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        } 
    },"hello thread");// to setName
    
    //t1.setName("Hi thread");
    //t2.setName("Hello thread");
    System.out.println(t1.getName());
    System.out.println(t2.getName());
    //t1.setPriority(1);
    //t2.setPriority(10);
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    System.out.println("t1_priority: "+t1.getPriority());
    System.out.println("t2_priority: "+t2.getPriority());

    
    t1.start();
    try{Thread.sleep(10);}catch(Exception e){}
    t2.start();
    t1.join();
    t2.join();
    System.out.println(t1.isAlive());
  }  
}
