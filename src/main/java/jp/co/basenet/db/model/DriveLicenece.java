package jp.co.basenet.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DriveLicenece database table.
 * 
 */
@Entity
@Table(name="DriveLicenece")
@NamedQuery(name="DriveLicenece.findAll", query="SELECT d FROM DriveLicenece d")
public class DriveLicenece implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String address;
	private String birthday;
	private String cardnumber;
	private String expireday;
	private String issueday;
	private String nameEn;
	private String nameJp;
	private String no;

	public DriveLicenece() {
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
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	@Column(length=45)
	public String getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}


	@Column(length=45)
	public String getExpireday() {
		return this.expireday;
	}

	public void setExpireday(String expireday) {
		this.expireday = expireday;
	}


	@Column(length=45)
	public String getIssueday() {
		return this.issueday;
	}

	public void setIssueday(String issueday) {
		this.issueday = issueday;
	}


	@Column(name="name_en", length=45)
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}


	@Column(name="name_jp", length=45)
	public String getNameJp() {
		return this.nameJp;
	}

	public void setNameJp(String nameJp) {
		this.nameJp = nameJp;
	}


	@Column(length=45)
	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}