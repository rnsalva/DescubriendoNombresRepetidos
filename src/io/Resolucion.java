package io;

import java.util.LinkedList;

public class Resolucion {

	protected int cantGanadores;
	protected LinkedList<Nombre> ll = new LinkedList <>();
	
	public Nombre[] resolverRepetidos () {
		/* cant es una variable para atrapar el caso en el que la cantidad de distintos nombres 
		 * presentes en el archivo de entrada sea menor a la cantidad de ganadores pedidos
		 */
		int cant = this.cantGanadores <= this.ll.size() ? this.cantGanadores : this.ll.size();
		
		/* Creamos vector de nombres.*/
		Nombre[] names = new Nombre [cant];
		
		/* Ordenamos la lista usando el comparteTo de la clase Nombre.*/
		ll.sort(null);
		
		/* Recorremos la lista y pasamos al vector de nombres la cantidad de ganadores.*/
		int i = 0;
		while(i < cant)
			names[i] = new Nombre (ll.get(i).nombre,ll.get(i++).contador);
		
		/* Retornamos el vector de nombres.*/
		return names;
	}
	
}
