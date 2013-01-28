package org.ctrm.server.manager;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.IdGenerator;
import com.snimmo.ctrm.object.trade.Trade;

@Service
public class TradeManagerImpl implements TradeManager {
	
	@Autowired
	HazelcastInstance hazelcastInstance;
	
	IdGenerator tradeIdGenerator;
	IMap<Long, Trade> tradeMap;
	
	public Trade save(Trade trade){
		if (trade.getUid() == null){
			trade.setUid(tradeIdGenerator.newId());
		}
		tradeMap.put(trade.getUid(), trade);
		return trade;
	}
	
	@PostConstruct
	public void postConstruct(){
		tradeMap = hazelcastInstance.getMap(Trade.class.getSimpleName());
		tradeIdGenerator = hazelcastInstance.getIdGenerator(Trade.class.getSimpleName());
	}

}
