package com.es.bo.biz.domain;

import java.util.Date;

/**
 * Created by myachb on 3/8/2016.
 */
public class AbstractEntity {

    private Date displayFrom;
    private Date displayTo;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;


	public Date getDisplayFrom() {
		return displayFrom;
	}
	public void setDisplayFrom(Date displayFrom) {
		this.displayFrom = displayFrom;
	}
	public Date getDisplayTo() {
		return displayTo;
	}
	public void setDisplayTo(Date displayTo) {
		this.displayTo = displayTo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

 
}
