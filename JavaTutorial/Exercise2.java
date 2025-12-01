package JavaTutorial;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;


public class Exercise2 {
    private static int seconds = 0;
    private static int lastIndex = -1;
    private static int score = 0;
    private static Clip clip;


    public static void playSound(URL soundFile){
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();  // assign to the static clip
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public static void stopSound(){
        if(clip != null && clip.isRunning()){
                clip.stop();
                clip.close();
        }
    }


    public static void main(String[] args){

// ====================== defining frame and panel ========================= //

        JFrame frame = new JFrame("Whack-A-Mole Game");

        JPanel panel = new JPanel();



// ====================== defining buttons =========================//


        JButton startButton = new JButton("Start");
        startButton.setBounds(20 ,20 ,100 ,20);

        JLabel scoreLabel = new JLabel("Score : 0");
        scoreLabel.setBounds(220 , 20 , 100 , 20);

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

        stopSound();
        
         // ====================== Timer Functionality ========================= //

                        


        Timer timer = new Timer(1000 , new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                        seconds++;
                        timerLabel.setText("Timer : " + seconds + "s");
                        
                        

                        if ( seconds == 10){
                     // ??????????????????? what value fetching function is this ??????????????????????? //
                                ((Timer)e.getSource()).stop();
                                 int option = JOptionPane.showConfirmDialog(frame, "Time's up! Your final score is: " + score , "Game Over" , JOptionPane.DEFAULT_OPTION);

                                if(option == JOptionPane.OK_OPTION){
                                        stopSound();
                                }

                                for (JButton btn : babyButtons){
                                        btn.setIcon(null);
                                }
                                stopSound();
                        }
                        
                        ImageIcon moleIcon = new ImageIcon(Exercise2.class.getResource("baby.jpg"));
                        Image image = moleIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
                        moleIcon = new ImageIcon(image);

                        if(lastIndex != -1){
                                babyButtons[lastIndex].setIcon(null);
                        }
                        
                        

                        int index = (int)(Math.random() * babyButtons.length);
                        babyButtons[index].setIcon(moleIcon);

                        lastIndex = index;

                      

                        
                }
        });


        
        // ====================== Start Button Functionality ========================= //

        startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    seconds = 0;
                    score = 0;
                    lastIndex = -1;
                    scoreLabel.setText("Score : 0");
                    timerLabel.setText("Timer : 0s");
                    

                    for (JButton btn : babyButtons){
                        btn.setIcon(null);
                    }

                    playSound(Exercise2.class.getResource("/JavaTutorial/AI Baby holding laugh meme vs original.wav"));


                    timer.start();

                 
                }
        });

        
        for (int i = 0 ; i < babyButtons.length; i++){
                int index = i;
                babyButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                  if(index == lastIndex){
                        score++;
                        scoreLabel.setText("Score : " + score);

                        babyButtons[index].setIcon(null);
                        lastIndex = -1;

                       }
                  }
          });
         }





// ====================== adding components to panel ========================= //

        panel.add(startButton);
        panel.add(scoreLabel);
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
