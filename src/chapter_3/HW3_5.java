package chapter_3;

public class HW3_5 {

	public static void main (String args []){
		
//		3. Using nested if statements, write a single statement that prints the
//		smallest value contained in the variables a, b, and c.
		
		int a = 3;
		int b = 6;
		int c = 1;
		
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
	}
	
}
