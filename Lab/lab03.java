package Lab;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Toolkit;



public class lab03 extends JFrame {
    

    public lab03(){
        super("Simple Calculator");
        setSize(400 , 400);
        JLabel label = new JLabel("Calculator GUI Coming Soon!");

        JLabel label2 = new JLabel();
        JButton button = new JButton("Click Me");


        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(e.getActionCommand());
                label2.setText("Button Clicked!");
                JOptionPane.showMessageDialog(null , "You clicked " + e.getActionCommand());
            }
        });  



     


        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        
      

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(label);
        panel.add(button);
        panel.add(label2);
        add(panel);

           for ( int i = 0 ; i < 5 ; i++){
             JLabel label3 = new JLabel("Label " + (i+1));

             panel.add(label3);

        }

        // maximize window , minimize and close frame 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 
        setVisible(true);
    }

    public static void main ( String[] args){
        new lab03();
    }

}

