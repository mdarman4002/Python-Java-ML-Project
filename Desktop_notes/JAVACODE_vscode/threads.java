public class threads implements Runnable{
    public static void main(String args[]){
        
        threads obj_ = new threads();
        Thread obj = new Thread(obj_);
        obj.start();
        System.out.println("out side threading");
    }
    public void run(){
        System.out.println("insde thread runnning");
    }
    
}
