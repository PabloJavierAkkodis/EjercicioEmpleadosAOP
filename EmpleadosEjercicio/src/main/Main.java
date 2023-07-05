package main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import configuracion.Configuracion;
import entity.Empleado;
import entity.EmpleadoBean;

public class Main 
{
	
	static EmpleadoBean empleadoBean ;
	
	
	public static void main (String [] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Configuracion.class);
		context.scan("entity", "aspecto");
		context.refresh();
		
		empleadoBean = context.getBean(EmpleadoBean.class);
		
		
		
		init();
		
		context.close();
	}
	private static void init() {
		
		empleadoBean.guardarEmpleado(new Empleado(1, "Pablo", "Jaimez", "12341234R", "DEV", 14000.0, LocalDate.now()));
		empleadoBean.guardarEmpleado(new Empleado(2, "Gus", "Tavo", "1234234R", "DEV", 200000.0, LocalDate.now()));
		empleadoBean.guardarEmpleado(new Empleado(3, "Pablo", "Jaimez", "12341234R", "DEV", 14000.0, LocalDate.now()));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int select;
			System.out.println("Registros obtenidos de la base de datos:");
			System.out.println("   ---------------------------------------------------  ");
			empleadoBean.verEmpleados();
			System.out.println("   ---------------------------------------------------  ");
			System.out.println("¿Desea editar algun registro? ");
			System.out.println("1	 - Añadir");
			System.out.println("2	 - Borrar");
			System.out.println("3	 - Ver antiguedad");
			System.out.println("4	 - Ver salario neto");

			System.out.println("Otro - Cancelar");
			
			
			
			try {				
				select = sc.nextInt();
			}catch (Exception e){

		 		break;
		 	}
			
			switch (select) {
						
				case 1:
					System.out.println("Ingrese parámetros");

					System.out.println("Ingrese numero de empleado: ");
					int num = sc.nextInt();
					
					System.out.println("Ingrese nombre de empleado: ");
					String nom= sc.next();
					
					System.out.println("Ingrese apellido de empleado: ");
					String ape= sc.next();
					

					System.out.println("Ingrese dni de empleado: ");
					String dni = sc.next();

					System.out.println("Ingrese puesto de empleado: ");
					String puesto = sc.next();
					
					System.out.println("Ingrese salario de empleado: ");
					Double salario = sc.nextDouble();
					
					
					empleadoBean.guardarEmpleado(new Empleado(num, nom, ape, dni, puesto, salario, LocalDate.now()));
					break;
						
				case 2:
					System.out.println("Ingrese numero de empleado: ");
					select = sc.nextInt() - 1;
					empleadoBean.borrarEmpleado(select);
					break;
					
				case 3:
					System.out.println("Ingrese numero de empleado: ");
					select = sc.nextInt() - 1;
					System.out.println("ANTIGUEDAD: " +empleadoBean.calcularAntiguedad(select));
					
					break;	
						
				case 4:
					System.out.println("Ingrese numero de empleado: ");
					select = sc.nextInt() - 1;
					System.out.println("SALARIO NETO: " + empleadoBean.calcularSalarioNeto(select));
					break;
			}
		}
	
	
	}
}