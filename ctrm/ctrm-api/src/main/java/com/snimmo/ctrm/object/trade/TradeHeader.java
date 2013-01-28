package com.snimmo.ctrm.object.trade;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class TradeHeader {
	
	private Long uid;
	private String tradeId;
	private TradeType tradeType;
	private DateTime transactionTime;
	
	private List<TradeLeg> tradeLegs = new ArrayList<>();
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public TradeType getTradeType() {
		return tradeType;
	}
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	public DateTime getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(DateTime transactionTime) {
		this.transactionTime = transactionTime;
	}
	public List<TradeLeg> getTradeLegs() {
		return tradeLegs;
	}
	public void setTradeLegs(List<TradeLeg> tradeLegs) {
		this.tradeLegs = tradeLegs;
	}

}
