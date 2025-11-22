package CP.PaymentApp.View;
import CP.PaymentApp.Controller.SessionUser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DepositPage extends JFrame {

    public DepositPage() {
        super("Deposit Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));

        JPanel depositPanel = new JPanel();
        depositPanel.setLayout(new BoxLayout(depositPanel, BoxLayout.Y_AXIS));
        depositPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel titleLabel = new JLabel("Deposit Money");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        depositPanel.add(titleLabel);

        depositPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        

        SessionUser currentUser = SessionUser.getExistingInstance();

        if(currentUser != null) {

            JLabel nameLabel = new JLabel("User: " + currentUser.getFullName());
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(nameLabel);

            JLabel label2 = new JLabel("Your deposit is:");
            label2.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(label2);

            JLabel amountLabel = new JLabel("Balance: $" + currentUser.getAmount());
            amountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(amountLabel);

            depositPanel.add(Box.createRigidArea(new Dimension(0, 20)));

            JLabel depositLabel = new JLabel("Enter Deposit Amount:");
            depositLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(depositLabel);

            

            JTextField depositField = new JTextField(15);
            depositField.setMaximumSize(new Dimension(200, 30));
            depositField.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(depositField);

            JButton submitButton = new JButton("Submit");
            submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(submitButton);
            
            depositPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        } else {

            JLabel noUserLabel = new JLabel("No user is currently logged in.");
            noUserLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            depositPanel.add(noUserLabel);

        }

        JButton backButton = new JButton("Return to Home Page");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        depositPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        depositPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomePage homePage = new HomePage("Home Page");
                homePage.setVisible(true);
            }
        });

        add(depositPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
