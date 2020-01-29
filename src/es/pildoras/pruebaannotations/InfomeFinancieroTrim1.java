package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InfomeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "prsentacion de informe fincaciero del trimestre 1";
	}

}
