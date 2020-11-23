package com.example.demo.audit;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

	@CreatedBy
	protected U createdBy;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected U createdDate;
	
	@LastModifiedBy
	protected U lastModifiedBy;
	
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected U lastModifiedDate;

	public U getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(U createdBy) {
		this.createdBy = createdBy;
	}

	public U getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(U createdDate) {
		this.createdDate = createdDate;
	}

	public U getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(U lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public U getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(U lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}

