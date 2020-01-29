package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnntotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cuatro pasos
		//1° leer el XML de configuracion o cargar
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//2°pedir un bean al contenedor
		
		Empleados Antonio = contexto.getBean("comercialExperimentado",Empleados.class);
		//3°usar el Bean
		
		System.out.println(Antonio.getInformes());
		System.out.println(Antonio.getTareas());
		//cerrar el contexto
		contexto.close();
	}

}
