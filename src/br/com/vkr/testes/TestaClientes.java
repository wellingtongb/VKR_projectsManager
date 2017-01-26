package br.com.vkr.testes;

import java.time.LocalDate;
import java.time.LocalTime;

import classes.Cliente;
import classes.Projetos;

public class TestaClientes {

	public static void main(String[] args) {


		Cliente  c = new Cliente("José Roberto");
		Projetos proj = new Projetos(LocalDate.now(), LocalTime.now());
		Projetos proj2 = new Projetos(LocalDate.now(), LocalTime.now());
		Projetos proj3 = new Projetos(LocalDate.now(), LocalTime.now());
		
		c.AdicionaProjetos(proj);
		c.AdicionaProjetos(proj2);
		c.AdicionaProjetos(proj3);
		
		System.out.println(c);

	}

}
