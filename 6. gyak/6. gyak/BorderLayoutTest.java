/*
 * Mintaprogramok/6. fejezet
 * BorderLayoutTest.java
 *
 * Angster Erzsébet: OO tervezés és programozás, Java II. kötet
 * 2002.09.01.
 * Módosítva: 2015.10.19.
 */

import java.awt.*;
import javax.swing.*;

class BorderLayoutTest extends JFrame {
  Container cp = getContentPane();

  public BorderLayoutTest() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("BorderLayout");
    cp.setLayout(new BorderLayout(2,1));                   //1
    cp.add(new JButton("North - Észak - Felsõ"),"North");
    cp.add(new JButton("South - Dél - Alsó"),"South");
    cp.add(new JButton("West - Nyugat - Bal"),"West");
    cp.add(new JButton("East - Kelet - Jobb"),"East");
    cp.add(new JButton("Center - Középsõ"),"Center");

    setSize(450,200);
    setVisible(true);
  }

  public static void main (String args[]) {
    new BorderLayoutTest();
  }
}
