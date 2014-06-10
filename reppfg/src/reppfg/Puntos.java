package reppfg;
import java.awt.geom.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.*;
import java.awt.event.*;
public class Puntos extends Frame implements KeyListener {
public Solomon sol;
public Solucion sl;
public int x = 100;
public int y = 700;
public int escala = 7;
   public Puntos() {
	   this.setSize(500,500);
	   this.setVisible(true);
	   addKeyListener( this );
   }
   
   public void set_solomon(String nom) {
	  sol = new Solomon();
	  sol.lectura(nom);
   }
   
   public void set_solucion(String nom) {
	   sl = new Solucion();
	   sl.lectura(nom);
   }
   
   // manejar evento de pulsación de cualquier tecla
   public void keyPressed( KeyEvent evento )
   {
	  //System.out.println("Se ha pulsado la tecla: "+evento.getKeyText(evento.getKeyCode()));
	  System.out.println("Se ha pulsado la tecla: "+evento.getKeyCode());
	  if (evento.getKeyCode() == 38)
         y = y-10;
	  if (evento.getKeyCode() == 40)
         y = y+10;
	  if (evento.getKeyCode() == 39)
	     x = x+10;
	  if (evento.getKeyCode() == 37)
	     x = x-10;
	  if (evento.getKeyCode() == 107) { //mas
	     escala += 1;
	     x = x-50;
	     y = y+70;
	  }
	  if (evento.getKeyCode() == 109) { //menos
         escala -= 1;
         x = x+50;
         y = y-70;
	  }
      //linea1 = "Se oprimió tecla: " + evento.getKeyText( evento.getKeyCode() );
      //establecerLineas2y3( evento );
	  repaint();
   }

   // manejar evento de liberación de cualquier tecla
   public void keyReleased( KeyEvent evento )
   {
      //linea1 = "Se soltó tecla: " + evento.getKeyText( evento.getKeyCode() );
      //establecerLineas2y3( evento );
   }

   // manejar evento de pulsación de una tecla de acción
   public void keyTyped( KeyEvent evento )
   {
      //linea1 = "Se escribió tecla: " + evento.getKeyChar();
      //establecerLineas2y3( evento );
   }
   public void paint (Graphics g) {
	   super.paint(g);
	   //String col = "Color.BLUE";
       System.out.println("hola");
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
	   g.translate(x,y);
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
	      g2d.drawLine(x2*escala,y2*escala*-1,x1*escala,y1*escala*-1);
	      if ((Integer.parseInt(arr[i-1]) == 0) && (Integer.parseInt(arr[i]) == 0)) {
	    	  j++;
	    	  System.out.println("Color: "+j);
	    	  if (j > colores.length)
	    	     j = 0;
	    	  g2d.setColor(colores[j]);
	      }
	      
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
