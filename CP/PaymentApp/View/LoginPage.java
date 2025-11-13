package CP.PaymentApp.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class LoginPage extends JFrame {
    public LoginPage(){
        super("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));

          JLabel label = new JLabel("Log In");
        label.setAlignmentX(Component.CENTER_ALIGNMENT );

        Font titleFont = new Font("Serif" , Font.BOLD , 24);
        label.setFont(titleFont);

// ======================================================================================


        JLabel accountField = new JLabel("Account Number:");
        accountField.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField accountFieldInput = new JTextField(20);
        accountFieldInput.setMaximumSize(new Dimension(200, 30));
        accountFieldInput.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel pinNumber = new JLabel("Account Pin Number:");
        pinNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField pinNumField = new JTextField(20);
        pinNumField.setMaximumSize(new Dimension(200, 30));

        JButton loginButton = new JButton("Enter");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel , BoxLayout.Y_AXIS));
        
        loginPanel.add(Box.createVerticalGlue());

        loginPanel.add(label);
        loginPanel.add(Box.createRigidArea(new Dimension(100 , 200)));

        loginPanel.add(accountField);
        loginPanel.add(accountFieldInput);
      

        loginPanel.add(pinNumber);
        loginPanel.add(pinNumField);
        loginPanel.add(loginButton);
        loginPanel.add(Box.createVerticalGlue());


        loginButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            CP.PaymentApp.Controller.
          }
        });


        



        add(loginPanel);
        pack();
        setVisible(true);
    }
}
