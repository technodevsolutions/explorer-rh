package com.technods.rh.entities;

// Generated 11 avr. 2016 23:43:33 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Holiday generated by hbm2java
 */
@Entity
@Table(name = "holiday", catalog = "explorerrh")
public class Holiday implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idHoliday;
	private Employee employee;
	private String typeHoliday;
	private Date startDateHoliday;
	private Date endDateHoliday;
	private String description;
	private byte[] justification;

	public Holiday() {
	}

	public Holiday(Employee employee, String typeHoliday, Date startDateHoliday, Date
			endDateHoliday, String description, byte[] justification) {
		this.employee = employee;
		this.typeHoliday = typeHoliday;
		this.startDateHoliday = startDateHoliday;
		this.endDateHoliday = endDateHoliday;
		this.description = description;
		this.justification = justification;
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idHoliday", unique = true, nullable = false)
	public Integer getIdHoliday() {
		return idHoliday;
	}

	public void setIdHoliday(Integer idHoliday) {
		this.idHoliday = idHoliday;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start", length = 10)
	public Date getStartDateHoliday() {
		return this.startDateHoliday;
	}

	public void setStartDateHoliday(Date startDateHoliday) {
		this.startDateHoliday = startDateHoliday;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end", length = 10)
	public Date getEndDateHoliday() {
		return this.endDateHoliday;
	}

	public void setEndDateHoliday(Date endDateHoliday) {
		this.endDateHoliday = endDateHoliday;
	}

	@Column(name = "type", length = 10)
	public String getTypeHoliday() {
		return typeHoliday;
	}

	public void setTypeHoliday(String typeHoliday) {
		this.typeHoliday = typeHoliday;
	}

	@Column(name = "description", length = 10)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "justification", length = 255)
	public byte[] getJustification() {
		return justification;
	}

	public void setJustification(byte[] justification) {
		this.justification = justification;
	}
}
