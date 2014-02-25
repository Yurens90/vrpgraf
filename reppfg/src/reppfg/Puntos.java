package reppfg;
import java.awt.geom.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.*;
public class Puntos extends Frame {
public Solomon sol;
public Solucion sl;
   public Puntos() {
	   this.setSize(500,500);
	   this.setVisible(true);
   }
   
   public void set_solomon(String nom) {
	  sol = new Solomon();
	  sol.lectura(nom);
   }
   
   public void set_solucion(String nom) {
	   sl = new Solucion();
	   sl.lectura(nom);
   }
   public void paint (Graphics g) {
	   super.paint(g);
	   //String col = "Color.BLUE";
	   Color[] colores = {Color.RED,Color.BLACK,Color.BLUE,Color.GREEN,Color.MAGENTA,Color.ORANGE,Color.RED,Color.YELLOW,Color.PINK,Color.LIGHT_GRAY,Color.CYAN};

	   //g.setColor(colores[1]);
	   /*
	   for (int i = 1; i < sol.size();i++) {
	      int x1, y1;
	      x1 = sol.getix(i);
	      y1 = sol.getiy(i);
	      int x2, y2;
	      x2 = sol.getix(i-1);
	      y2 = sol.getiy(i-1);
	      BasicStroke stroke = new BasicStroke(2.0f);
	      Graphics2D g2d = (Graphics2D) g;
	      g2d.setStroke(stroke);
	      
	      g2d.drawLine(x1*5,y1*5,x2*5,y2*5);
	   } */
	   String cadena = sl.getsolucion();
	   //char arr [] = sl.getsolucion().toCharArray();
	   String arr [] = cadena.split(" ");
	   
	   //g.translate(250,250);
	   g.translate(100,700);
	   int j = 0;
	   g.setColor(colores[j]);
	   for (int i = 1; i < arr.length; i++) {
	      int x1, y1;
	      x1 = sol.getix(Integer.parseInt(arr[i]));
	      y1 = sol.getiy(Integer.parseInt(arr[i]));
	      int x2, y2;
	      x2 = sol.getix(Integer.parseInt(arr[i-1]));
	      y2 = sol.getiy(Integer.parseInt(arr[i-1]));
	      BasicStroke stroke = new BasicStroke(2.0f);
	      Graphics2D g2d = (Graphics2D) g;
	      g2d.setStroke(stroke);
	      //g2d.drawLine(x1*5,y1*5,x2*5,y2*5);
	      //y1 = y1 * -1;
	      //y2 = y2 * -1;
	      System.out.println("Punto -1: "+arr[i-1]+ ", punto i: "+arr[i]+", x1: "+x2+", x2: "+x1+", y1: "+y2+", y2: "+y1);
	      g2d.drawLine(x2*7,y2*-7,x1*7,y1*-7);
	      if ((Integer.parseInt(arr[i-1]) == 0) && (Integer.parseInt(arr[i]) == 0)) {
	    	  j++;
	    	  System.out.println("Color: "+j);
	    	  if (j > colores.length)
	    	     j = 0;
	    	  g2d.setColor(colores[j]);
	      }
	      //g2d.drawLine(x1,y1,x2,y2);
	      
	   } 	   
	   //el eje de coordenadas funciona al reves para el eje Y
	   //g.translate(250,250);
	   //g.drawLine(0,0,50,-50);
	   //.drawLine(40 *5,-50 *5,30 *5,-52 *5);
	   //g.drawLine(0,0,-50,-50);
	   //g.drawLine(0,0,50,50);
	   //g.drawLine(0,0,-50,50);
	   //g.drawLine(0,0,0,-50);
	   
	   //g.drawLine(40, 50, 45, 68);
	   //g.drawLine(42, 65, 40, 69);
   }
}
