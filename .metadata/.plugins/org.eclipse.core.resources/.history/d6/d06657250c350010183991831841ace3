package tphash;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente> {
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getC_postal() {
		return c_postal;
	}

	public void setC_postal(int c_postal) {
		this.c_postal = c_postal;
	}

	public String getC_origen() {
		return c_origen;
	}

	public void setC_origen(String c_origen) {
		this.c_origen = c_origen;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCarera() {
		return carera;
	}

	public void setCarera(String carera) {
		this.carera = carera;
	}
	public int hashCode() {
		return dni;
		
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return Double.compare(this.saldo, o.getSaldo());
	}
}
