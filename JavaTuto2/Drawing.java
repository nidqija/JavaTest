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

// define the stroke width for a default value //
    private int strokeWidth = 10;



// default drawing color //
    private Color currentColor = Color.BLACK;

// a class to represent a stroke made by the user //
      private static class Stroke {
        Color color;
        List<Point> points;
        int strokeWidth;

        Stroke(Color color , int strokeWidth){
            this.strokeWidth = strokeWidth;
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

                // create a new stroke with the current color and add the starting point //
                currentStroke = new Stroke(currentColor , strokeWidth);
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

// function to set the stroke width //
    public void setStrokeWidth(int width){
        this.strokeWidth = width;
    }

// function to get the stroke width //
    public int getStrokeWidth(){
        return this.strokeWidth;
    }
    
// this function is called whenever the panel needs to be repainted //
   
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    Color color;


    g2.setColor(Color.BLACK);



    for (Stroke stroke : strokes) {
        g2.setColor(stroke.color);
        g2.setStroke(new BasicStroke(stroke.strokeWidth));
        for (int i = 0; i < stroke.points.size() - 1; i++) {
            Point p1 = stroke.points.get(i);
            Point p2 = stroke.points.get(i + 1);
            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}



    
}
