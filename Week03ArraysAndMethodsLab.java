package week3.week3;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		int[] array1 = new int[6];
		array1[0] = 1;
		array1[1] = 5;
		array1[2] = 2;
		array1[3] = 8;
		array1[4] = 13;
		array1[5] = 6;
		
		// 2. Print out the first element in the array
		System.out.println(array1[0]);
			
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array1[array1.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(array1[array1.length]); //index 6 out of bounds for length 6
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(array1[-1]); // index -1 out of bounds
			
		// 6. Write a traditional for loop that prints out each element in the array
	for(int i = 0; i < array1.length; i++){
		System.out.println(array1[i]);
	}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for(int i : array1 ) {
			System.out.println(i);
		}
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for(int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
			System.out.println(sum);
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / array1.length;
				
		//System.out.println(average);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int i : array1) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		 
		// 12. Calculate the sum of all the letters in the new array
		String letterSum = "";
		for(int i = 0; i < names.length; i++) {
			letterSum += names[i];
					
		}
		System.out.println(letterSum.length());

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of strings and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("hello " + name);
	}
	

	// Method 14:
	public static String greeting2(String name) {
		return "hello " + name;
	}

	
	// Method 15:
	public static boolean greeting3(String name, int x) {
		
		if(name.length() > x) {
		return true;
		}else { return false;
		}
	}

	
	// Method 16:
public static boolean greeting4(String[] strings, String search) {
	for(int i = 0; i < strings.length; i++) {
		if(strings[i]== search) {
			return true;
		}
	}
	return false;
}
	
	// Method 17:
// int[] numbers = new int[4];
//number[0] = 4;
//number[1] = 3;
//number[2] = 6;
//number[3] = 9;
public static int greeting5(int[] numbers) {
		int lowest = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if( numbers[i] < lowest) {
				lowest = numbers[i];
			}
		}
		return lowest;
}
	// Method 18:
public static double greeting6(double[] doubles) {
		double sum = 0;
			for(int i = 0; i < doubles.length; i++) {
				sum += doubles[i];
				
			}
			return sum / doubles.length;
}
	// Method 19:
//loop
//lengths[i] = strings[i].length()
	
public static int[] greeting7(String[] strings) {
int[] lengths = new int[strings.length];
for(int i = 0; i < strings.length; i++) {
	lengths[i] = strings[i].length();
}
return lengths;
}
	// Method 20:
//String[] firstName = new String[4];
//firstName[0] = "Sam";
//firstName[1] = "Sally";
//firstName[2] = "Thomas";
//firstName[3] = "Robert";
// 	
public static boolean arr(String[] firstName) {
	int sum1 = 0;
	int sum2 = 0;		
	for(int i = 0; i < firstName.length; i++) {
		if(firstName[i].length() % 2 == 0) {
			sum1 += firstName[i].length();
		}else if(firstName[i].length() % 2 != 0) {
			sum2 += firstName[i].length();
		}
	}
	if(sum1 > sum2) {
		return true; 
	}
	return false;
}
	
	
// Method 21:
	
}

// 20. Write and test a method that takes an array of strings and 
//			returns true if the sum of letters for all strings with an even amount of letters
//			is greater than the sum of those with an odd amount of letters.


