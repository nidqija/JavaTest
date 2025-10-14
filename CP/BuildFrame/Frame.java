package CP.BuildFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Frame{

    public static void main(String [] args){

        String[] orderTypes = {"Dine In" , "Takeaway" , "Online"};

       
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(400 , 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello , Java!");
        label.setBounds(100 , 120 , 200 ,50);

        

        for ( int i = 0 ; i < orderTypes.length ;i++){
            JLabel label2 = new JLabel(orderTypes[i]);
            label2.setBounds(100 ,100 +( i * 40) , 400 ,100);
            frame.add(label2);
        }

        JButton button = new JButton("Click Me");
        button.setBounds(130 ,50 , 200 , 50);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }
}
