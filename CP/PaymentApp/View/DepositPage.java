package CP.PaymentApp.View;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DepositPage extends JFrame{
    public DepositPage(){
        super("Deposit Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 700));

        JLabel label = new JLabel("This is the Deposit Page");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}



