package CP.PaymentApp.View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame{


    public HomePage(String title){
        
        super(title); // calls Jframe constructor to call the title //

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 700));
        setLayout(new BorderLayout());


        JLabel label = new JLabel("Welcome to Bank App!");

        JButton button = new JButton("Sign In");
        button.setPreferredSize(new Dimension(120, 40));
 
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                SignInPage SignInpage = new SignInPage();
                SignInpage.setVisible(true);
            }
        });



        JButton button1 = new JButton("Deposit");
        button1.setPreferredSize(new Dimension(120, 40));

        // action listener for deposit button //
        // this is used to redirect to deposit page //

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

        // center alignment for all components //

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);

        // create a panel to hold components in vertical layout //
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // add components to panel with vertical spacing //

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(label);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button1);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button2);

        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button3);

        // add panel to frame //
        add(buttonPanel, BorderLayout.CENTER);

        // finalize frame settings //
        pack(); 

        // center the frame on the screen //
        setLocationRelativeTo(null);
         
        // make the frame visible //
        setVisible(true); 

    }
    
    
}
