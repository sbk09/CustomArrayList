package com.demo.Usage;


import com.demo.utility.MyArrayList;

public class Demo {
	public static void main(String[] args) {
		MyArrayList<Integer> mylist=new MyArrayList<>();
		System.out.println(mylist.getCapacity());
		mylist.add(10);
		mylist.add(20);
		mylist.add(null);
		mylist.add(null);
		mylist.add(10);
		mylist.add(10);
		//mylist.add(50);
		mylist.add(80);
		System.out.println(mylist);
		System.out.println(mylist.size());
		mylist.delete(20);
		//mylist.delete(null);
		//System.out.println(mylist.set(66, 6));
//		mylist.clear();
		System.out.println(mylist.getCapacity());
		System.out.println(mylist);
		System.out.println(mylist.size());
		//System.out.println(mylist.indexOf(77));
	}

}
