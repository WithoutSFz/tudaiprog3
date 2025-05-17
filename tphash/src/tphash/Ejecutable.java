package tphash;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCrecimiento mihash=new HCrecimiento(0.7,7);
		int[] datos= {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61,
		                     50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92};
		for(int i:datos) {
			mihash.add(i);
			mihash.view();
			System.out.print("se agrego: "+i);
			System.out.println();
			System.out.println();
		}
		System.out.print(mihash.cantDatos());
		// los datos existen pero la funcion view de HBalde nos los muestra si las ranuras por baldes son menores a 5 AVERIGUAR
		//for(int i :datos)
		//	System.out.println(mihash.search(i)==i);
			
	}

}