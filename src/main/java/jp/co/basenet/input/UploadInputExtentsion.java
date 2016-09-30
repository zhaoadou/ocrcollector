package jp.co.basenet.input;

public class UploadInputExtentsion extends UploadInput {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3813022404430699385L;
	/**
	 * カード正面と反面
	 */
	private boolean positive;

	public boolean isPositive() {
		return positive;
	}

	public void setPositive(boolean positive) {
		this.positive = positive;
	}
}
