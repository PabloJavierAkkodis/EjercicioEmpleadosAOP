package entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;


public class Empleado {

	long id;
	String nombre;
	String apellido;
	String dni;
	String puesto;
	double salario;
	LocalDate fechaIncorporacion;
	
	
	
	public Empleado() {
		super();
	}
	public Empleado(long id, String nombre, String apellido, String dni, String puesto, double salario,
			LocalDate fechaIncorporacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.puesto = puesto;
		this.salario = salario;
		this.fechaIncorporacion = fechaIncorporacion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", puesto="
				+ puesto + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion + "] \n";
	}
	
	
}
