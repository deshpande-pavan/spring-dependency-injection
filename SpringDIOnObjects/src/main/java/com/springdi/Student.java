package com.springdi;

public class Student {

	private int id;
	private Maths maths;

	public void setId(int id) {
		this.id = id;
	}

	public void setMaths(Maths maths) {
		this.maths = maths;
	}

	public void cheating() {

		maths.cheating();
		System.out.println("id" + id);
	}
}
