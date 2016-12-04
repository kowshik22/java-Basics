package com.StringBufferpkg;

public class StringBuffer3 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("abcd");
sb.insert(1,"xyz");
System.out.println(sb);
sb.delete(0,3);
}
}
