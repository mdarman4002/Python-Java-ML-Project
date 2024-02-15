public class multithread implements Runnable {
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() + "isrunning");

        }
        catch( Exception e){
            System.out.println("Exception is caught");
        }
    }
    
}
class testing{
    public static void main(String args[]){
        int n = 8;
        for(int i =0; i<=8;i++){
            Thread obj = new Thread(new multithread());
            obj.start();
        }
    }
}