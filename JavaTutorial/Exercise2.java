package JavaTutorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Exercise2 {
    private static int seconds = 0;
    public static void main(String[] args){

// ====================== defining frame and panel ========================= //

        JFrame frame = new JFrame("Whack-A-Mole Game");

        JPanel panel = new JPanel();



// ====================== defining buttons =========================//


        JButton startButton = new JButton("Start");
        startButton.setBounds(20 ,20 ,100 ,20);

        JLabel timerLabel = new JLabel("Timer : 0s");
        timerLabel.setBounds(400 , 20 , 100 ,20);
        

        JButton button1 = new JButton();
        button1.setBounds(20 , 100 , 150 , 150);


        JButton button2 = new JButton();
        button2.setBounds(170 , 100 , 150 , 150);

        JButton button3 = new JButton();
        button3.setBounds(320 , 100 , 150 , 150);

        JButton button4 = new JButton();
        button4.setBounds(20 , 250 , 150 , 150);

        JButton button5 = new JButton();
        button5.setBounds(170 , 250 , 150 , 150);

        JButton button6 = new JButton();
        button6.setBounds(320 , 250 , 150 , 150);

        JButton button7 = new JButton();
        button7.setBounds(20 , 400 , 150 ,150);

        JButton button8 = new JButton();
        button8.setBounds(170 , 400 , 150 ,150);

        JButton button9 = new JButton();
        button9.setBounds(320 , 400 , 150 ,150);

        JButton[] babyButtons = {button1 , button2 , button3 , button4 , button5 , button6 , button7 , button8 , button9};

      
        
         // ====================== Timer Functionality ========================= //

        Timer timer = new Timer(1000 , new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                        seconds++;
                        timerLabel.setText("Timer : " + seconds + "s");
                        ImageIcon moleIcon = new ImageIcon(Exercise2.class.getResource("baby.jpg"));
                        Image image = moleIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
                        moleIcon = new ImageIcon(image);
                        
                        for (JButton babyButton : babyButtons){
                                babyButton.setText(null);
                        }
                          

                        int index = (int)(Math.random() * babyButtons.length);
                        babyButtons[index].setIcon(moleIcon);
                }
        });

        // ====================== Start Button Functionality ========================= //

        startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    seconds = 0;
                    timerLabel.setText("Timer: 0s");
                    timer.start();
                }
        });





        
        


        



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
