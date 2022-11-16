package Week3ArraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {
	//create an array with the following values 1,5,2,8,13,6
	int[] numbersArray = {1, 5, 2, 8, 13, 6, -3};
	//print out the first element in the array
	System.out.println("first: " + numbersArray[0]);
	
	//print out the last element in the array without using the number 5
	System.out.println("last: " + numbersArray[numbersArray.length - 1]);
	
	//print out the element in the array at position 6. What happens?
	//System.out.println("Sixth: " + numbersArray[6]);
	
	//print out the element in the array at position -1. What happens?
	
	//System.out.println("negative 1 " + numbersArray[-1]);
	
	//write a traditional for loop that prints out each element in the array
	for(int i= 0; i < 6; i++ ) {
		System.out.println(numbersArray[i]);
			}
	
	//write an enhanced for loop that prints out each element in the array
	for(int array : numbersArray) {
		System.out.println(array);
	}
	{
	//create a new variable called sum, write a loop that adds each element in the array to the sum
	int sum = 0;
	for(int sums : numbersArray) {
		sum += sums;
	} System.out.println(sum);
	
	//create a new variable called average and assign the average value of the array to it
	int average = (sum/numbersArray.length);
	
	System.out.println(average);
	} 	
	
	//write an enhanced for loop that prints out each number in the array only if the number is odd
	for(int oddNums: numbersArray) {
		if((oddNums % 2) > 0) {
			System.out.println(oddNums);
		}
	}
	//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
	String[] namesArray = {"Sam", "Sally", "Thomas", "Robert", "Suzanne"}; 
	
	//calculate the sum of all the letters in the new array
	int howMany = 0;
	for(String names : namesArray) {
		howMany += names.length();
	} System.out.println(howMany);	
	//Method 1: Write and test a method that takes a String name and prints out a greeting, this method returns nothing
	createGreeting("Tom");
	
	//Method 2: write and test a method that takes a string name and returns a greeting, do not print in the method
	System.out.println(returnGreeting("Howard"));

	//analyze the difference between these two methods--what do you find? How are they different?
		/*first method will not store information--e.g., it will do something but not store
		 * The second will return the value outside of the method itself
		 */
	//Method 3: write and test a method that takes a string and an int and returns true if the number of letters in the string is greater than the int.
	 System.out.println(comparison("Whoops", 10));
	//Method 4: write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
	System.out.println(doesArrayContainString (namesArray, "Sally"));
	//Method 5: write and test a method that takes an array of int and returns the smallest number in the array
	System.out.println(smallestInList(numbersArray));
	//Method 6: write and test a method that takes an array of double and returns the average
	double[] dblNumArray = {1.5, 2, 66, 57.6, 3.011};
	System.out.println(findTheAverage(dblNumArray));
	
	//Method 7: write and test a method that takes an array of Strings and returns an array of int where each element
	//matches the length of the string at that position
	int[] nameLengths =findWordLength (namesArray);
	for (int number: nameLengths) {
		System.out.println(number);
	}
	//Method 8: write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
	//even amount of letters is greater than the sum of those with an odd amount of letters
	System.out.println(sumOddVsEven(namesArray));
	
	//Method 9: write and test a method that takes a string and returns true if the string is a palindrome
	System.out.println(isPalindrome("maam"));
	
	}
	//for Method 9
	public static boolean isPalindrome (String word) {
	//	String backwards = "";
	//	char[] compare = new char[word.length()];
		for(int i = 0; i < word.length() / 2; i++) {
	//	  compare[i] = word.charAt(word.length()-i-1);
	//		backwards +=  compare;		
		
		if(word.charAt(i) != word.charAt(word.length()- i - 1)){
		return false;
	}
		}
		return true;
	}
	
	
	//for Method 8 
	public static boolean sumOddVsEven (String[] words) {
		int evens = 0;
		int odds = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() % 2 == 0) {
				evens = words[i].length() + evens;
			}else {
				odds = words[i].length() + odds;
			}
		} return evens > odds;
	}
	
	
	//for Method 7
	public static int[] findWordLength(String[] wordList) {
		int[] results = new int[wordList.length];
		for (int i=0; i< wordList.length; i++) {
			results[i]= wordList[i].length();
		} return results;
	}
	//for Method 6
	public static double findTheAverage(double[] dblNums) {
		double sum = 0;
		for (double nums: dblNums) {
			sum += nums;
		} return sum /dblNums.length;
	}
	
	
	//for Method 5
	public static int smallestInList(int[] numberSet) {
		int smallest = numberSet[0];
		for (int number: numberSet) {
			if (number < smallest) {
				smallest = number;
				}
				}
		return smallest;
			} 
		

	
	//for Method 4
	public static boolean doesArrayContainString (String[] array, String string) {
		for(String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}return false;
		}
		
		
	//for Method 3
	
	public static boolean comparison (String string, int number) {
	return string.length() > number;
	} 

	//for Method 1
	public static void createGreeting(String name) {
		String hello = "Howdy, " + name;
		System.out.println(hello);
	}
	
	//for Method 2
	
	public static String returnGreeting(String name) {
		return name + ", greetings!";
	}
	
	
	
}
