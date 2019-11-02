package com.gupao.pattern_service.pattern08_adapter;

public class PowerAdapter implements DC5 {

	private AC220 ac220;

	public PowerAdapter(AC220 ac220) {
		this.ac220 = ac220;
	}

	@Override
	public void getOutput() {
		int output = ac220.getOutput();
		System.out.println("交流电转直流过程中。。。。 输入电流：" + output);

		int result = output / 44;
		System.out.println("输出电流：" + result);
	}
}
