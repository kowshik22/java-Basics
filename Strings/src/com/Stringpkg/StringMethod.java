package com.Stringpkg;

public class StringMethod {
public static void main(String[] args) {
	String str=new String("helloworldofthefirstprogramming");
	String str1=new String("programmingisthe mainofanyfunction");
	int var=str.compareTo(str1);
	System.out.println(var);
	char ch1=str.charAt(5);
	char ch2=str.charAt(3);
	char ch3=str.charAt(6);
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
}
}
