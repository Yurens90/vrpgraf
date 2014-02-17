package reppfg;
import java.io.*;
import java.util.ArrayList;
public class Solomon {
   public String nombre;
   public ArrayList<int []> coord;
   public int getix(int i, int x) {
      return coord.get(i)[1];
   }
   public int getiy(int i, int y) {
      return coord.get(i)[2];
   }
   public int getid(int i, int id) {
      return coord.get(i)[0];
   }
   public void lectura (String nombre) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      coord = new ArrayList<int []>();
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (nombre);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	 
	         // Lectura del fichero
	         String linea;
	         nombre = br.readLine();
	         for (int i = 0; i < 8;i++) {
	        	 linea = br.readLine();
	        	 //System.out.println(linea);
	        	 //System.out.println("return");
	         }
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	            String [] numeros = linea.split("\\s+");
	            int aux[] = new int [3];
	            aux[0] = Integer.parseInt(numeros[1]);
	            aux[1] = Integer.parseInt(numeros[2]);
	            aux[2] = Integer.parseInt(numeros[3]);
	            coord.add(aux);
	            //System.out.println(numeros.length);
	            //System.out.println(numeros[1]+"--"+numeros[2]+"--"+numeros[3]);
	            //System.out.println("return");
	         }
	         //for (int i = 0; i < coord.size();i++) {
	         //   System.out.println(coord.get(i)[0]+"--"+coord.get(i)[1]+"--"+coord.get(i)[2]);
	         //}
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta
	         // una excepcion.
	         try{                   
	            if( null != fr ){  
	               fr.close();    
	            }                 
	         }catch (Exception e2){
	            e2.printStackTrace();
	         }
	      }
	   }
}
