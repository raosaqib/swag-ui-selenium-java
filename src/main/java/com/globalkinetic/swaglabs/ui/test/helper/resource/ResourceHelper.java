package com.globalkinetic.swaglabs.ui.test.helper.resource;

/**
 * 
 * @author rao saqib
 *
 */
public class ResourceHelper {

	public static String getResourcePath(String path) {
		String basePath = System.getProperty("user.dir");
		System.out.println(basePath + "/" + path);
		return basePath + "/" + path;
	}
}