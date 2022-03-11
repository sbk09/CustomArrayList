package com.demo.utility;

import java.util.Arrays;

public class MyArrayList<E>  {
	private static final int INITIAL_CAPACITY=10;
	private  int MODIFIED_CAPACITY=INITIAL_CAPACITY;
	private  int LOAD_FACTOR=this.MODIFIED_CAPACITY-(this.MODIFIED_CAPACITY%7);
	private static final Object[] EMPTY_ELEMENT_DATA= {};
	private static final Object[] DEFAULT_ELEMENT_DATA= {};
	
	private int delete_Count=0;
	private int size;
	
	//private int index=0;
	Object[] element_Data= {};
	
	public MyArrayList(){
		this.element_Data=DEFAULT_ELEMENT_DATA;
	}
	public MyArrayList(int initial_capacity) {
		if(initial_capacity>0) {
			MODIFIED_CAPACITY=initial_capacity;
			this.element_Data=DEFAULT_ELEMENT_DATA;
		}else if(initial_capacity==0) {
			this.element_Data=EMPTY_ELEMENT_DATA;
		}else {
			throw new IllegalArgumentException("Illegal Argument "+initial_capacity);
		}
	}
	public boolean add(E e) {
		if(this.size()==this.LOAD_FACTOR && (!(e instanceof String)) && (!(e instanceof StringBuffer))  && (!(e instanceof StringBuilder))) {
			this.MODIFIED_CAPACITY=this.MODIFIED_CAPACITY*2;
			this.LOAD_FACTOR=MODIFIED_CAPACITY-(MODIFIED_CAPACITY%7);
			this.element_Data=Arrays.copyOf(this.element_Data, this.element_Data.length+1);
			this.element_Data[this.element_Data.length-1]=e;
			size+=1;
		} 
		else if(e instanceof String || e instanceof StringBuffer || e instanceof StringBuilder) {
			if(((String) e).length()>0 && this.size()==LOAD_FACTOR) {
				MODIFIED_CAPACITY=INITIAL_CAPACITY*2;
				this.element_Data=Arrays.copyOf(this.element_Data, this.element_Data.length+1);
				this.element_Data[this.element_Data.length-1]=e;
				size+=1;

			}else if(((String) e).length()>0) {
				MODIFIED_CAPACITY=INITIAL_CAPACITY;
				this.element_Data=Arrays.copyOf(this.element_Data, this.element_Data.length+1);
				this.element_Data[this.element_Data.length-1]=e;
				size+=1;

			}else {
				System.err.println("Blank value of String not allowed.");
				return false;
			}
		}
		else {
			this.element_Data=Arrays.copyOf(this.element_Data, this.element_Data.length+1);
			this.element_Data[this.element_Data.length-1]=e;
			size+=1;
		}
		return true;
	}
	
	public int size() {
		return size;
	}
	public int getCapacity() {
		if(MODIFIED_CAPACITY>INITIAL_CAPACITY)
			return MODIFIED_CAPACITY;
		else
			return MyArrayList.INITIAL_CAPACITY;
	}
	public Object delete(Object e) {
		for(int i=0;i<this.element_Data.length;i++) {
			if(this.element_Data[i]==e) {
				++delete_Count;
				this.element_Data[i]=(Object)"";
				this.element_Data=shiftLeft(this.element_Data);
				size-=1;
				return e;
			}
		}
		return null;
	}
	private static Object[] shiftLeft(Object[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]=="") {
					Object temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public void clear() {
		for(int i=0;i<this.element_Data.length;i++) {
			++delete_Count;
			this.element_Data[i]="";
			size-=1;
		}
	}
	public boolean isEmpty() {
		if(this.size()==0)
			return true;
		return false;
	}
	public Object get(int index) {
		if(0!=this.size()) {
			return this.element_Data[index];
		}
		return null;
	}
	public boolean contains(E e) {
		if(this.size()!=0) {
			for(int i=0;i<this.element_Data.length;i++) {
				if(e==this.element_Data[i]) {
					return true;
				}
			}
		}
		return false;
	}
	public Object set(Object o,int index) {
		if(index<=this.element_Data.length-1) {
			Object old_obj=(Object)this.element_Data[index];
			this.element_Data[index]=o;
			return old_obj;
		}else {
		return null;
		}
	}
	public Integer indexOf(Object o) {
		for(int i=0;i<this.element_Data.length;i++) {
			if(this.element_Data[i]==o) {
				return i;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		Object[] temp= new Object[this.element_Data.length-delete_Count];
		if(size!=0) {
			for(int i=0;i<this.element_Data.length;i++) {
				if(this.element_Data[i]!="") {
					temp[i]=this.element_Data[i];
				}
			}
		}
		return Arrays.toString(temp); 
	}
}
