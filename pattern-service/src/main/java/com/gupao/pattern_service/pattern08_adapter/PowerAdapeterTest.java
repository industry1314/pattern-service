package com.gupao.pattern_service.pattern08_adapter;

public class PowerAdapeterTest {

	public static void main(String[] args) {
		PowerAdapter powerAdapter = new PowerAdapter(new AC220());
		powerAdapter.getOutput();
	}
}
