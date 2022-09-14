package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is the amount of money you start with?");
		double startAmount = in.nextDouble();
		System.out.println("what is the winning probability?");
		double winChance = in.nextDouble();
		System.out.println ("What is winning limit?");
		double winLimit = in.nextDouble();
	
		double currentMoney = startAmount;
		for (int i = 0; (i<10) || (currentMoney>winLimit); i++); 
	
		{double chance = Math.random();
			if (chance>=winChance)
			{
			currentMoney ++;
			}
			if (chance<winChance)
			{
			currentMoney --;
			}
		}
	}
}