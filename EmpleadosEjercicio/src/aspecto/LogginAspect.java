package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect 
{
	@Before("execution (* entity.EmpleadoBean.*(..))")
		public void logMetodCall(JoinPoint joinPoint)
		{
			System.out.println("Ejecutando el metodo: " + joinPoint.getSignature().getName());
		}
	@After("execution (* entity.EmpleadoBean.*(..))")
	public void informo() 
	{
		System.out.println("El metodo finalizo");
	}
	
}

/* execution (public int calculadora.Calculadora.sumar(int, int)):
 * Cuando se ejecute el metodo sumar
 * execution (* paquete.Clase.metodoPublico()): apunta a cualquier metodo publico
 * en la clase "Clase que no tenga parametros y no especifica el tipo de retorno.
 * execution (public void com.ejemplo.clase.MetodoVoid()):
 * public 'metodoVoid()' en la clase 'Clase' que no tiene parametros
 * execution (public * com.ejemplo.clase.metodoQueDevuelveAlgo()):
 * Se refiere a cualquier metodo publico en la clase 'Clase' que devuelve algo.
 * execution(* com.ejemplo.clase.*()) apunta a cualquier metodo en la clase 'Clase' que no tenga parametros 
 * y no especifica el tipo de retorno
 * 
 * 
 * 
 * */
