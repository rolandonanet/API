package br.gabriel_lucas.assti_aula06_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaPorIdComGetReference {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.getReference(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}

}
