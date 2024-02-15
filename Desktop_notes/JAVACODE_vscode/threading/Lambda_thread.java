package threading;

//class Hi implements Runnable {
    /*  public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("hi");
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    } */
//}
/*class Hello implements Thread{
    

    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}*/
public class Lambda_thread {
    public static void main(String args[]){
        //Runnable obj1 =new Hi();
        //Runnable obj2 = new Hello();

       /* Runnable obj1 = new Runnable(){
            public void run(){*/
        Runnable obj1 = () ->
        {
            for(int i = 0; i<5; i++){
                System.out.println("hi");
                 try {Thread.sleep(1000);} catch(Exception e){}
            }
            
        };
        Runnable obj2 = () -> {
            
            for(int i = 0; i<5; i++){
                System.out.println("hello");
                try{
                    Thread.sleep(1000);
                }
                  catch(Exception e){}
            }
            
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
    
        t1.start();
        t2.start();
        
    }
}

