package com.snimmo.ctrm.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "TRADE")
public class TradeJPA implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "TRADE_UID")
	private Long uid;

	@Column(name = "EXECID")
	private String execId;

	@Column(name = "TRADE_TYPE")
	private TradeTypeJPA tradeType;
	
	@OneToMany(mappedBy="trade")
	private List<TradeLegJPA> tradeLegs = new ArrayList<>();

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getExecId() {
		return execId;
	}
	
	public void setExecId(String execId) {
		this.execId = execId;
	}

	public TradeTypeJPA getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeTypeJPA tradeType) {
		this.tradeType = tradeType;
	}
	
	public List<TradeLegJPA> getTradeLegs() {
		return tradeLegs;
	}
	
	public void setTradeLegs(List<TradeLegJPA> tradeLegs) {
		this.tradeLegs = tradeLegs;
	}

}
