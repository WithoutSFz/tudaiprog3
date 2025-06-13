package tpgrafos;

public class GND<T> extends Grafo<T> {

	public GND(T n1, T n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addA(T n1, T n2) {
		Vertice<T> vertice1 =new Vertice<T>(n1);	
		Vertice<T> vertice2 =new Vertice<T>(n2);
		
		Vertice<T> v1 = this.migrafo.search(vertice1);
		Vertice<T> v2 = this.migrafo.search(vertice2);
		if(v1==null) {
			
			
			if(v2==null) {
				vertice2.addArista(vertice1);
				vertice1.addArista(vertice2);
				this.migrafo.add(vertice2);

			}
			else { 
				v2.addArista(vertice1);
				vertice1.addArista(v2);
			}
			
			this.migrafo.add(vertice1);	
			
		}
		else {
			if(v2==null) {
				vertice2.addArista(vertice1);
				v1.addArista(vertice2);
				this.migrafo.add(vertice2);

			}
			else { 
				if(!v1.conexion(v2)) {
					v2.addArista(v1);
					v1.addArista(v2);
				}
			}
			
			
		}
	
		
	}

	@Override
	public int grado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
