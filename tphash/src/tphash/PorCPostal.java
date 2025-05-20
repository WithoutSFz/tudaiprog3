package tphash;

import java.util.*;

public class PorCPostal implements Comparator<Cliente> {
	

	public PorCPostal() {
		
	}
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getC_postal(), o2.getC_postal());
	}
	

}
