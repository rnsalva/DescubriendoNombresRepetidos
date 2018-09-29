package io;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Resolucion {

	int cantGanadores;
	LinkedList<Nombre> ll = new LinkedList <>();
	
	public Nombre[] resolverRepetidos () {
		
		int c = this.cantGanadores <= this.ll.size() ? this.cantGanadores : this.ll.size();
		Nombre[] names = new Nombre [c];
		ll.sort(null);
		int i = 0;
		while(i < c) {
			names[i] = new Nombre (ll.get(i).nombre,ll.get(i++).contador);
			/*System.out.println(nuevo.nombre);
			names[i].nombre = ll.get(i).nombre;
			names[i].contador = ll.get(i++).contador;
			System.out.println(names[0].nombre);*/
		}
		return names;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\laboratorios\\Desktop\\";
		Resolucion res =  Archivo.leerArchivo(path);
		Nombre [] nom = new Nombre [res.resolverRepetidos().length];
		nom = res.resolverRepetidos();
		Archivo.escribirArchivo(path, nom);
	}
	
}
