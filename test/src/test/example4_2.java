package test;

public class example4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Hello");
		 
		 int firstArray[] = {1,2,3,4};
		 int secondArray[] = {5,6,7,8,9};
		 int myArray[];
		 myArray = firstArray;
		 System.out.println("first Array:");
		 for(int index = 0;index <myArray.length;index ++)
			 {
			 	
			 System.out.println(myArray[index]);
			 }
		 myArray = secondArray;
		 System.out.println("second Array:");
		 for(int index = 0;index <myArray.length;index ++)
			 {
			 	
			 System.out.println(myArray[index]);
			 }
	}

}
