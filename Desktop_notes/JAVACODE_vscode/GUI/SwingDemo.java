

import javax.swing.JFrame;
import javax.swing.JLabel;
public class SwingDemo{
    public static void main (String[]args){
        Abc obj =new Abc();
        

    }

}
class Abc extends JFrame{
    public Abc(){
        JLabel l = new JLabel("click here");
        add(l);
        setVisible(true);
        setSize(400,400);
        setTitle("Arman");


    }
}