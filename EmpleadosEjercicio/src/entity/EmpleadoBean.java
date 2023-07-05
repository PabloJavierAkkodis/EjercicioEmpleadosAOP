package entity;

import java.util.ArrayList;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class EmpleadoBean {
	
	static ArrayList<Empleado> empleados = new ArrayList<>();
	
	public int calcularAntiguedad (int i) {
		
		
		return LocalDate.now().getYear() - empleados.get(i).getFechaIncorporacion().getYear();
		
	}
	
	public double calcularSalarioNeto(int i){
		
		return empleados.get(i).getSalario() * 0.8;
	}
	
	public void guardarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void verEmpleados() {
		System.out.println(empleados.toString());
	}

	public void borrarEmpleado(int i) {
		empleados.remove(i);
	}
}
