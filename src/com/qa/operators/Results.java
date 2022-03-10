package com.qa.operators;

public class Results {
	
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;
	
	public void methodOne() {
		System.out.println("--------------\n   Results\n --------------");
		System.out.println("Physics     " + physics);
		System.out.println("Chemistry   " + chemistry);
		System.out.println("Biology     " + biology);
		System.out.println("Total       " + total);
	}
	
		
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
	
	
	}

	public void methodTwo() {
		System.out.println("Percentage: " + (this.total * 100) / 450 + "%");		
		
	}


}





//	public void methodTwo() {
//		this.percentage = (this.total * 100) / 450;
//		System.out.println("Percentage: " + percentage + "%");
//}
