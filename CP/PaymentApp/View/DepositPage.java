package CP.PaymentApp.View;
import CP.PaymentApp.Controller.SessionUser;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DepositPage extends JFrame{

    public DepositPage(){
        super("Deposit Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 700));

        setLayout(new GridLayout(3,1));

        JLabel label = new JLabel("This is the Deposit Page");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        JLabel label2 = new JLabel("Your deposit is: ");
        label2.setHorizontalAlignment(JLabel.CENTER);
        add(label2);

        SessionUser currentUser = SessionUser.getExistingInstance();

        if(currentUser != null){

            JLabel nameLabel = new JLabel(currentUser.getFullName());
            nameLabel.setHorizontalAlignment(JLabel.CENTER);
            JLabel amountLabel = new JLabel("$" + currentUser.getAmount());
            amountLabel.setHorizontalAlignment(JLabel.CENTER);
            add(nameLabel);
            add(amountLabel);
            

        } else {
            JLabel noUserLabel = new JLabel("No user is currently logged in.");
            noUserLabel.setHorizontalAlignment(JLabel.CENTER);
            add(noUserLabel);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
