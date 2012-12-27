package com.snimmo.ctrm.repository.test;

import org.junit.Test;

import com.snimmo.ctrm.repository.TradeJPA;

public class TestTradeEntityManager extends AbstractEntityManagerTest {

	@Test
	public void testInsert() {
		entityManager.persist(new TradeJPA());
	}

}
