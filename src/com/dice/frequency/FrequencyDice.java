package com.dice.frequency;

import java.security.SecureRandom;

public class FrequencyDice {

	public static void main(String[] args) {
		
		SecureRandom randomnumber=new SecureRandom();
		
		int frequency[]=new int[7];
		for(int roll=1;roll<=60_000_000;roll++)
		{
			++frequency[1+randomnumber.nextInt(6)];
		}
		
		
		// TODO Auto-generated method stub

		for (int i=1;i<frequency.length;i++)
			System.out.println(i+ " "+ frequency[i]);
	}

}
