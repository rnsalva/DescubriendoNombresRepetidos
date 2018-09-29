package io;

public class Nombre implements Comparable<Nombre>{

	protected String nombre;
	protected int contador;	
	
	public Nombre(String nombre, int cont) {
		this.nombre = nombre;
		this.contador = cont;
	}
	
	public Nombre(String nombre) {
		this.nombre = nombre;
		this.contador = 1;
	}

	public Nombre() {
		this.nombre = "";
		this.contador = 1;
	}
	
	@Override
	public int compareTo(Nombre otro) {
		return otro.contador - this.contador;
	}

	/* El metodo equals fue implementado de manera que solo se compare el nombre del objeto con
	 * el del otro.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nombre other = (Nombre) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
}
