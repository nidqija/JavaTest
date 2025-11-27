package JavaTutorial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise1 extends JFrame {
    public static void main(String[] args) {
       JFrame frame = new JFrame("My Collection of Buttons");
       frame.setLayout(null);

       JPanel panel = new JPanel();
       panel.setLayout(null);
       panel.setBounds(20 ,30 , 500 ,500);


       JButton button1 = new JButton("Push me");
       button1.setBounds(20 , 20 ,100 ,20);
       panel.add(button1);


       JButton button2 = new JButton("Click me");
       button2.setBounds(140 , 20 , 100 , 20);
       panel.add(button2);

       JButton button3 = new JButton("Nothing");
       button3.setBounds(260 , 20 , 100 , 20);
       panel.add(button3);

       JButton button4 = new JButton("Button 0");
       button4.setBounds(20 , 80 , 100 , 20);
       panel.add(button4);

       JButton button5 = new JButton("Button 1");
       button5.setBounds(140 , 80 , 100 , 20);
       panel.add(button5);

       JButton button6 = new JButton("Button 2");
       button6.setBounds(260 , 80 , 100 , 20);
       panel.add(button6);

       JButton button7 = new JButton("Button 3");
       button7.setBounds(140 , 140 , 100 , 20);
       panel.add(button7);




       frame.add(panel);
       frame.setSize(450 , 400);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}