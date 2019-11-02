package com.gupao.pattern_service.pattern02_singleton.register;

public class SingleEnumTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			SingleEnum black = SingleEnum.BLACK;
			System.out.println(black);
		}
	}
}
