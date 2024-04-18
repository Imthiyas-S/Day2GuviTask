package guvitask;

public class SmallestNumber {
    public static void main(String[] args) {
       
    	int num1 = 25;
    	int num2 = 55;
    	int num3 = 75;
    	
    	int smallest = findSmallest(num1, num2, num3);
    		System.out.println("The Smallest number is : "+ smallest);
    	}
    	public static int findSmallest(int a, int b, int c) {
    		if (a <= b && a <=c ) {
    			return a;
    		}
    		else if(b <=a && b <=c ) {
    			return b;
    		}
    		else {
    			return c;
    		}
    		
    	}
}