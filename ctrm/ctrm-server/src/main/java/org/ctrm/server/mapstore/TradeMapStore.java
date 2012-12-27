package org.ctrm.server.mapstore;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.hazelcast.core.MapStore;
import com.snimmo.ctrm.object.Trade;

public class TradeMapStore implements MapStore<Integer, Trade> {

	@Override
	public Trade load(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Trade> loadAll(Collection<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Integer> loadAllKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Collection<Integer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void store(Integer arg0, Trade arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeAll(Map<Integer, Trade> arg0) {
		// TODO Auto-generated method stub
		
	}

}
