package io;

public class Nombre implements Comparable<Nombre>{

	String nombre;
	int contador;	
	
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

	/*public static void resolverRepetidos (String path) throws FileNotFoundException {
		
		String mipath = "nombres.in";
		FileReader fr = new FileReader(path + mipath);
		Scanner sc = new Scanner(fr);
		
		int i=0, lineas = sc.nextInt(), cantGanadores = sc.nextInt();
		LinkedList<Nombre> ll = new LinkedList <>();
		sc.nextLine();
		
		while (i < lineas){
			Nombre name = new Nombre (sc.nextLine());
			if(ll.contains(name)) {
				Nombre encontrado = ll.get(ll.indexOf(name));
				encontrado.contador++;
				ll.set(ll.indexOf(name), encontrado);
			}
			else
				ll.add(name);
			i++;
		}
		ll.sort(null);
		//hm.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		ll.forEach((k) -> System.out.println("Key: " + k.nombre + ": Value: " + k.contador));
		sc.close();

		mipath = "nombres.out";
		PrintWriter ptr = new PrintWriter(path + mipath);
		i = 0;
		while(i < ll.size() && i < cantGanadores )
			ptr.println(ll.get(i).nombre + " " + ll.get(i++).contador);
		
		ptr.close();
		
	}*/
	
	
	@Override
	public int compareTo(Nombre otro) {
		return otro.contador - this.contador;
	}

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
