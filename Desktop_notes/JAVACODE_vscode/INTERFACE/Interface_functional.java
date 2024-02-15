package INTERFACE;

// Types of interface
// 1. Normal --> more than methods
// 2. Single abstract method--> it will have only one method
// 3. Marker interface --> doesn't have any method
//  single abstract method--> Functional Interface-- Lambda Expression

@FunctionalInterface

interface Abc{
    void show();
}
public  class Interface_functional{
    public static void main(String args[]){
        Abc obj = () -> System.out.println("Hi lambda");
        /*Abc obj = new Abc(){
            public void show(){
                System.out.println("Hi");
            }
        };
        obj.show();*/
        obj.show();
    }
}

