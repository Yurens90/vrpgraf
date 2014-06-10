package reppfg;

import javax.swing.JFrame;

import reppfg.Solomon;

public class Main {

	   public static void main( String args[] )
	   {
		  Puntos p = new Puntos();
		  p.set_solomon(args[0]);
		  p.set_solucion(args[1]);
	   }

}