package com.processor;

import java.math.BigDecimal;
import java.util.Date;

public class PricingResponse {

	private Date startDate;
	private Date endDate;
	private BigDecimal premium;
	private BigDecimal totalSumInsured;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPremium() {
		return premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	public BigDecimal getTotalSumInsured() {
		return totalSumInsured;
	}

	public void setTotalSumInsured(BigDecimal totalSumInsured) {
		this.totalSumInsured = totalSumInsured;
	}

}
