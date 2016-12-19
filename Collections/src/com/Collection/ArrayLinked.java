package com.Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
LinkedList<String> ll=new LinkedList<String>();
System.out.println(al instanceof Serializable);
System.out.println(ll instanceof Serializable);
System.out.println(al instanceof RandomAccess);
	}

}
