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


		Drawing drawing = new Drawing();

		add(drawing , BorderLayout.CENTER);
		setVisible(true);

		JButton btn = new JButton("Add Color");
		toolbar.add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
              JColorChooser colorChooser = new JColorChooser();
			  Color color = colorChooser.showDialog(btn, "Choose a color", Color.BLACK);
              
			  if ( color != null){
				drawing.setCurrentColor(color);
			  }
			}
		});
	}
	
	public static void main(String[] a){
		SwingUtilities.invokeLater(DrawingProgram::new);
	}

}
