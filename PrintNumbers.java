package guvitask;


public class PrintNumbers {
	
	
	    public static void main(String[] args) {
	        
	        System.out.println("Printing numbers from 10 to 50 using for loop:");
	        for (int i = 10; i <= 50; i++) {
	            System.out.print(i + " ");
	        }
	        
	        System.out.println(); 
	      
	        
	        System.out.println("Printing numbers from 10 to 50 using while loop:");
	        int j = 10;
	        while (j <= 50) {
	            System.out.print(j + " ");
	            j++;
	        }
	    }
	}
