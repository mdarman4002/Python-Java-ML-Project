package threading;

class Thread_1 implements Thread{

    public void run(){
        
        for(int i =0; i<5; i++){
           // test  = System.currentTimeMillis();
            //System.out.println("i:"+i+"time: "+System.currentTimeMillis());
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
        
        
    }
}
class Thread_2 implements Runnable{
    public void run(){
        for(int i =0; i<5; ++i){
            // test  = System.currentTimeMillis();
             //System.out.println("i:"+i+"time: "+System.currentTimeMillis());
             try{
                 Thread.sleep(100);
             }catch(Exception e){}
         }
    }

}
class timeCheck{
    public static void main(String args[]){
        Runnable obj_1 = new Thread_1();
        Runnable obj_2 = new Thread_2();
        Thread t1  = Thread(obj_1);
        Thread t2 = Thread(obj_2);
        t1.start();
        t2.start();

    }
}
