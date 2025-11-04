package CP.PaymentApp.View;
import java.awt.*;
import javax.swing.*;



public class LoginPage extends JFrame {
    public LoginPage(){
        super("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));

        JLabel label = new JLabel("This is the Login Page");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel accountLabel = new JLabel("Account Number: ");
        accountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


    

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel , BoxLayout.Y_AXIS));
        loginPanel.add(Box.createVerticalGlue());

       
    


        loginPanel.add(label);




        add(loginPanel);
        pack();
        setVisible(true);
    }
}
