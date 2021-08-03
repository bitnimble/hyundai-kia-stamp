package com.hacksore;
import com.station.servermodule.context.SignContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("TESTING...");
		System.out.println(SignContext.getClientID("com.stationdm.bluelink", true));
		System.out.println("Called...");
	}
}