package com.snimmo.ctrm.object.trade;

import java.io.Serializable;
import java.math.BigDecimal;

public interface Trade extends Serializable {
	
	Long getUid();
	void setUid(Long uid);
	String getTradeId();
	
	BigDecimal getNotionalQuantity();
	BigDecimal getNotionalAmount();
	

}
