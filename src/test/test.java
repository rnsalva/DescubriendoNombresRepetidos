package test;

import java.io.FileNotFoundException;

import io.Archivo;
import io.Nombre;
import io.Resolucion;

public class test {

	static String path = "C:\\Users\\richi\\Desktop\\";
	static String nomArchEntrada = "nombres.in";
	static String nomArchSalida = "nombres.out";
	
	public static void main(String[] args) throws FileNotFoundException {
		Resolucion res =  Archivo.leerArchyArmarLista(path + nomArchEntrada);
		Nombre [] nom = new Nombre [res.resolverRepetidos().length];
		nom = res.resolverRepetidos();
		Archivo.escribirArchivo(path + nomArchSalida, nom);
	}
}
