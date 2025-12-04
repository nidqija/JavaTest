package JavaTuto2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DrawingProgram extends JFrame {


    public DrawingProgram(){
		super("Painter");

	
		JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		toolbar.add(new Label("Drag mouse to draw"));
		this.add(toolbar,BorderLayout.SOUTH);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add( new Drawing() , BorderLayout.CENTER);
		setVisible(true);


		JButton btn = new JButton("Add Color");
		toolbar.add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
              // to be implemented later //
			}
		});
	}
	
	public static void main(String[] a){
		SwingUtilities.invokeLater(DrawingProgram::new);
	}

}
