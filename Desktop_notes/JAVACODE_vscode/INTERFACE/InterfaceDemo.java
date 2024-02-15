package INTERFACE;

interface Abc{
    void show();
}
/* 
class implementor implements Abc{
    public void show(){
        System.out.println("anything");
    }
}*/
public class InterfaceDemo{
    public static void main(String args []){
        //Abc obj = new implementor();
        Abc obj = new Abc(){
            public void show(){
                System.out.println("hello friends");
            }
        };
        obj.show();
    }
}