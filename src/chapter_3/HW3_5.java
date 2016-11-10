package chapter_3;

public class HW3_5 {

	public static void main (String args []){
		
//		3. Using nested if statements, write a single statement that prints the
//		smallest value contained in the variables a, b, and c.
		
		int a,b,c;
		a = 3;
		b = 2;
		c = 1;
		
		if (a>b){
			if (a>c){
				System.out.println(a);
			}else if (c>a && c>b){
				System.out.println(c);
			}
		}else{
			if (b>c){
				System.out.println(b);
			}
		}
		
//		4. Write a statement that, if the value of the variable item is negative,
//		adds its value to negativeSum but, if it is positive, adds its value to
//		positiveSum. If, on the other hand, the value of item is zero, the
//		statement should simply increase the variable zeroCount by one.
		
		double item = Math.random();
	    double negativeSum = 0;
		double zeroCount = 0;
		if (item < 0){
			negativeSum = negativeSum + item;
		}else{
			zeroCount = zeroCount + item;
		}
		
		
//		5. Assume that the following declarations have been made.
		double year = Math.round(Math.random()*(Math.random()*100));
		boolean isLe
		apYear;
//		Write a fragment that will assign isLeapYear the value true if year
//		represents a leap year and false otherwise.
//		A year is usually a leap year if its number is a multiple of four. It is
//		not a leap year, however, if its number is a multiple of 100 but not
//		a multiple of 400. (As examples, 1900 was not a leap year but 2000
//		was a leap year.)
		
		if (Math.ceil(year/400) == Math.floor(year/400)){
			isLeapYear = true;
			System.out.println(isLeapYear);
		}else{
			isLeapYear = false;
			System.out.println(isLeapYear);
		}
		
	}
	
}
