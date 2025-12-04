package JavaTuto2;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Drawing extends JPanel {

    private final List<List<Point>> strokes =  new ArrayList<>();
    private List<Point> currentStroke;

    public Drawing(){
        setBackground(Color.WHITE);

    // this function is called when the mouse button is pressed //
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                currentStroke = new ArrayList<>();
                currentStroke.add(e.getPoint());
                strokes.add(currentStroke);
                repaint();
            }
        });   
        

    // this function is called whenever the mouse is dragged //
        
       addMouseMotionListener(new MouseMotionAdapter(){
         @Override
         public void mouseDragged(MouseEvent e){
            currentStroke.add(e.getPoint());
            repaint();
         }
       });

    }

    
    // this function is called whenever the panel needs to be repainted //
   
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.BLACK);

    for (List<Point> stroke : strokes) {
        for (int i = 0; i < stroke.size() - 1; i++) {
            Point p1 = stroke.get(i);
            Point p2 = stroke.get(i + 1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}



    
}
