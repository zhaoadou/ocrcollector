package jp.co.basenet.model;

import java.io.Serializable;

public class PostResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1801152863982041759L;
	
	private boolean result = true;
	
	private String error;

	
	public PostResult(boolean result, String error) {
		super();
		this.result = result;
		this.error = error;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
