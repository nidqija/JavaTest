package CP.PaymentApp.View;
import CP.PaymentApp.Controller.RegisterAccount;
import CP.PaymentApp.Models.WriteCSV;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;



public class SignInPage extends JFrame {
    public SignInPage(){
        super("Sign In Page"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));



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

    
        JLabel label4 = new JLabel("Initial Amount:");
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField amountField = new JTextField(20);
        amountField.setMaximumSize(new Dimension(200 , 200));
        amountField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // === Sign-in button === 

        JButton signInButton = new JButton("Sign In");
        JButton loginButton =  new JButton("Login");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        panel.add(signInButton);
        panel.add(loginButton);

    
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
        signinPanel.add(label4);

        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(amountField);

        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(successLabel);

        signinPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        signinPanel.add(signInButton);

        signinPanel.add(Box.createHorizontalGlue());
        signinPanel.add(Box.createRigidArea(new Dimension(0 , 20)));
        signinPanel.add(panel);

      
        add(signinPanel);



// ================================ Logic for sign-in button ================================== //

        signInButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                CP.PaymentApp.Controller.RegisterAccount account = new RegisterAccount(nameField.getText(), Integer.parseInt(noAccountField.getText()) , Double.parseDouble(amountField.getText()));

                String output = "<html>Sign In Successful!<br/>" + "Name: " + account.getFullName() + "<br/>Account Number: " + account.getAccountNum() + "<br/>Amount: " + account.getAmount() + "</html>";

                // locate file to save account info //
                WriteCSV  writeCSV = new WriteCSV();
                String filePath = writeCSV.getFilePath();

                // prepare content to write to csv file //
                String fileContent = account.getFullName() + "," + account.getAccountNum() + "," + account.getAmount() + "\n";

                // try and except for writing to file //
                // append mode set to true //
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath , true))){

                    // write to file //
                    writer.write(fileContent);

                    // send confirmation to console //
                    System.out.println("Account information for " + fileContent + "has been saved to" + filePath);

                } catch (IOException ex){
                    // handle exception if error occurs during file writing //
                    System.out.println("Error writing to file: " + ex.getMessage());
                }


                dispose();
                HomePage homePage = new HomePage("Home Page");
                homePage.setTextInfo(output);
                homePage.setVisible(true);

            }
        });


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            }
        });

        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
