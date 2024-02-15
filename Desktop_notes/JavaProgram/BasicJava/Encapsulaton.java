class Student{
    private String name;
    private int roll;
    
    public void setName(String Name){
        this.name = Name;
        
    }
    public void setRoll(int Roll){
        this.roll = Roll;
    }
    public int getRoll(){
        return roll;
        
    }
    public String getName(){
        return name;
    }
    
}
class encapsulation{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setName("Arman");
        obj.setRoll(63);
        
        System.out.println("Name: "+obj.getName());
        System.out.println("Roll: "+obj.getRoll());
    }
}
