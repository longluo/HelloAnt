package com.ant.example;

public class AntMain {
	public static void main(String[] args) {
		begin();
		
		ApiAnt aa = new ApiAnt();
		
		aa.printProgramName();
		aa.printProgramVersion();
	}
	
	private static void begin() {
		System.out.println("Start...");
	}
}
