package com.station.servermodule.context;

public class SignContext {
  static {
    System.loadLibrary("native-lib");
  }

  // public static native String getAESKey();

  public static native String getClientID(boolean z);

  // public static native String getClientSecret(boolean z);

  // public static native String getGoogleGeoKey();

  // public static native String getGooglePlaceKey();

  // public static native String getIEIV();

  // public static native String getIEKey();

  // public static native String getNonce();

  // public static native String getPIN1(boolean z);

  // public static native String getPIN2(boolean z);

  // public static native String getPIN3(boolean z);

  // public static native String getPIN4(boolean z);

  // public static native String getPIN5(boolean z);

  // public static native String getSafetyRecallKey();
}
