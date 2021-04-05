package homeWork4Part2;

import java.util.Scanner;

public class HomeWork4Part4{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] order1 = new int[] {0,0,3,4,7};
	int[] order2 = new int[] {0,4,0,4};
	}
	
	//invoking method to combine orders
	combineOrder(order1);
	combineOrder(order2);
	
	//print results
	
	if (combineOrder(order1)) {
		
		System.out.println("This order is correct");
	}

	else {
			
		System.out.println("This order is correct too");
		}
	}
static Scanner Sc = new Scanner(System.in);


}

