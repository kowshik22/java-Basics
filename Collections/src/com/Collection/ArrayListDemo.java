package com.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("A");
al.add("10");
al.add(null);
System.out.println(al);
al.remove(1);
System.out.println(al);
al.add(2,"m");
al.add("n");
System.out.println(al);
	}

}
