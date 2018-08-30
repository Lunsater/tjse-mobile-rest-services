package br.jus.tjse.persistence;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProducerEntityManager {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("tjse-unit-default-api");
	private static EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		if (entityManager == null) 
			entityManager = factory.createEntityManager(); 

		return entityManager;
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
