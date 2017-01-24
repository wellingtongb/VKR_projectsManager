package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Orçamento {

	private LocalDate inicio;
	private LocalDate termino;
	
	private String status;
	
	private int diasDePrazo = 3;

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getTermino() {
		return termino;
	}
	
	public int getDiasDePrazo() {
		return this.diasDePrazo;
	}
	
	public String DefineStatus() {
		String status;
		LocalDate diaAtual = LocalDate.now();

		// Calculando a diferença entre os dias e comparando com os dias de prazo
		if (ChronoUnit.DAYS.between(this.getInicio(), diaAtual) > this.getDiasDePrazo()) {
			status = "Atrasado";
		} else {
			status = "Em dia";
		}
		return status;
	}
}
