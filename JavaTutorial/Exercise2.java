package JavaTutorial;
import java.awt.*;
import javax.swing.*;




public class Exercise2 {
    public static void main(String[] args){

// ====================== defining frame and panel ========================= //

        JFrame frame = new JFrame("Whack-A-Mole Game");

        JPanel panel = new JPanel();



// ====================== defining buttons =========================//


        JButton startButton = new JButton("Start");
        startButton.setBounds(20 ,20 ,100 ,20);

        JLabel timerLabel = new JLabel("Timer");
        timerLabel.setBounds(400 , 20 , 100 ,20);
        

        JButton button1 = new JButton();
        button1.setBounds(20 , 100 , 150 , 150);


        ImageIcon moleIcon = new ImageIcon(Exercise2.class.getResource("baby.jpg"));
        Image image = moleIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        moleIcon = new ImageIcon(image);
        button1.setIcon(moleIcon);
        button1.setText("");



        JButton button2 = new JButton("Mole 2");
        button2.setBounds(170 , 100 , 150 , 150);

        JButton button3 = new JButton("Mole 3");
        button3.setBounds(320 , 100 , 150 , 150);

        JButton button4 = new JButton("Mole 4");
        button4.setBounds(20 , 250 , 150 , 150);

        JButton button5 = new JButton("Mole 5");
        button5.setBounds(170 , 250 , 150 , 150);

        JButton button6 = new JButton("Mole 6");
        button6.setBounds(320 , 250 , 150 , 150);

        JButton button7 = new JButton("Mole 7");
        button7.setBounds(20 , 400 , 150 ,150);

        JButton button8 = new JButton("Mole 8");
        button8.setBounds(170 , 400 , 150 ,150);

        JButton button9 = new JButton("Mole 9");
        button9.setBounds(320 , 400 , 150 ,150);
        


        



// ====================== adding components to panel ========================= //

        panel.add(startButton);
        panel.add(timerLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);


        panel.setLayout(null);
        frame.add(panel);
        frame.setSize(500 , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
