package br.gabriel_lucas.assti_aula06_jpa_hibernate;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main (String[] args) {
		Persistence.createEntityManagerFactory("asstiPU");
	}

}
