package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public static Resolucion leerArchivo (String path) throws FileNotFoundException {
		String mipath = "nombres.in";
		FileReader fr = new FileReader(path + mipath);
		Scanner sc = new Scanner(fr);
		
		Resolucion res = new Resolucion ();
		
		int i = 0;
		int lineas = sc.nextInt();
		
		res.cantGanadores = sc.nextInt();
		
		sc.nextLine();
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
		
		String mipath = "nombres.out";
		PrintWriter ptr = new PrintWriter(path + mipath);
		for (Nombre c : names)
			ptr.println(c.nombre + " " + c.contador);
		ptr.close();
	}
	
}
