package com.demo.Usage;

import com.demo.utility.MyArrayList;

public class Demo2 {
	public static void main(String[] args) {
		MyArrayList<Integer> l1=new MyArrayList<>();
		System.out.println("Capacity at begining: "+l1.getCapacity());
		System.out.println("Size at begining: "+l1.size());
		
		//l1.add(10);
		l1.add(130);
		l1.add(310);
		l1.add(104);
		l1.add(102);
		l1.add(101);
		l1.add(50);
		l1.add(100);
		l1.add(10);
		l1.add(140);
		l1.add(160);
		l1.add(170);
		l1.add(1540);
		l1.add(1560);
		l1.add(1045);
		
		System.out.println("Size: "+l1.size());
		System.out.println("capacity after load factor: "+l1.getCapacity());
		System.out.println(l1);
		l1.delete(10);
		System.out.println("size after delete: "+l1.size());
		System.out.println(l1);
	}

}
