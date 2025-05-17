package tphash;
import java.util.ArrayList;

public class HBalde {
	private int[] balde;
	private boolean[]espacio;
	private int rp;
	private int rs;
	private HBalde sig;
	private int cantelem=0;
	
	public HBalde(int rp, int rs) {
		this.sig=null;
		this.rp=rp;
		this.rs=rs;
		this.balde=new int[rp];
		this.espacio=new boolean[rp];
		for(int i=0;i<rp;i++) 
			this.espacio[i]=true;

	}
	public int allUsed() {// retonra -1 si esta todo el balde en uso y si no es el caso da la psosicion del proximo disponible
		for(int i =0;i<this.espacio.length;i++) {
			if(this.espacio[i]) {
				return i;
			}
		}	
		return -1;
	}
	public void add(int elem) {
		int balde_disponible=allUsed();
		if(balde_disponible==-1) {
			if(this.sig==null)
				this.sig= new HBalde(this.rs,this.rs);
			this.sig.add(elem);
			
		}else {
					this.balde[balde_disponible]=elem;
					this.espacio[balde_disponible]=false;
					this.cantelem++;
				}
		}
	public ArrayList<Integer>returnList() {
		ArrayList<Integer> respuesta=new ArrayList<Integer>();
		int espacio = allUsed();
		if(espacio==-1)
			if(this.sig==null)
				for(int aux:this.balde) 
					respuesta.add(aux);
			else {
				for(int aux:this.balde) 
					respuesta.add(aux);
				for(int aux:this.sig.returnList())
					respuesta.add(aux);
			}
		else
			for(int i=0;i<espacio;i++) {
				respuesta.add(this.balde[i]);
				
			}
		return respuesta;
	} 
	public int search(int elem) {
		int espacio=allUsed();
			if(espacio==0)//el primer lugar del balde esta disponible, por lo que no vamos a encontrar el elemento
				return 0;//devolvemos 0 o el "valor nulo" respectivo al tipo de dato que almacenamos
			else {
				int tope;
				if(espacio==-1)
					tope =this.rp-1;
				else
					tope=espacio;
				for(int i =0;i<=tope;i++)
					if(this.balde[i]==elem)
						return this.balde[i];
			}
			if(this.sig==null)
				return 0;
			return this.sig.search(elem);
			
		
	}
	public int moveData(int index) {
		int espacio=allUsed();
		if(espacio!=index+1&&espacio!=-1) {
			int f_moved=this.balde[index+1];
			for(int i=index;i<espacio;i++) {
				if(i!=espacio-1)
					this.balde[i]=this.balde[i+1];
				else
					this.espacio[i]=true;
			}
			return f_moved;

		}
		else {
			if(espacio==-1) {
				int f_moved=this.balde[index+1];
				for(int i=index;i<this.rp;i++) {
					
					if(i!=this.rp-1)
						this.balde[i]=this.balde[i+1];
					else
						if(i==rp-1&&this.sig==null)
							this.espacio[i]=true;
							
					if(i==this.rp-1&&this.sig!=null)
						this.balde[i]=moveData(this.sig.allUsed());
				}
				return f_moved;
				
			}
		}
		return 0;
		
	}
	public int delete(int elem) {
		int espacio=allUsed();
			if(espacio==0)//el primer lugar del balde esta disponible, por lo que no vamos a encontrar el elemento
				return 0;//devolvemos 0 o el "valor nulo" respectivo al tipo de dato que almacenamos
			else {
				int tope;
				if(espacio==-1)
					tope =this.rp-1;
				else
					tope=espacio;
				for(int i =0;i<=tope;i++)
					if(this.balde[i]==elem) {
						int deleted= this.balde[i];
						moveData(i);
						return deleted;
						
					}
			}
			if(this.sig==null)
				return 0;
			return this.sig.search(elem);//el ide me molestaba si no lo ponia pero no deberia llegar nunca a esta instancia
			
		
	}
	public void view() {
	    System.out.print("[");
	    int index =allUsed();
	    if(index==-1)
	    	index =this.rp;
	    for (int i = 0; i < index; i++) {
	        System.out.print(balde[i]);
	        if (i < balde.length - 1) 
	        	System.out.print(", ");       	
	    }
	    if(index==0)
	    	System.out.print("vacio");
	    System.out.print("]");

	    if (sig != null) {
	        System.out.print(" -> ");
	        sig.view();
	    } else {
	        System.out.println();  
	    }
	}


}
