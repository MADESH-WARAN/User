package com.blueyonder.team4;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class OrderTable {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer oId;
	private Integer pIds[];
	private Integer pQuantities[];
	private Integer staffId;
	private Date oDate;
	private Date oDelivery;
	private String status;
	private String paymentMode;
	public Integer getoId() {
		return oId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public Integer[] getpIds() {
		return pIds;
	}
	public void setpIds(Integer[] pIds) {
		this.pIds = pIds;
	}
	public Integer[] getpQuantities() {
		return pQuantities;
	}
	public void setpQantities(Integer[] pQantities) {
		this.pQuantities = pQantities;
	}
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	public Date getoDelivery() {
		return oDelivery;
	}
	public void setoDelivery(Date oDelivery) {
		this.oDelivery = oDelivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
