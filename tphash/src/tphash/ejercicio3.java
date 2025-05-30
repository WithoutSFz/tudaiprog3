package tphash;

import java.time.LocalDate;

public class ejercicio3 {

	public static void main(String[] args) {
		Cliente c1= new Cliente(123456,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",0.0,"TUDAI"); 
		Cliente c2= new Cliente(234561,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",29999.0,"TUDAI"); 
		Cliente c3= new Cliente(345612,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",30900.0,"TUDAI"); 
		Cliente c4= new Cliente(456123,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",20555.0,"TUDAI"); 
		Cliente c5= new Cliente(561234,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",17000.0,"TUDAI"); 
		Cliente c6= new Cliente(612345,"Marco","Fernandez",LocalDate.now(),"calle falsa",7000,"olavarria",9000.0,"TUDAI"); 
		HCrecimiento<Cliente> mihash = new HCrecimiento<Cliente>(0.9,7);
		mihash.add(c1);
		mihash.add(c2);
		mihash.add(c3);
		mihash.add(c4);
		mihash.add(c5);
		mihash.add(c6);
		
		NodoArbol<Cliente> raiz = new NodoArbol<Cliente>(c4);
		raiz.add(c1);
		raiz.add(c2);
		raiz.add(c3);
		raiz.add(c5);
		raiz.add(c6);
		mihash.view();
		//inciso 1
		System.out.println("inciso 1");
		Cliente prefab= new Cliente(612345,"","",LocalDate.now(),"",0,"",0.0,""); 
		 prefab = mihash.search(prefab);

		System.out.print(prefab);
		// inciso 2
		System.out.println("\ninciso 2");
		prefab= new Cliente(612345,"","",LocalDate.now(),"",0,"",0.0,""); 
		prefab.setSaldo(17000.0);
		for(Cliente aux:raiz.menoresQue(prefab))  
			System.out.print(aux);

		//inciso 3
		System.out.println("\ninciso 3");
		prefab= new Cliente(612345,"","",LocalDate.now(),"",0,"",0.0,""); 
		prefab.setC_postal(7000);
		PorCPostal compa_c_postal=new PorCPostal();
		for(Cliente aux: raiz.igualesComparador(compa_c_postal, prefab))
			System.out.print(aux);

	}

}
