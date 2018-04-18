/*
 * Mintaprogramok/5. fejezet
 * FrameTest2.java
 *
 * Angster Erzsébet: OO tervezés és programozás, Java II. kötet
 * 2002.09.01.
 * Módosítva: 2015.10.19.
 */

import javax.swing.*;
import java.awt.*;

class SpecFrame extends JFrame {
  // Komponensek deklarálása:
  JLabel lbInfo;
  JButton btOk, btNemOk;

  // Konstruktor:
  public SpecFrame() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // Cím, pozíció és méret megadása:
    setTitle("Frame-teszt");
    setBounds(100,50,300,100);

    // Tartalompanel kikérése:
    Container cp = getContentPane();
    // Tartalompanel elrendezésmenedzserének beállítása:
    cp.setLayout(new FlowLayout());

    // Komponensek létrehozása:
    lbInfo = new JLabel("Döntsd el:");
    btOk = new JButton("OK");
    btNemOk = new JButton("Nem OK");

    // Komponensek beillesztése a tartalompanelbe:
    cp.add(lbInfo);
    cp.add(btOk);
    cp.add(btNemOk);

    // A keret láthatóvá tétele:
    setVisible(true);
  }
}

public class FrameTest2 {
  public static void main (String args[]) {
    // A komponensekkel tele keret létrehozása:
    new SpecFrame();
  } // main
} // FrameTest2
