import java.util.Scanner;

public class MakeChange {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			tempMeth();
	}
	
	public static void tempMeth() {
		//temporary method will testing functionallity
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
		System.out.println(change);
		return change;
	}
	
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
		
		if(hundreds > 0) {
			System.out.print(hundreds + " hundred dollar bill, ");
		}
		if(twentys > 0) {
			System.out.print(hundreds + " twenty dollar bill, ");
		}
		if(tens > 0) {
			System.out.print(hundreds + " ten dollar bill, ");
		}
		if(fives > 0) {
			System.out.print(hundreds + " five dollar bill, ");
		}
		if(ones > 0) {
			System.out.print(hundreds + " one dollar bill, ");
		}
		if(quarters > 0) {
			System.out.print(hundreds + " quarters, ");
		}
		if(dimes > 0) {
			System.out.print(hundreds + " dimes, ");
		}
		if(nickels > 0) {
			System.out.print(hundreds + " nickels, ");
		}
		if(pennys > 0) {
			System.out.print(hundreds + " pennys, ");
		}
		
		
	}
	
	public static int doubleToInt(double input) {
		//converts double to integer value with no deciaml
		int cents = (int)(input * 100);
		return cents;
	}
	
	public static double askPrice() {
		System.out.print("Ask for the price of the item: ");
		return sc.nextDouble();
	}
	
	public static double askTender() {
		System.out.println("How much money was tendered?");
		return sc.nextDouble();
	}
	
	
}
