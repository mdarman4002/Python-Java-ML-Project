package INTERFACE;

//abstract class writer
interface writer{
    void write(){
    
    }
}
class pen implements writer{
     public void write(){
            
          System.out.println("I am a pen");
    }
     public void show(){
    
       }
}
    
class pencil implements writer{
    public void write(){
        System.out.println("I am a pencil");
    }
    
}
class kit{
    public void doSomething(writer pk){
        pk.write();
    }
}
    
    
public class Basic_interface {
    public static void main(String []args){
        kit k = new kit();
        //pen p = new pen();
        writer p = new pen();
         writer pc = new pencil();
           
         k.doSomething(pc);
    }
}
    