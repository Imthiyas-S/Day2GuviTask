package guvitask;

import java.util.Scanner;

public class FinalPayableAmount {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();
	        
	        double finalAmount = calculateFinalAmount(purchaseAmount);
	        
	        System.out.println("Final payable amount after applying discount: Rs." + finalAmount);
	        
	        scanner.close();
	    }
	    
	    public static double calculateFinalAmount(double purchaseAmount) {
	        double finalAmount = 0;
	        
	        if (purchaseAmount < 500) {
	            finalAmount = purchaseAmount;
	        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
	            finalAmount = purchaseAmount * 0.9; 
	        } else {
	            finalAmount = purchaseAmount * 0.8; 
	        }
	        
	        return finalAmount;
	    }
	


}
