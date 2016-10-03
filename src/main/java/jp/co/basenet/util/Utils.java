package jp.co.basenet.util;

import jp.co.basenet.input.UploadInput;

public class Utils {

	public static String makeFileName(String id, UploadInput input) {
		return id + "-" + input.toString();
	}
}
