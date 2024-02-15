public class thread extends Thread{
    public static void main(String args[]){
        System.out.println("not a threading");
        thread obj = new thread();
        obj.start();
    }
    public void run(){
        System.out.println("running thread");
    }
}
