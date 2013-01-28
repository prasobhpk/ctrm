package com.snimmo.ctrm.object;

import java.math.BigDecimal;

public class Instrument {
	
	private Long uid;
	private SecurityType securityType;
	private SettlementMethod settlementMethod;
	private Exchange exchange;
	private String securityAltID;
	private String description;
	
	private Integer contractMultiplier;
	private UnitOfMeasure unitOfMeasure;
	private BigDecimal unitOfMeasureQuantity;
	private UnitOfMeasure priceUnitOfMeasure;
	private BigDecimal priceUnitOfMeasureQuantity;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public SecurityType getSecurityType() {
		return securityType;
	}
	public void setSecurityType(SecurityType securityType) {
		this.securityType = securityType;
	}
	public SettlementMethod getSettlementMethod() {
		return settlementMethod;
	}
	public void setSettlementMethod(SettlementMethod settlementMethod) {
		this.settlementMethod = settlementMethod;
	}
	public Exchange getExchange() {
		return exchange;
	}
	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}
	public String getSecurityAltID() {
		return securityAltID;
	}
	public void setSecurityAltID(String securityAltID) {
		this.securityAltID = securityAltID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getContractMultiplier() {
		return contractMultiplier;
	}
	public void setContractMultiplier(Integer contractMultiplier) {
		this.contractMultiplier = contractMultiplier;
	}
	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public BigDecimal getUnitOfMeasureQuantity() {
		return unitOfMeasureQuantity;
	}
	public void setUnitOfMeasureQuantity(BigDecimal unitOfMeasureQuantity) {
		this.unitOfMeasureQuantity = unitOfMeasureQuantity;
	}
	public UnitOfMeasure getPriceUnitOfMeasure() {
		return priceUnitOfMeasure;
	}
	public void setPriceUnitOfMeasure(UnitOfMeasure priceUnitOfMeasure) {
		this.priceUnitOfMeasure = priceUnitOfMeasure;
	}
	public BigDecimal getPriceUnitOfMeasureQuantity() {
		return priceUnitOfMeasureQuantity;
	}
	public void setPriceUnitOfMeasureQuantity(BigDecimal priceUnitOfMeasureQuantity) {
		this.priceUnitOfMeasureQuantity = priceUnitOfMeasureQuantity;
	}

}
