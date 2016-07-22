package com.technods.rh.entities;

// Generated 11 avr. 2016 23:43:33 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "explorerrh")
public class Employee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idemployee;
	private String name;
	private String lastName;
	private String cin;
	private String phone;
	private String post;
	private String cnss;
	private String cv;
	private String photo;
	private String salaire;
	private String mail;
	private Integer user;
	private String accruedHolidaysDays;
	private Set<Holiday> holidays = new HashSet<Holiday>(0);
	private Set<Tasks> taskses = new HashSet<Tasks>(0);
	private Set<Interview> interviews = new HashSet<Interview>(0);
	private Set<Ticket> ticketsForSender = new HashSet<Ticket>(0);
	private Set<Message> messagesForReceiver = new HashSet<Message>(0);
	private Set<Ticket> ticketsForReceiver = new HashSet<Ticket>(0);
	private Set<Message> messagesForSender = new HashSet<Message>(0);

	public Employee() {
	}

	public Employee(String name, String lastName, String cin, String phone,
			String post, String cnss, String cv, String photo, String salaire,
                    String mail, Integer user, String accruedHolidaysDays,
                    Set<Holiday> holidays,
                    Set<Tasks> taskses, Set<Interview> interviews,
                    Set<Ticket> ticketsForSender,
                    Set<Message> messagesForReceiver,
                    Set<Ticket> ticketsForReceiver,
                    Set<Message> messagesForSender) {
		this.name = name;
		this.lastName = lastName;
		this.cin = cin;
		this.phone = phone;
		this.post = post;
		this.cnss = cnss;
		this.cv = cv;
		this.photo = photo;
		this.salaire = salaire;
		this.mail = mail;
        this.user = user;
        this.accruedHolidaysDays = accruedHolidaysDays;
		this.holidays = holidays;
		this.taskses = taskses;
		this.interviews = interviews;
		this.ticketsForSender = ticketsForSender;
		this.messagesForReceiver = messagesForReceiver;
		this.ticketsForReceiver = ticketsForReceiver;
		this.messagesForSender = messagesForSender;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idemployee", unique = true, nullable = false)
	public Integer getIdemployee() {
		return this.idemployee;
	}

	public void setIdemployee(Integer idemployee) {
		this.idemployee = idemployee;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "lastname", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "cin", length = 45)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "phone", length = 45)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "post", length = 45)
	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Column(name = "cnss", length = 45)
	public String getCnss() {
		return this.cnss;
	}

	public void setCnss(String cnss) {
		this.cnss = cnss;
	}

	@Column(name = "cv", length = 45)
	public String getCv() {
		return this.cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	@Column(name = "photo", length = 45)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "salaire", length = 45)
	public String getSalaire() {
		return this.salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	@Column(name = "mail", length = 45)
	public String getMail() {
		return this.mail;
	}

    @Column(name = "user")
    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public void setMail(String mail) {
		this.mail = mail;
	}

    @Column(name = "holidays")
    public String getAccruedHolidaysDays() {
        return accruedHolidaysDays;
    }

    public void setAccruedHolidaysDays(String accruedHolidaysDays) {
        this.accruedHolidaysDays = accruedHolidaysDays;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Holiday> getHolidays() {
		return this.holidays;
	}

	public void setHolidays(Set<Holiday> holidays) {
		this.holidays = holidays;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Tasks> getTaskses() {
		return this.taskses;
	}

	public void setTaskses(Set<Tasks> taskses) {
		this.taskses = taskses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Interview> getInterviews() {
		return this.interviews;
	}

	public void setInterviews(Set<Interview> interviews) {
		this.interviews = interviews;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeBySender")
	public Set<Ticket> getTicketsForSender() {
		return this.ticketsForSender;
	}

	public void setTicketsForSender(Set<Ticket> ticketsForSender) {
		this.ticketsForSender = ticketsForSender;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByReceiver")
	public Set<Message> getMessagesForReceiver() {
		return this.messagesForReceiver;
	}

	public void setMessagesForReceiver(Set<Message> messagesForReceiver) {
		this.messagesForReceiver = messagesForReceiver;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByReceiver")
	public Set<Ticket> getTicketsForReceiver() {
		return this.ticketsForReceiver;
	}

	public void setTicketsForReceiver(Set<Ticket> ticketsForReceiver) {
		this.ticketsForReceiver = ticketsForReceiver;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeBySender")
	public Set<Message> getMessagesForSender() {
		return this.messagesForSender;
	}

	public void setMessagesForSender(Set<Message> messagesForSender) {
		this.messagesForSender = messagesForSender;
	}

}