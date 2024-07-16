import javax.swing.*;
import java.awt.*;

public class UserForm extends JFrame{
    public static void main(String[] args) {
        JFrame j = new JFrame("User Form") ;
        j.setVisible(true);
        j.setSize(800, 400) ;
        j.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Name : ") ;
        j.add(l1) ;
        JTextField t1 = new JTextField(20) ;
        j.add(t1);
        JLabel l2 = new JLabel("Password : ") ;
        j.add(l2) ;
        JTextField t2 = new JTextField(20) ;
        j.add(t2) ;
        JButton b = new JButton("Submit") ;
        j.add(b);
    }
}
