package CP.BuildFrame;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Card{
    private String fullname;
    private String role;
    private String location;

    public Card(String fullname, String role, String location){
        this.fullname = fullname;
        this.role = role;
        this.location = location;
    }


    public String getFullname(){
        return fullname;
    }

    public String getRole(){
        return role;
    }

    public String getLocation(){
        return location;
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Information");
        frame.setSize(400 , 400);

        Card card1 = new Card("Raziq" , "Developer"  , "Kuala Lumpur");

        String args1 = "Name: " + card1.getFullname();
        String args2 = "Role: " + card1.getRole();
        String args3 = "Location: " + card1.getLocation();


        String[] cardDetails = {args1 , args2 , args3};

        for (int i = 0 ; i < cardDetails.length ;i++){
            JLabel label = new JLabel(cardDetails[i]);
            label.setBounds(100 , 40 + (i * 40) , 300 , 30);
            label.setFont(new Font("Arial", Font.PLAIN, 16));
            frame.add(label);
        }



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
