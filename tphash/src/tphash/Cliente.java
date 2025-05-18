package tphash;

import java.time.LocalDate;

public class Cliente {
	private int dni;
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	private String domicilio;
	private int c_postal;
	private String c_origen;
	private double saldo;
	private String carera;

	public Cliente(int dni, String nombre, String apellido, LocalDate nacimiento, String domicilio, int c_postal,
			String c_origen, double saldo, String carera) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.domicilio = domicilio;
		this.c_postal = c_postal;
		this.c_origen = c_origen;
		this.saldo = saldo;
		this.carera = carera;
	}
}
