package com.qa.conditionals;

public class Tax {
	
	public int methodOne(int pay) {
		if (pay < 14999) {
			return 0;
		} else
		if (pay >= 15000 && pay <= 19000) {
			return 10;
		}
		if (pay >= 20000 && pay <=29999) {
			return 15;
		}
		if (pay >= 30000 && pay <=44999) {
			return 20;
		}
		if (pay >= 45000) {
			return 25;
		}
		return pay;
		
		
	}
	
	public int methodTwo (int pay) {
		if (pay < 14999) {
			return 0;
		} else 
			if (pay >= 15000 && pay <= 19000) {
				return (int) (pay * 0.1);
			} else 
				if (pay >= 20000 && pay <= 29000) {
					return (int) (pay * 0.15);
				} else 
					if (pay >= 30000 && pay <= 49999) {
						return (int) (pay * 0.2); }
						else
							if (pay >=45000) {
								return (int) (pay * 0.25);
							}
		return pay;
					}
		
	public int methodThree (int pay) {
		return pay - methodTwo(pay);

	}
	}



