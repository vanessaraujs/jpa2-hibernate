package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.domains.Pessoa;

public class Create {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Jorge", 66);

		// Cria uma conexão com o banco
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate");

		// Gerencia as transações
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();

		System.out.println(pessoa.getNome() + ", cadastro realizado com sucesso!");

		em.close();
		emf.close();
	}
}
