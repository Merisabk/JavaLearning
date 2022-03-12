package com.qa.conditionals;

public class ResultsRevisited {
		
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
		
			
		public ResultsRevisited(int physics, int chemistry, int biology) {
			this.physics = physics;
			this.chemistry = chemistry;
			this.biology = biology;
			this.total = physics + chemistry + biology;
		
		
		}

		public void methodTwo() {
			this.percentage = (this.total * 100) / 450;
			System.out.println("Percentage: " + this.percentage + "%");		
			
		}
		
		
		public void showPercentage() {
						
			double physicsPercentage = (physics * 100) / 150;
			double chemistryPercentage = (chemistry * 100) / 150;
			double biologyPercentage = (biology * 100) / 150;
			double overallPercentage = (total * 100) /450;
			
			System.out.println("Percentage: " + overallPercentage + "%\n");
			
			if (overallPercentage >= 60 && physicsPercentage >= 60 && chemistryPercentage >= 60 && biologyPercentage >= 60) {
				System.out.println("Passed!"); 
			} else {
				
			 if (physicsPercentage < 60) {
				System.out.println("Physics: Failed");
			}
			 if  (chemistryPercentage < 60) {
				System.out.println("Chemistry: Failed");
			}
			 if (biologyPercentage < 60) {
				System.out.println("Biology: Failed");
				}
			 System.out.println("Overall result: FAIL");
			}
		}


	

}
