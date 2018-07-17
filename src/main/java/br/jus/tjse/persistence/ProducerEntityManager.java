package br.jus.tjse.persistence;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProducerEntityManager {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("tjse-unit-default-api");
	
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public void close(EntityManager entityManager) {
		if (entityManager.isOpen())
			entityManager.close();
	}
	
	@PreDestroy
	public void preDestroy() {
		if (factory.isOpen())
			factory.close();
	}

}
