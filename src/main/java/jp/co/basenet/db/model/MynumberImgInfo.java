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
 * The persistent class for the MynumberImgInfo database table.
 * 
 */
@Entity
@Table(name = "MynumberImgInfo")
@NamedQuery(name = "MynumberImgInfo.findAll", query = "SELECT m FROM MynumberImgInfo m")
public class MynumberImgInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String background;
	private String cardNumber;
	private String frontOrReverseside;
	private String lightingCondition;
	private String angle;

	private String path;

	public MynumberImgInfo() {
		super();
	}

	/**
	 * 
	 * @param cardNumber
	 * @param lightingCondition
	 * @param background
	 * @param frontOrReverseside
	 * @param path
	 */
	public MynumberImgInfo(String cardNumber, String lightingCondition,
			String background,String angle,String frontOrReverseside, 
			String path) {
		super();
		this.cardNumber = cardNumber;
		this.lightingCondition = lightingCondition;
		this.background = background;
		this.frontOrReverseside = frontOrReverseside;
		this.angle = angle;
		this.path = path;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 2)
	public String getBackground() {
		return this.background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	@Column(length = 45)
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Column(length = 2)
	public String getFrontOrReverseside() {
		return this.frontOrReverseside;
	}

	public void setFrontOrReverseside(String frontOrReverseside) {
		this.frontOrReverseside = frontOrReverseside;
	}

	@Column(length = 2)
	public String getLightingCondition() {
		return this.lightingCondition;
	}

	public void setLightingCondition(String lightingCondition) {
		this.lightingCondition = lightingCondition;
	}

	@Column(length = 2)
	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	@Column(length = 255)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}