package com.hyundai.stamp;
import com.station.servermodule.context.SignContext;
public class Main {

	public static void main(String[] args) {
		System.out.println(SignContext.getClientID((true)));
	}
}