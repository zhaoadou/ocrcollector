package jp.co.basenet.input;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UploadInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6554265907943036837L;

	/**
	 * 00:明るい 01:暗い
	 */
	private String brightness;

	/**
	 * 00:白い 01:黒い
	 */
	private String background;

	/**
	 * 00:ある 01:なし
	 */
	private String angle;

	/**
	 * データのmime-type
	 */
	private String mime;

	/**
	 * データbase encodingしたの内容
	 */
	private String base64Data;

	public String getBrightness() {
		return brightness;
	}

	public void setBrightness(String brightness) {
		this.brightness = brightness;
	}

	public String getbackground() {
		return background;
	}

	public void setbackground(String background) {
		this.background = background;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	public String getBase64Data() {
		return base64Data;
	}

	public void setBase64Data(String base64Data) {
		this.base64Data = base64Data;
	}

	public String toString() {
		return String.format("%s_%s_%s", brightness, background, angle);
	}

	public String toJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
