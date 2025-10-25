package CP.PaymentApp.View;

import java.awt.Dimension;
import javax.swing.JFrame;

public class SignInPage extends JFrame {
    public SignInPage(){
        JFrame frame = new JFrame("Sign In Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700 , 700));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
