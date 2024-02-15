package threading;

public class DeadLock {
    public static void main(String args[]){
        try{
            System.out.println("You entered in DeadLock");
            Thread.currentThread().join();
            System.out.println("never executable");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
