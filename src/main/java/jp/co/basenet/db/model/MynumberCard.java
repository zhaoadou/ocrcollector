package jp.co.basenet.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the MynumberCard database table.
 * 
 */
@Entity
@Table(name="MynumberCard")
@NamedQuery(name="MynumberCard.findAll", query="SELECT m FROM MynumberCard m")
public class MynumberCard implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String address;
	private String cardnumber;
	private String firstname;
	private String firstnameJp;
	private String lastname;
	private String lastnameJp;

	public MynumberCard() {
	}
	
	public MynumberCard(long id) {
		super();
		this.id = id;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}


	@Column(length=255)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(length=45)
	public String getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}


	@Column(length=45)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	@Column(name="firstname_jp", length=45)
	public String getFirstnameJp() {
		return this.firstnameJp;
	}

	public void setFirstnameJp(String firstnameJp) {
		this.firstnameJp = firstnameJp;
	}


	@Column(length=45)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Column(name="lastname_jp", length=45)
	public String getLastnameJp() {
		return this.lastnameJp;
	}

	public void setLastnameJp(String lastnameJp) {
		this.lastnameJp = lastnameJp;
	}

}