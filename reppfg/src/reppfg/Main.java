package reppfg;

import javax.swing.JFrame;

import reppfg.Solomon;

public class Main {

	   public static void main( String args[] )
	   {
		  //JFrame MiVentana = new JFrame("MI PRIMER VENTANA" );
		  //MiVentana.setVisible(true);
		  //MiVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //Solomon solo = new Solomon();
	      //solo.lectura(args[0]);
	      //representar aplicacion = new representar();
		  Puntos p = new Puntos();
		  p.set_solomon(args[0]);
		  p.set_solucion(args[1]);
		  //Solucion sl = new Solucion();
		  //sl.lectura(args[1]);
		  //sl.size();
	      //this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   }

}