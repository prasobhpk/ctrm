package org.ctrm.server;

import org.ctrm.server.manager.TradeManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.snimmo.ctrm.object.trade.Futures;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-ctrm-server.xml" })
public class TestTradeManager {
	
	@Autowired
	TradeManager tradeManager;

    @Test
    @Timed(millis=50)
	public void testSaveFutures() {
    	Futures futures = new Futures();
        tradeManager.save(futures);
    }
}
