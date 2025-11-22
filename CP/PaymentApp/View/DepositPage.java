package CP.PaymentApp.View;
import CP.PaymentApp.Controller.SessionUser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DepositPage extends JFrame{

    public DepositPage(){
        super("Deposit Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 700));

        setLayout(new GridLayout(3,1));

        JPanel depositPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        depositPanel.setLayout(new BoxLayout(depositPanel, BoxLayout.Y_AXIS));
        
        
        JLabel label2 = new JLabel("Your deposit is: ");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        depositPanel.add(label2);


        add(depositPanel , BorderLayout.CENTER);
       

        SessionUser currentUser = SessionUser.getExistingInstance();

        if(currentUser != null){

            JLabel nameLabel = new JLabel(currentUser.getFullName());
            nameLabel.setHorizontalAlignment(JLabel.CENTER);
            JLabel amountLabel = new JLabel("$" + currentUser.getAmount());
            amountLabel.setHorizontalAlignment(JLabel.CENTER);
            depositPanel.add(nameLabel);
            depositPanel.add(amountLabel);
            

        } else {
            JLabel noUserLabel = new JLabel("No user is currently logged in.");
            noUserLabel.setHorizontalAlignment(JLabel.CENTER);
            add(noUserLabel);
        }

        JButton backButton = new JButton("Return to Home Page");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        depositPanel.add(backButton);


        backButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed( ActionEvent e){
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
