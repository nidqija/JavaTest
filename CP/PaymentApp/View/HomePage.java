package CP.PaymentApp.View;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomePage extends JFrame{


    public HomePage(String title){
        super(title); // calls Jframe constructor to call the title //

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 700));
        setLayout(new BorderLayout());


        JLabel label = new JLabel("Welcome to Bank App!");

        JButton button1 = new JButton("Deposit");
        button1.setPreferredSize(new Dimension(120, 40));

        button1.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                DepositPage depositPage = new DepositPage();
                depositPage.setVisible(true);
                
            }
        });

        JButton button2 = new JButton("Check Balance");
        button2.setPreferredSize(new Dimension(120 , 40));

        JButton button3 = new JButton("Withdraw");
        button3.setPreferredSize(new Dimension(120 , 40));

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));


        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(label);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button1);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button2);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button3);

        add(buttonPanel, BorderLayout.CENTER);

        
        pack(); 

        setLocationRelativeTo(null);
         
        setVisible(true); 

    }
    
    
}
