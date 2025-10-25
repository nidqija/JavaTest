package CP.PaymentApp.View;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage extends JFrame{


    public HomePage(String title){
        super(title); // calls Jframe constructor to call the title //

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700 , 400));

        JLabel label = new JLabel("Hello this is a frame");
        add(label);

        pack(); 
        setLocationRelativeTo(null); 
        setVisible(true); 

    }
    
    
}
