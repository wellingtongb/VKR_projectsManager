package br.com.vkr.testes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import classes.Projetos;

public class TestaProjetos {

	public static void main(String[] args) {

		LocalDate diaInicio = LocalDate.parse("2017-01-18");
		LocalTime horaInicio = LocalTime.now();

		Projetos p = new Projetos(diaInicio, horaInicio);

		p.setDiasParaPrazo(7);

		System.out.println(p.DefinePrazo());

		System.out.println(p.DefineStatus());
		
		System.out.println(p.FormataData(diaInicio));
	}

}
