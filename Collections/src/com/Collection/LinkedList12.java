package com.Collection;

import java.util.LinkedList;

public class LinkedList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l=new LinkedList<String>();
l.add("durga");
l.add("10");
l.add(null);
System.out.println(l);
l.add("durga");
l.set(1,"software");
System.out.println(l);
l.add(2,"kowshik");
l.removeLast();
System.out.println(l);
l.addFirst("kowshik");
System.out.println(l);


	}

}
