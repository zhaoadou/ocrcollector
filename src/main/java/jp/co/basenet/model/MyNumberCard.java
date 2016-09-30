package jp.co.basenet.model;

import java.io.Serializable;

public class MyNumberCard implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -369116942602135596L;

	/**
	 * 個人番号
	 */
	private String id;
	
	/**
	 * 氏名（姓）
	 */
	private String firstName;
	
	/**
	 * 氏名（名）
	 */
	private String lastName;
	
	
	public MyNumberCard() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param content
	 */
	public MyNumberCard(String id, String content) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
