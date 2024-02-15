package INTERFACE;

class A{
    public void show(){
        System.out.println("show something");
    }
}
/*class B extends A{
    public void show(){
        System.out.println("I am the best");
    }
}
*/

public class Interface_anonymous {
    public static void main(String args[]){
        //A obj = new B();
        A obj = new A()
        {
            public void show(){
                System.out.println("wow, I'm the ,best");
            }
        };
        obj.show();
    }
    
}
