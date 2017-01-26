package classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Projetos {

	private LocalDate dataInicio;
	private LocalDate dataTermino;

	private LocalTime horaInicio;
	private LocalTime horaTermino;

	private LocalDate prazoEntrega;

	private String status;

	//variaveis para controle na tabela com checkboxes
	private Boolean finalizado;
	private Boolean visivel;

	private int diasParaPrazo;

	public Projetos(LocalDate dataInicio, LocalTime horaInicio) {
		this.dataInicio = dataInicio;
		this.horaInicio = horaInicio;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraTermino() {
		return horaTermino;
	}

	public LocalDate getPrazoEntrega() {
		return this.dataInicio.plusDays(this.getDiasParaPrazo());
	}

	public String getStatus() {
		return status;
	}

	public int getDiasParaPrazo() {
		return diasParaPrazo;
	}

	public void setDiasParaPrazo(int diasParaPrazo) {
		this.diasParaPrazo = diasParaPrazo;
	}
	
	public String FormataData(LocalDate data){
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
				.withLocale(new Locale("pt", "br"));
		return data.format(fmt);
	}

	// pensar em metodo para campo de estatus modificado, para modificar, finalizado, executivo

	// funcionando, Retorno em string
	public String DefinePrazo() {
		LocalDate prazoEngrega = this.dataInicio.plusDays(this.getDiasParaPrazo());

		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
				.withLocale(new Locale("pt", "br"));
		return prazoEngrega.format(fmt);
	}

	// Definindo Status. Atrasado Funcionando (retorno em string).
	public String DefineStatus() {
		String status;

		LocalDate diaAtual = LocalDate.now();

		// Calculando a diferença entre os dias e comparando com os dias de
		// prazo
		if (ChronoUnit.DAYS.between(this.getDataInicio(), diaAtual) > this.getDiasParaPrazo()) {
			status = "Atrasado";
		} else {
			status = "Em dia";
		}
		return status;
	}
	
	//funcionando
	@Override
	public String toString() {		
		
		return "Inicio: "+FormataData(dataInicio) + " Prazo: "+
		FormataData(getPrazoEntrega()) + " Status: " + DefineStatus();
	}

}
