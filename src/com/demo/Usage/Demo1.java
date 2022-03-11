package com.demo.Usage;

import com.demo.utility.MyArrayList;

public class Demo1 {
	public static void main(String[] args) {
		String s1=new String("Sham");
		String s2=new String("Ram");
		MyArrayList<String> mylist12=new MyArrayList<>();
		System.out.println(mylist12.add("Sham"));
		mylist12.add(s2);
		mylist12.add(s1);
		mylist12.add("");
////		mylist.add(s1);
////		//mylist.clear();
		System.out.println(mylist12);
		System.out.println(mylist12.size());
		mylist12.delete(s1);
		System.out.println(mylist12);
		System.out.println(mylist12.size());
		System.out.println(mylist12.isEmpty());
		System.out.println(mylist12.contains(s1));
		System.out.println(mylist12.getCapacity());
		//System.out.println(s1.length());
		
	}

}
