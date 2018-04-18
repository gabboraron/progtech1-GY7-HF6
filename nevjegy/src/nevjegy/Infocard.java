package nevjegy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Toolkit;

/**
 *
 * @author Sándor
 */
public class Infocard extends JFrame
{
    public static void main(String[] args)
    {
        new Infocard();
        
    }

    public Infocard()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        java.net.URL    url = Infocard.class.getResource("person.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        setTitle("Névjegy");
        //setSize(800, 800);
        setVisible(true);
        
        
        //JButton b1;
        //JLabel l1;

        setLayout(new BorderLayout());
	setContentPane(new JLabel(new ImageIcon("C:\\Users\\Sándor\\Documents\\progtech1\\gyak7\\nevjegy\\src\\nevjegy/background.png")));
	setLayout(new FlowLayout());
        //l1.setOpaque(true);
	//l1=new JLabel("Burian Sándor");
	//b1=new JButton("I am a button");
	//add(l1);
	//add(b1);
	// Just for refresh :) Not optional!
        getContentPane().add(new MessageButton());
        setSize(4, 5);      //ide miért kell kétszer?
        setSize(800, 800);
    }
}
