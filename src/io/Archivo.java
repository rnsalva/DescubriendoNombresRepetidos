package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public static Resolucion leerArchyArmarLista (String path) throws FileNotFoundException {
		
		/* Esta funcion ademas de leer del archivo arma la lista. Por cuestiones de optimizacion,
		 * se prefiere armar la lista a medida que vamos leyendo del archivo y no tener que armarla
		 * despues ya que seria mas complejo.
		 */

		FileReader fr = new FileReader(path);
		Scanner sc = new Scanner(fr);
		
		/* Creamos un objeto de tipo Resolucion.*/
		Resolucion res = new Resolucion ();
		
		int i = 0;
		int lineas = sc.nextInt();
		res.cantGanadores = sc.nextInt();
		sc.nextLine();
		
		/*El siguiente ciclo lee del archivo y pregunta si se encuentra en la lista. En caso
		 * afirmativo, se incrementa el contador del nodo correspondiente. En caso contrario se
		 * lo agrega.
		 */
		while (i < lineas){
			Nombre name = new Nombre (sc.nextLine());
			if(res.ll.contains(name)) {
				Nombre encontrado = res.ll.get(res.ll.indexOf(name));
				encontrado.contador++;
				res.ll.set(res.ll.indexOf(name), encontrado);
			}
			else
				res.ll.add(name);
			i++;
		}
		sc.close();
		return res;
	}
	
	
	public static void escribirArchivo (String path, Nombre[] names) throws FileNotFoundException {
		
		PrintWriter ptr = new PrintWriter(path);
		for (Nombre c : names)
			ptr.println(c.nombre + " " + c.contador);
		ptr.close();
	}
	
}
