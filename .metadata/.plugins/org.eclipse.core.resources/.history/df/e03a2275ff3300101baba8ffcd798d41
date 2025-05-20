package tphash;

public class HCrecimiento extends HStruct {
	private double pd;
	
	HCrecimiento(double pd, int mod){
		super(1,1,mod);
		this.pd=pd;
	}
	public int limite() {
		double aux = this.pd *this.mod*1.0;
		aux= Math.floor(aux);
		return (int)aux;
		
	}
	public void reHashing() {
		this.mod=1+(this.mod*2);
		 HBalde[] nw= new HBalde[this.mod];
			for(int i=0;i<mod;i++)
				nw[i]=new HBalde(1,1);
		 for(HBalde aux :this.main) {
			 for(int aux2:aux.returnList())	
			 	nw[aux2%this.mod].add(aux2);	 
		 }
		 this.main=nw;
		 
		
	}
	public void add(int elem) {
		super.add(elem);
		if(this.cantDatos()>=this.limite())
			reHashing();
	}

}
