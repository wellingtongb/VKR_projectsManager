package br.com.vkr.testes;

import java.time.LocalDate;
import java.time.LocalTime;

import classes.Cliente;
import classes.Projetos;

public class TestaClientes {

	public static void main(String[] args) {


		Cliente  c = new Cliente("José Roberto");
		Projetos proj = new Projetos(LocalDate.now(), LocalTime.now());
		c.AdicionaProjetos(proj);
		
		System.out.println(c);

	}

}
