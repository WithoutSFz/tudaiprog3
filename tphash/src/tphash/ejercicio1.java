package tphash;

public class ejercicio1 {

	public static void main(String[] args) {
		/*Realizar la inserción de los mismos en una estructura
		de Hashing com la que se especifica en cada punto, con las siguientes técnicas de
		tratamiento de desbordes, muestre gráficamente cómo se va armando la estructura y cómo
		queda luego de insertar hasta el último elemento:
		a.- Hashing separado (con M=7 y rp=1, rs=1).
		b.- Hashing separado con crecimiento (con el comportamiento de HashTable de JAVA) (con
		M=7, ρd=0,9).*/

		HStruct mihash=new HStruct(1,1,7);
		int[] datos= {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61,
		                     50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92};
//A
		System.out.println("inciso A");
		for(int i:datos) {
			mihash.add(i);
			mihash.view();
		}
//B	
		System.out.println("inciso B");
		HStruct mihash2=new HCrecimiento(0.4,7);
		for(int i:datos) {
			mihash2.add(i);
			mihash2.view();
		}
		System.out.println(mihash.search(42));
		
	}

}
