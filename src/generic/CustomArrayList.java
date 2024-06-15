package generic;

import java.awt.Component.BaselineResizeBehavior;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

	private int[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;

	public CustomArrayList() {

		this.data = new int[DEFAULT_SIZE];
	}

	public void add(int num) {
		if (isFull()) {
			resize();
		}
		this.data[size] = num;
		size++;
	}

	public boolean isFull() {
		if (this.data.length == this.size) {
			return true;
		}
		return false;
	}

	public void resize() {
		int[] temp = new int[data.length * 2];

		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		this.data = temp;

	}

	public int remove() {
		int removed = this.data[--size];
		return removed;
	}

	public int get(int index) {

		return this.data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		this.data[index] = value;
	}

	
	
	@Override
	public String toString() {
		return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		list.add(4);
//		list.add(41);
//		list.add(3);
//		list.add(8);
//		list.add(8);
//		list.add(9);
//		System.out.println(list);
		
		CustomArrayList list=new CustomArrayList();
		list.add(5);
		list.add(2);
		list.add(9);
		System.out.println(list);

	}
}
