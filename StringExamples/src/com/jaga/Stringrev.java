package com.jaga;

public class Stringrev {
	
	
	public static void main(String[] args) {
		String a="Welcome";
		String b="Welcome";
		String rev="";
		String c= new String("Welcome");
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		
		
		for(int i=a.length()-1;i>=0;i--) {
			 rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	

}
}
