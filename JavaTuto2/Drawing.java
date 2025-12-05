package JavaTuto2;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;



public class Drawing extends JPanel {

// a list to store all the strokes made by the user //
    private final List<Stroke> strokes =  new ArrayList<>();

// the current stroke being drawn //
    private Stroke currentStroke;

// default drawing color //
    private Color currentColor = Color.BLACK;

// a class to represent a stroke made by the user //
      private static class Stroke {
        Color color;
        List<Point> points;

        Stroke(Color color){
            this.color = color;
            this.points = new ArrayList<>();
        }
    }
  

// constructor //
    public Drawing(){
        setBackground(Color.WHITE);

    // this function is called when the mouse button is pressed //
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){

                currentStroke = new Stroke(currentColor);
                currentStroke.points.add(e.getPoint());
                strokes.add(currentStroke);
                repaint();
            }
        });   
        

    // this function is called whenever the mouse is dragged //
        
       addMouseMotionListener(new MouseMotionAdapter(){
         @Override
         public void mouseDragged(MouseEvent e){
            currentStroke.points.add(e.getPoint());
            repaint();
         }
       });

    }

// function to set the current drawing color //
    public void setCurrentColor(Color color){
        this.currentColor = color;
    }
    
// this function is called whenever the panel needs to be repainted //
   
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Color color;

    g.setColor(Color.BLACK);

    for (Stroke stroke : strokes) {
        g.setColor(stroke.color);
        for (int i = 0; i < stroke.points.size() - 1; i++) {
            Point p1 = stroke.points.get(i);
            Point p2 = stroke.points.get(i + 1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}



    
}
