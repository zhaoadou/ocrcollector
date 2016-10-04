package jp.co.basenet.input;

public class UploadInputExtentsion extends UploadInput {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3813022404430699385L;
	/**
	 * カード正面と反面
	 */
	private String positive;

	public String getPositive() {
		return positive;
	}

	public void setPositive(String positive) {
		this.positive = positive;
	}
	
	public String toString() {
		return String.format("%s_%s", super.toString(),positive); 
	}

}
