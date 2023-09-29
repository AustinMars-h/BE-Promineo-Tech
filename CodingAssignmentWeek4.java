

public class CodingAssignmentWeek4 {

	public static void main(String[] args) {
	// Step 1A, Created first array and printed out the last elements value after being subtracted by the first.
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		System.out.println("1A. The value of the last element in my first array subtracted by the first element is: " + (ages[ages.length-1] - ages[0]));
		
	// Step 1B, repeat step a after creating an array with 1 more index.
		int[] ages2 = new int[9];
		ages2[0] = 3;
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 70;
		
		System.out.println("1B. The value of the last element in my second array subtracted by the first element is: " + (ages2[ages2.length-1] - ages2[0]));
		
		//Step 1C, Use a loop to find the average age, created two variables: ageSum and ageAverage, I used the loop to hold all of the arrays values
		// added up and divided it by the number of indexes in the array.
		int ageSum = 0;
		for ( int i = 0; i < ages.length; i++) {
			ageSum += ages[i];
		}int ageAverage = (ageSum / ages.length);
		System.out.println("1C. The average of all ages in the array is: " + ageAverage);
		
		//Step 2A array of strings, create a loop to iterate through and and calculate the average number of letters per name.
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int nameSum = 0;
		int nameAvg = 0;
				for ( int i = 0; i < names.length; i++) {
					nameSum += names[i].length();
				}nameAvg = nameSum / names.length;
				System.out.println("2A. The average amount of letters per name is: " + nameAvg);
		
		//Step 2B use a loop to iterate through the array again and concatenate all the names together.
		String allNames = ""; 
				for ( int i = 0; i < names.length; i++) {
					allNames += names[i] + " ";
				}System.out.println("2B. All names in the array are: " + allNames);
				
		//Step 3 How to access the last element of any array
				System.out.println("3. to access the last element in any array use arrayName[arrayName.length() - 1]");
				
		//Step 4 How to access the first element of any array
				System.out.println("4. to access the first element in any array use arrayName[0]");
				
		//Step 5 Create a new int array nameLengths, create a loop to add the length of each name in the names array
				int[] nameLengths = new int[6];
						for(int i = 0; i < names.length; i++) {
							nameLengths[i] += names[i].length();
							//System.out.println(nameLengths[i]);
							//checked my work^
						}
		//Step 6 Create loop to iterate over nameLengths and and calculate the sum
				int nameLengthSum = 0;
						for(int i = 0; i < nameLengths.length; i++) {
							nameLengthSum += nameLengths[i];
						}System.out.println("5-6. The sum of all the names in array nameLength is " + nameLengthSum);
						
		//Step 7 Create a method that will concatenate a string as many times as you make it
						System.out.println("7. Passing in hello and 3, we get: " + multiString("hello",3));
						
		//Step 8 Create a method that takes two strings and concatenates them together with a space between
						System.out.println("8. Passing in Bob and Marley we get: " + createFullName("Bob", "Marley"));
						
		//Step 9 Create a method that takes an array of int and returns true if the sum of all ints in the array is greater than 100
						System.out.println("9. The sum of all integers in the array is over 100: " + isSumOver100(ages));
						
		//Step 10 Create a method that takes an array of double and returns the average of all the elements in the array
				double[] dubArr = new double[5];
				dubArr[0] = 20.22;
				dubArr[1] = 30.33;
				dubArr[2] = 40.44;
				dubArr[3] = 50.55;
				dubArr[4] = 60.66;
					
						System.out.println("10. the average of all the double values in the array is: " +  doubleAvg(dubArr));
						
		//Step 11 Create a method that takes two double arrays and returns true if the average of the first array is greater than the second.
				double[] dubArr2 = new double[5];
				dubArr[0] = 10.11;
				dubArr[1] = 20.22;
				dubArr[2] = 30.33;
				dubArr[3] = 40.44;
				dubArr[4] = 50.55;
						
						
						
						System.out.println("11. Is it true that the first array has a higher average than the second..? " + arr1VsArr2(dubArr,dubArr2 ));
				
		//Step 12 Create a method called willBuyDrink that takes a boolean and a double
						System.out.println("12. Man it's hot out, do I have enough to buy this $10.50 drink? " + willBuyDrink(true, 11.00));
						
		//Step 13, should I visit the beach during the seagull apocalypse. input in this order: boolean, int, boolean, int. See your answer printed.
						System.out.println("13. " + shouldIGoToTheBeach(false, 20, true, 30));
						
	}
	//Step 7 method, takes the passed in word and integer and adds the word to the variable "result" int many times
	public static String multiString(String word, int n) {
		String result = "";
	
		
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	//Step 8 method, takes two names and concatenates them into one full name
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	//Step 9 method, takes in an int array, declares sum variable, iterates through the array adding each index's value to sumOfNum, to which the boolean "result" checks if the sum is greater than 100
	public static boolean isSumOver100(int [] array){
		int sumOfNum = 0;
	
		
		for ( int i = 0; i < array.length; i++) {
			sumOfNum += array[i];
		}
		boolean result = sumOfNum > 100;
		
		
		return result;
	}
	
	//Step 10 method, takes in double array from main method, declares sum and average variables, iterates through the array adding each index's value to sum and then divides by the number of elements in the array.
	public static double doubleAvg(double [] array) {
		double sumOfDub = 0.00;
		double dubAvg = 0.00;
		for ( int i = 0; i < array.length; i++) {
			sumOfDub += array[i];
		}dubAvg = sumOfDub / array.length;
		
		return dubAvg;
	}
	
	//Step 11 method two separate for loops to find the average of two Arrays and compare them
	public static boolean arr1VsArr2(double[] x, double[] y) {
		double sumOfDubX = 0.00;
		double dubAvgX = 0.00;
		for ( int i = 0; i < x.length; i++) {
			sumOfDubX += x[i];
		}dubAvgX = sumOfDubX / x.length;
		
		double sumOfDubY = 0.00;
		double dubAvgY = 0.00;
		for ( int i = 0; i < y.length; i++) {
			sumOfDubY += y[i];
		}dubAvgY = sumOfDubY / y.length;
		
		
		
		boolean is1Greater = dubAvgX > dubAvgY;
		
		return is1Greater;
	}
	
	//Step 12 method takes in boolean and double, if statement determines if the parameters are met to purchase a drink.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else{ return false;
		}

	}
	
	//Step 13 method takes in boolean isNiceOut to check the weather.
	// takes in two integers, determining how many Seagulls there are and how many you can beat.
	// takes in boolean areYouArmed to determine how easily you can defend against the Seagulls.
	//there are 8 possible outcomes.
	public static String shouldIGoToTheBeach(boolean isNiceOut, int howManySeagullsAreThere, boolean areYouArmed, int howManySeagullsCanYouTakeOn) {
		if( isNiceOut && areYouArmed && howManySeagullsAreThere < howManySeagullsCanYouTakeOn ) {
			return "Sounds like a nice easy day at the beach";
		} else if (isNiceOut == true && areYouArmed == false && howManySeagullsAreThere < howManySeagullsCanYouTakeOn ){
			return "Go, and may the Seagull menace cower in your presence.";
		} else if (isNiceOut == true && areYouArmed == false && howManySeagullsAreThere > howManySeagullsCanYouTakeOn ){
			return "It may be a nice day, but it is not worth your life.";
		} else if (isNiceOut == false && areYouArmed == false && howManySeagullsAreThere > howManySeagullsCanYouTakeOn ){
			return "Something isn't right, stay in your home and hide.";
		} else if (isNiceOut == false && areYouArmed == true && howManySeagullsAreThere < howManySeagullsCanYouTakeOn ){
			return "Something isn't right, secure your home and be prepared to defend yourself";
		} else if (isNiceOut == false && areYouArmed == false && howManySeagullsAreThere < howManySeagullsCanYouTakeOn ){
			return "The sky could turn black with Seagulls, but you alone will be left standing in the sunlight.";
		} else if (isNiceOut == false && areYouArmed == false && howManySeagullsAreThere < howManySeagullsCanYouTakeOn ){
			return "It may not be pleasant but you can go if you really want to.";
	}else return "probably not";
	}
}