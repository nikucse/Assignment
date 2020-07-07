package com.test;

public class SequeceCard {
	
	final static String SEQ[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	public boolean checkSequence(String sequence) {
		
		String[] list = sequence.split(",");
		
		boolean msg = false;
		
		if (list.length <= 2)
			return msg;
		
		char temp = list[0].charAt(0);
		String  value = String.valueOf(list[0].charAt(2));
		int index = 0;
	
		for (int i = 0; i < list.length; i++)  
				if(list[i].charAt(0) != temp)
					return msg;
				else if(list[i].charAt(1) != '#')
					return msg;
		
		for(int i =0 ;i<SEQ.length;i++) 
			if(value.toString().equals("1"))
				 value = "10";
			else if (value.toString().equals(SEQ[i])) {
				index = i;
				break;
			}
		
		for (int i = 1; i < list.length && index < SEQ.length; i++) {
			if(index == SEQ.length-1)
				return false;
			String val = String.valueOf(list[i].charAt(2));
			 if(val.equals("1"))
				 val = "10";
			 else if(!(SEQ[++index].equals(String.valueOf(list[i].charAt(2)))))
					return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String sequence = "H#A,H#2,H#3,H#4";
		SequeceCard cards = new SequeceCard();
		System.out.println(cards.checkSequence(sequence));
	}

}
