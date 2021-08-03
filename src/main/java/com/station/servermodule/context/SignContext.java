package com.station.servermodule.context;
public class SignContext {

	static {
		System.loadLibrary("native-lib");
	}

	public static String getId() {
		return SignContext.getClientID("com.stationdm.bluelink", true);
	}

	public static native String getClientID(String str, Boolean bool);

}