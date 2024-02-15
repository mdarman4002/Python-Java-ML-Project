class outerClass{
    int x = 10;

    class innerClass{  // can also keep it private or protected but it will not be accessed from outside
        int y = 15;
    }
}
class testing{
    public static void main(String args[]){
        outerClass  outObj = new outerClass();
        outerClass.innerClass inObj = outObj.new innerClass();
        System.out.println("sum of x and y: "+(outObj.x + inObj.y));


    }
}