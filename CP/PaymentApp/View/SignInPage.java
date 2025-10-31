package CP.PaymentApp.View;
import CP.PaymentApp.Controller.RegisterAccount;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignInPage extends JFrame {
    public SignInPage(){
        super("Sign In Page"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));

        // === Label ===


// ======================================================================================

        JLabel label = new JLabel("Sign In");
        label.setAlignmentX(Component.CENTER_ALIGNMENT );

        Font titleFont = new Font("Serif" , Font.BOLD , 24);
        label.setFont(titleFont);

// ======================================================================================


        JLabel label2 = new JLabel("Full Name:");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField nameField = new JTextField(20);
        nameField.setMaximumSize(new Dimension(200, 30));
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);

// =======================================================================================


        JLabel label3 = new JLabel("Number of Account:");
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);


        JTextField noAccountField = new JTextField(20);
        noAccountField.setMaximumSize(new Dimension(200, 200));
        noAccountField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // === Sign-in button ===
        JButton signInButton = new JButton("Sign In");
        signInButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel successLabel = new JLabel();
        successLabel.setHorizontalAlignment(SwingConstants.CENTER);
        successLabel.setVerticalAlignment(SwingConstants.TOP);

        // === Panel with vertical layout ===
        JPanel signinPanel = new JPanel();
        signinPanel.setLayout(new BoxLayout(signinPanel, BoxLayout.Y_AXIS));
        signinPanel.add(Box.createVerticalGlue());
        signinPanel.add(label);
        
        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(label2);

        signinPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        signinPanel.add(nameField);

        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(label3);

        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(noAccountField);

        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(successLabel);

        signinPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        signinPanel.add(signInButton);

        signinPanel.add(Box.createVerticalGlue());

      
        add(signinPanel);



// ================================ Logic for sign-in button ================================== //

        signInButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                RegisterAccount account = new RegisterAccount(nameField.getText(), Integer.parseInt(noAccountField.getText()));
                String output = "<html>Sign In Successful!<br/>" + "Name: " + account.getFullName() + "<br/>Account Number: " + account.getAccountNum() + "</html>";
                successLabel.setText(output);
                dispose();
                HomePage homePage = new HomePage("Home Page");
                homePage.setVisible(true);
              
            }   
        });
        

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
