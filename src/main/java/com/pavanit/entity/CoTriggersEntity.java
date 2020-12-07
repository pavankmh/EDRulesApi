package com.pavanit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "trg_id")
	private Integer trgId;

	@Column(name = "case_num")
	private String caseNum;

	@CreationTimestamp
	@Column(name = "created_dt")
	private Date createdDt;

	@Column(name = "trg_status")
	private String triggerStatus;

	@UpdateTimestamp
	@Column(name = "update_dt")
	private Date updatedDt;

}
