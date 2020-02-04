package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	
	@Autowired
	@Qualifier("informeFinancieroTrim2")//bean id que debe utilizar
	private CreacionInformeFinanciero creacionInforme;
	
	
	public  ComercialExperimentado() {}
	
//	 @Autowired
//	 public ComercialExperimentado( CreacionInformeFinanciero creacionInforme) {
//		// TODO Auto-generated constructor stub
//		this.creacionInforme = creacionInforme;
//	}
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender más!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return creacionInforme.getInformeFinanciero();
	}
	
	

//
//	@Autowired
//	public void setCreacionInforme(CreacionInformeFinanciero creacionInforme) {
//		this.creacionInforme = creacionInforme;
//	}

	
	
}
