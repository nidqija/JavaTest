package Piano;

import java.awt.*;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.swing.*;

public class Piano {

    Synthesizer synth;
    MidiChannel channel;

    // play note //

    private void playNote(int note){
        channel.noteOn(note, 100);
    }

    // stop note //

    private void stopNote(int note){
        channel.noteOff(note);
    }


	Piano(){


        // init midi synthesizer //
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
            channel = synth.getChannels()[0];
            channel.programChange(0);
        } catch (Exception e){
            e.printStackTrace();
        }


		JFrame frame = new JFrame("Pea-Air-Know");
		JButton[] w = new JButton[15];
		JButton[] b = new JButton[14];
		JLayeredPane panel = new JLayeredPane();
		frame.add(panel);

        int whiteNotes[] = { 60 , 62 , 64 , 65 , 67 , 69 , 71 , 72 , 74 , 76 , 77 , 79 , 81 , 83 , 85 };
        int blackNotes[] = { 61 , 63 , 66 , 68 , 70 , 72 , 73 , 75 , 78 , 80 , 82 , 82 , 84 , 86 };


		for (int i = 0; i < 15; i++) {
			w[i] = new JButton();
			w[i].setBackground(Color.WHITE);
			w[i].setLocation(i * 70, 0);
			w[i].setSize(70, 300);
			panel.add(w[i], 0, -1);

            // final note for use in inner class //
            final int note = whiteNotes[i];

            // add mouse listener on note press //
            w[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent e){
                    playNote(note);
                }

                public void mouseReleased(java.awt.event.MouseEvent e){
                    stopNote(note);
                }
            });
		}

        int blackIndex = 0;
		for (int i = 0; i < 14; i++) {
			if (i==2) continue; // skip space for E-F
            if (i == 6) continue; // skip space for B-C
            if ( i == 9) continue; // skip space for E-F
            if (i == 13 ) continue;

			b[blackIndex] = new JButton();
			b[blackIndex].setBackground(Color.BLACK);
            // set location and size of the black keys //
			b[blackIndex].setLocation(35 + i * 70, 0);
			b[blackIndex].setSize(70, 150);
			panel.add(b[blackIndex], new Integer(1));

            final int note = blackNotes[blackIndex];

            b[blackIndex].addMouseListener(new java.awt.event.MouseAdapter(){
                public void mousePressed(java.awt.event.MouseEvent e){
                    playNote(note);
                }

                public void mouseReleased(java.awt.event.MouseEvent e){
                    stopNote(note);
                }
            });

            blackIndex++;
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(990, 320);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Piano();	
	}
}

