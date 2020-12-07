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
@Entity
@Data
@Table(name = "eligibility_details")
public class EligibilityDetailsEntity {

	@Id
	@Column(name = "ed_trace_id")
	@GeneratedValue
	private Integer edTraceId;

	@Column(name = "benefit_amt")
	private String benefitAmnt;

	@Column(name = "case_num")
	private Integer caseNum;

	@CreationTimestamp
	@Column(name = "create_dt")
	private Date createdDate;

	@Column(name = "denial_reason")
	private String denialReason;

	@Column(name = "plan_end_dt")
	private Date planEndDt;

	@Column(name = "plan_name")
	private String planName;

	@Column(name = "plan_start_dt")
	private Date planStartDt;

	@Column(name = "plan_status")
	private String planStatus;

	@UpdateTimestamp
	@Column(name = "update_dt")
	private Date updatedDt;

}
