package classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Projetos {
	
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	
	private LocalTime horaInicio;
	private LocalTime horaTermino;
	
	private LocalDate prazoEntrega;
	
	private String status;
	
	private Boolean finalizado;

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
	
	//Definindo Status. Atrasado.
	
	//pensar em metodo para campo de estatus modificado, para modificar, finalizado, executivo
	
	


}
