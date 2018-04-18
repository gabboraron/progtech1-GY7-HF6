/*
 * Mintaprogramok/7. fejezet
 * PittyegoKeret.java
 *
 * Angster Erzsébet: OO tervezés és programozás, Java II. kötet
 * 2002.09.01.
 * Módosítva: 2015.11.01.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;                                   //1

public class PittyegoKeret extends JFrame
                            implements ActionListener {     //2
  private JButton btPittyeg = new JButton("Pittyeg");

  public PittyegoKeret() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().add(btPittyeg);                       //3
    btPittyeg.addActionListener(this);                     //4
    setBounds(50, 100, 400, 100);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {           //5
    Toolkit.getDefaultToolkit().beep();                    //6
    setTitle(getTitle() + " Pitty");
  }

  public static void main (String args[]) {
    new PittyegoKeret();
  }
}
