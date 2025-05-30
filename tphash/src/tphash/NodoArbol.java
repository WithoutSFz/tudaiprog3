package tphash;

import java.util.ArrayList;
import java.util.Comparator;

public class NodoArbol<T extends Comparable<T>> {
	private T elem;
	public NodoArbol<T> menores;
	public NodoArbol<T> mayores;
	
	public NodoArbol(T elem) {
		super();
		this.elem = elem;
		this.menores = null;
		this.mayores = null;
	}
	public T getElem() {
		return elem;
	}
	public void add(T elem) {
		if(this.elem.compareTo(elem)>=0) {
			if(this.menores==null)
				this.menores=new NodoArbol<T>(elem);
			else
				this.menores.add(elem);
		}
		else
			if(this.mayores==null)
				this.mayores=new NodoArbol<T>(elem);
			else
				this.mayores.add(elem);
				
		}
	public void printInOrder() {
	    if (this.menores != null)
	        this.menores.printInOrder();
	    System.out.println(this.elem);
	    if (this.mayores != null)
	        this.mayores.printInOrder();
	}

			
	public ArrayList<T> menoresQue(T elem){
		ArrayList<T> resultado=new ArrayList<T>();
		if(this.elem.compareTo(elem)<0) {
			resultado.add(this.elem);	
			if(this.menores!=null)
				resultado.addAll(this.menores.menoresQue(elem));
			if(this.mayores!=null)
				resultado.addAll(this.mayores.menoresQue(elem));
		}
		else
			if(this.menores!=null)
				resultado.addAll(this.menores.menoresQue(elem));

		return resultado;
		
	}
	public ArrayList<T> igualesComparador(Comparator<T> p,T ejemplo){
		ArrayList<T> resultado=new ArrayList<T>();
		
		if(p.compare(this.elem, ejemplo)==0) 
			resultado.add(elem);
		if(this.mayores!=null)
			resultado.addAll(this.mayores.igualesComparador(p,ejemplo));
		if(this.menores!=null)	
			resultado.addAll(this.menores.igualesComparador(p,ejemplo));
		return resultado;
		
	}
}
