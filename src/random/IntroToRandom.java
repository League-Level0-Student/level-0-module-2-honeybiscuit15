//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

//1. Run the program.  What number appears in the console?
//   Run it again. Is the number the same?


public class IntroToRandom {
	public static void main(String[] args) {
		int r = 0;
		 Random randomMaker = new Random(); 
		  r = randomMaker.nextInt(101);
	
		//2. Now make r random. 
		//   Create an object of the Random class
		//   Hint: new Random().nextInt()

		//3. Limit the random number between 0 and 100

		//4. Limit the random number between 25 and 75. Hint: (highest value - lowest value) + lowest value
		  r = randomMaker.nextInt(51)+25;
		//5. Challenge: Limit the random number between -222 and 88

		  r = randomMaker.nextInt(310)+-222;
		System.out.println(r); 
	}
}