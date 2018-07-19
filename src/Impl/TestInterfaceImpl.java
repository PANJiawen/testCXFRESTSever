package Impl;

import server.TestInterface;

public class TestInterfaceImpl implements TestInterface {

	@Override
	public String sendString(String input) {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "wtf";
	}

	@Override
	public String postxml(String xml) {
		// TODO Auto-generated method stub
		System.out.println(xml);
		return "xml is arrived";
	}

}
