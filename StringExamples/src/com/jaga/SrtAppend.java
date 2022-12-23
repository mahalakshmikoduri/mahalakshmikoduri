package com.jaga;

public class SrtAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Welcome to Infy";
	StringBuffer stb= new StringBuffer(str);
	StringBuilder dtr=new StringBuilder(str);
	System.out.println(dtr.reverse());
	System.out.println(stb.reverse());
	stb.append(" at Chennai");
	System.out.println(stb);
	}

}
