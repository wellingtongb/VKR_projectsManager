package br.com.vkr.testes;

import java.time.LocalDate;
import java.time.LocalTime;

import classes.Projetos;

public class TestaProjetos {

	public static void main(String[] args) {

		LocalDate diaInicio = LocalDate.now();
		LocalTime horaInicio = LocalTime.now();
		
		Projetos p = new Projetos(diaInicio, horaInicio);
		
		p.setDiasParaPrazo(7);
		
		System.out.println(p.DefinePrazo());

	}

}
