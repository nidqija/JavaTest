package CP.PaymentApp.View;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SignInPage extends JFrame {
    public SignInPage(){
        JFrame frame = new JFrame("Sign In Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Sign In");
        label.setBounds(100 ,100 ,100 ,100);
        frame.add(label);
        frame.setPreferredSize(new Dimension(700 , 700));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
