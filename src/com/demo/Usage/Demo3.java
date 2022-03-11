package com.demo.Usage;

import com.demo.utility.MyArrayList;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		Student s1=new Student(1, "Ram");
		Student s2=new Student(1, "Ram");
		Student s3=new Student(3, "Naveen");
		Student s4=new Student(4, "Pawan");
		MyArrayList<Student> m1=new MyArrayList<>(12);
		m1.add(s4);
		m1.add(null);
		m1.add(s2);
		m1.add(s3);
		m1.add(s1);
//		m1.add(s3);
//		m1.add(s3);
//		m1.add(s3);
		System.out.println(m1.size());
		System.out.println(m1);
		m1.delete(s4);
//		m1.clear();
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.getCapacity());
	}

}
