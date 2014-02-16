package reppfg;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
public class Puntos extends Frame {
   public Puntos() {
	   this.setSize(200,200);
	   this.setVisible(true);
   }
   
   public void paint (Graphics g) {
	   super.paint(g);
	   g.setColor(Color.RED);
	   g.drawLine(40, 50, 45, 68);
	   g.drawLine(42, 65, 40, 69);
   }
}
