/*
 * Mintaprogramok/8. fejezet
 * ButtonTest1.java
 *
 * Angster Erzsébet: OO tervezés és programozás, Java II. kötet
 * 2002.09.01.
 * Módosítva: 2015.11.09.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SzinvalasztFrame extends JFrame
                        implements ActionListener {
  Container cp = getContentPane();
  JButton btPiros, btFeher, btZold, btKilep;
  JPanel pnSzin;
  JLabel lbSzoveg;

  public SzinvalasztFrame() {
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setTitle("Színválasztás");
    cp.add(pnSzin = new JPanel(),"North");                 //1
    pnSzin.setBackground(Color.RED);
    lbSzoveg = new JLabel(" Válassz színt! ");             //2
    lbSzoveg.setBackground(Color.WHITE);
    lbSzoveg.setOpaque(true);
    lbSzoveg.setBorder(BorderFactory.createRaisedBevelBorder());
    pnSzin.add(lbSzoveg);

    JPanel pnGombok = new JPanel();                        //3
    pnGombok.add(btPiros = new JButton("Piros"));
    pnGombok.add(btFeher = new JButton("Fehér"));
    pnGombok.add(btZold = new JButton("Zöld"));
    pnGombok.add(btKilep = new JButton("Kilép"));
    cp.add(pnGombok,"South");

    btPiros.addActionListener(this);                       //4
    btFeher.addActionListener(this);
    btZold.addActionListener(this);
    btKilep.addActionListener(this);
    pack();
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {             //5
    if (e.getSource() == btPiros)
      pnSzin.setBackground(Color.RED);
    else if (e.getSource() == btFeher)
      pnSzin.setBackground(Color.WHITE);
    else if (e.getSource() == btZold)
      pnSzin.setBackground(Color.GREEN);
    else if (e.getSource() == btKilep)
      System.exit(0);
  }
}

public class ButtonTest1 {
  public static void main(String[] args) {
    new SzinvalasztFrame();
  }
}
