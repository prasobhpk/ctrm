package com.snimmo.ctrm.repository.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractEntityManagerTest {
	
	private static final String TEST_UNIT_NAME = "ctrmPersistence";
	protected static EntityManagerFactory entityManagerFactory;
	protected static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
	
	@BeforeClass
	public static void prepareEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory(TEST_UNIT_NAME);
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Before
	public void createTransaction() {
		entityManager.getTransaction().begin();
	}

	@After
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
	}

	@AfterClass
	public static void releaseEntityManager() {
		if (entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().rollback();
		}

		if (entityManager.isOpen()) {
			entityManager.close();
		}
		entityManagerFactory.close();
	}

}
