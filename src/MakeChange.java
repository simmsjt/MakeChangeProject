import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeChange {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			//tempMeth();
			run();
	}
	
	public static void run() {
		int price = doubleToInt(askPrice());
		int tender = doubleToInt(askTender());
		moneyChecker(price,tender);
		
	}
	
	public static void moneyChecker(int price, int tender) {
		if(tender == price) {
			System.out.println("Perefect amount of money. No Change.");
		}else if(tender< price) {
			System.out.println("You didn't input enough money");
		}else {
			billsNCoins(amountChange(price,tender));
		}
		
	}
	
	public static int amountChange(int price, int tender) {
		 //find the amount of change
		int change = tender -  price;
		return change;
	}
	
	//public static void 
	public static void billsNCoins(int total){
		//printout for bills and coins
		int hundreds,twentys,tens,fives
		,ones,quarters,dimes,nickels,pennys;
		
		hundreds = total / 10000;
		total = total % 10000;
		twentys = total / 2000;
		total = total % 2000;
		tens = total / 1000;
		total = total % 1000;
		fives = total / 500;
		total = total % 500;
		ones = total / 100;
		total = total % 100;
		quarters = total / 25;
		total = total % 25;
		dimes = total / 10;
		total = total % 10;
		nickels = total / 5;
		total = total % 5;
		pennys = total;
		
		boolean firstStatement = true;
		if(hundreds > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + hundreds + " hundred dollar bill");
		}
		if(twentys > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + twentys + " twenty dollar bill ");
		}
		if(tens > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + tens + " ten dollar bill ");
		}
		if(fives > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			} 
			System.out.print(" " + fives + " five dollar bill ");
		}
		if(ones > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + ones + " one dollar bill ");
		}
		if(quarters > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + quarters + " quarters");
		}
		if(dimes > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + dimes + " dimes");
		}
		if(nickels > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + nickels + " nickels");
		}
		if(pennys > 0) {
			if(firstStatement) {
				firstStatement = false;
			}else {
				System.out.print(",");
			}
			System.out.print(" " + pennys + " pennys");
		}
		
		System.out.println(".");
	}
	
	public static int doubleToInt(double input) {
		//converts double to integer value with no deciaml
		int cents = (int)(input * 100);
		return cents;
	}
	
	public static double askPrice() {
		System.out.print("Ask for the price of the item: ");
		return inputFormat();
	}
	
	public static double askTender() {
		System.out.println("How much money was tendered?");
		return inputFormat();
	}
	
	public static double inputFormat() {
		boolean flag = false;
		double input = 0;
		while(!flag){
			
	         try {
	            input = sc.nextDouble();
	            flag = true;
	            break;
	         }

	         catch (InputMismatchException e) {
	             System.out.println("Wrong entry! Format like this \" 20.12 \"");
	             sc.next();
	         }
	   
	     }
		
		return input;
		
		
	}
	
	
}
