package CP.PaymentApp.View;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class LoginPage extends JFrame {
    public LoginPage(){
        super("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));

        JLabel label = new JLabel("This is the Login Page");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(label);
        pack();
        setVisible(true);
    }
}
