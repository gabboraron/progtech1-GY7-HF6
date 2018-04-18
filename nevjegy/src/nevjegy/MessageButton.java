package nevjegy;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Sándor
 */
public class MessageButton extends JButton implements ActionListener {
    private int value;
    /**
     *
     */
    public MessageButton()
    {
        super("Kattintss a plusz infókért!");
        value = 0;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch(value){
            case 0:
                value++;
                setText("Név: Burian Sándor");
                break;
            case 1:
                value++;
                setText("Neptun: AWXYHE");
                break;
            case 2:
                value=0;
                setText("Beadandó sorszáma: 6");
                break;                
        }        
    }
    
}
