package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.domains.Pessoa;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate");
		EntityManager em = emf.createEntityManager();

		Pessoa pessoa = em.find(Pessoa.class, 5L);

		if (pessoa != null) {
			System.out.println("\nNome: " + pessoa.getNome() + "\n" + "Idade: " + pessoa.getIdade());
		} else {
			System.out.println("Pessoa não encontrada.");
		}

	}

}
