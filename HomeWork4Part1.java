

public class HomeWork4Part1 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	double[] array = new double[] {100,35,5,125,12,22,67,34};
	double[] array2 = new double[] {12,13, 23, 75};

//invoking StrictlyIncreasing method
	
	
	//print results
	
	if(StrictlyIncreasing(array2)) {
		System.out.println("This array is in order");
		
	}
		
	else {
		System.out.println("This array is not in order");
		
	}
		

	}
	
	private static boolean StrictlyIncreasing(double[] in) {
		
		//defining an array of integer type
		int arrayLength = in.length; 
		
		
		for (int i =0; i < (arrayLength-1); i++ ) {
			
			if (in[i] >in[i+1]) {
				
				return false;
	
			}
			
						
		}
			return true;
			
			
		
	}

	
	
	

}	
		



