package com.snimmo.ctrm.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "TRADE_LEG")
public class TradeLegJPA {

	@Id
	@GeneratedValue
	@Column(name = "TRADE_LEG_UID")
	private Long uid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRADE_UID")
	private TradeJPA trade;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	@Column(name = "PRICE")
	private BigDecimal price;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public TradeJPA getTradeHeader() {
		return trade;
	}

	public void setTradeHeader(TradeJPA trade) {
		this.trade = trade;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
