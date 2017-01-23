package classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Projetos {
	
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	
	private LocalTime horaInicio;
	private LocalTime horaTermino;
	
	private LocalDate prazoEntrega;
	
	private String status;
	
	private Boolean finalizado;
	
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
		return prazoEntrega;
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
	
	
	//Definindo Status. Atrasado.
	
	//pensar em metodo para campo de estatus modificado, para modificar, finalizado, executivo
	

	//funcionando, Retorno em string 
	//estudar http://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/
	public String DefinePrazo(){		
		LocalDate prazoEngrega = this.dataInicio.plusDays(this.getDiasParaPrazo());
		
		DateTimeFormatter  fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		String dataFormatada = fmt.format(prazoEngrega);
		
		return dataFormatada;
	}
	


}
