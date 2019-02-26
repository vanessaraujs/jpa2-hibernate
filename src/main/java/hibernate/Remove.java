package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.domains.Pessoa;

public class Remove {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = em.find(Pessoa.class, 1L);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
		
		System.out.println("Pessoa removida com sucesso");
	}
}
