package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender más!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe generado por el comercial";
	}

}
