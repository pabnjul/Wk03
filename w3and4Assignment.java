package w3and4;

public class w3and4Assignment {

	public static void main(String[] args) {
		//1 a (original without 55)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 55};
		int result = ages[ages.length-2] - ages[0];
		System.out.println("1a: " + result);
		
		//b : added 55 to array above
		int resultB = ages[ages.length-1] - ages[0];
		System.out.println("1b: " + resultB);
		
		//1c
		int total = 0;
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];
		}System.out.println("1c: " + total/ages.length);
		
		//2a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double numTotal = 0; double avg = 0;
		for(String name : names) {
			numTotal += name.length();}
		avg = numTotal / names.length;
		System.out.println("2a: " + avg);
		//2b
		String allTogether = "";
		for(String name: names) {
			allTogether += name + " ";
		} System.out.println("2b: " + allTogether);
		//3 access the last of the array by getting the index number of array.length minus 1
		System.out.println("3 using ages array: " + ages[ages.length-1]);
		System.out.println("3 using names array: " + names[names.length-1]);
		//4 access first of array by requesting index number 0
		System.out.println("4 using names array: " + names[0]);
		System.out.println("4 using ages array: " + ages[0]);
		//5 new int array nameLengths
		int[] nameLengths = new int[names.length];
		for (int i=0; i< names.length; i++) {
			nameLengths[i]= names[i].length();
			System.out.println(nameLengths[i]);
		}
		//6 
		int sum = 0;
		for (int num: nameLengths) {
			sum += num;
		}
		System.out.println("6: " + sum);
		//7
		System.out.println("7: " + repeatString ("Bye", 5));
		//8
		System.out.println("8: " + sayMyName ("Julie", "Palmandez"));
		//9
		System.out.println("9: " + isIt100(ages));
		//10
		double[] doubleArray = {25.5, 30.2, 55.05, 13, 22.75};
		System.out.println("10: " + arrayAvg(doubleArray));
		//11
		double[] doubleDub = {3.3, 30.5, 46.07, 33.6};
		System.out.println("11: " + isString1Greater(doubleArray, doubleDub));
		//12
		System.out.println("12: " + willBuyDrink(true, 11.00));
		//13
		System.out.println("13: " + lightsGoOnOrOff(false, 15));
		
	}
	//for 7
	public static String repeatString (String word, int n) {
		String sentence = "";
		for(int i = 0; i < n; i++) {
			sentence += word;
		} return sentence;
	}
	//for 8
	public static String sayMyName (String firstName, String lastName) {
	
	return firstName + " " + lastName;
	}
	//for 9
	public static boolean isIt100 (int[] numbers) {
		int total = 0;
		for (int number : numbers) {
			total =+ number;
		} return total > 100;
	}
	//for 10
	public static double arrayAvg (double [] doubles) {
		double sum = 0;
		for (double number: doubles) {
			sum += number;
		} return sum / doubles.length;
	}
	//for11
	public static boolean isString1Greater (double [] double1, double [] double2) {
		double tot1 = 0; double tot2 = 0; double avg1 = 0; double avg2 = 0; 
		for(double dbl1 : double1) {
			tot1 += dbl1;
		}	avg1 = tot1 / double1.length;
			for (double dbl2 : double2) {
			tot2 += dbl2;
		}	avg2 = tot2 / double2.length;
		return avg1 > avg2;
	}
	//for12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return(isHotOutside && moneyInPocket > 10.50) ;
	}
	
	//for 13, method lightsGoOnOrOff helps us decide whether you should turn on
	//lights for a room, based on occupancy and daylight
	//Used as a communication tool for my husband to preserve energy
	
	public static String lightsGoOnOrOff (boolean isItDark, int numberOfPeople ) {
		if (isItDark && numberOfPeople > 0) {
			return "Okay to turn on the lights";
		}else {
			return "Turn off the lights, you environment hater!";
		}
	}
	
	}

