package jp.co.basenet.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DriveLiceneceImgInfo database table.
 * 
 */
@Entity
@Table(name="DriveLiceneceImgInfo")
@NamedQuery(name="DriveLiceneceImgInfo.findAll", query="SELECT d FROM DriveLiceneceImgInfo d")
public class DriveLiceneceImgInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String background;
	private String cardNumber;
	private String lightingCondition;
	private String path;

	public DriveLiceneceImgInfo() {
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


	@Column(length=2)
	public String getBackground() {
		return this.background;
	}

	public void setBackground(String background) {
		this.background = background;
	}


	@Column(length=45)
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@Column(length=2)
	public String getLightingCondition() {
		return this.lightingCondition;
	}

	public void setLightingCondition(String lightingCondition) {
		this.lightingCondition = lightingCondition;
	}


	@Column(length=255)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}