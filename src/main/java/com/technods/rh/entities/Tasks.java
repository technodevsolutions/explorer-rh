package com.technods.rh.entities;

// Generated 11 avr. 2016 23:43:33 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;

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
 * Tasks generated by hbm2java
 */
@Entity
@Table(name = "tasks", catalog = "explorerrh")
public class Tasks implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idtasks;
	@JsonIgnore
	private Employee employee;
	private String taskName;
	private String taskDescrption;
	private Date taskTime;
	private String statut;

	public Tasks() {
	}

	public Tasks(Employee employee, String taskName, String taskDescrption,
			Date taskTime, String statut) {
		this.employee = employee;
		this.taskName = taskName;
		this.taskDescrption = taskDescrption;
		this.taskTime = taskTime;
		this.statut = statut;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idtasks", unique = true, nullable = false)
	public Integer getIdtasks() {
		return this.idtasks;
	}

	public void setIdtasks(Integer idtasks) {
		this.idtasks = idtasks;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "taskname", length = 45)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "taskdescrption")
	public String getTaskDescrption() {
		return this.taskDescrption;
	}

	public void setTaskDescrption(String taskDescrption) {
		this.taskDescrption = taskDescrption;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tasktime", length = 19)
	public Date getTaskTime() {
		return this.taskTime;
	}

	public void setTaskTime(Date taskTime) {
		this.taskTime = taskTime;
	}

	@Column(name = "statut", length = 45)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
