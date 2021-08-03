package com.station.servermodule.context;

// Java_com_station_servermodule_context_SignContext_getClientID
// Java_com_station_servermodule_context_SignContext_getClientSecret
@SuppressWarnings("JniMissingFunction")
public class SignContext {
	static {
		System.loadLibrary("native-lib");
	}

	public static native String getClientID(String str, boolean z);
	public static native String getClientSecret(String str, boolean z);
}