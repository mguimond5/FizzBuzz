import java.util.Scanner;

/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment 4, Program 2
* Date Last Modified: November 17, 2016
*
*/



/**
 * @author m.guimond3
 *
 */
public class FizzProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	for( int i = 1;i <= 100; i++){
		
		if(i % 3 == 0 && i % 5 == 0){
				
			System.out.println("FizzBuzz");
				
		} else if (i % 3 == 0){
			
			System.out.println("Fizz");
			
		} else if (i % 5 == 0){
			
			System.out.println("Buzz");
			
		} else {
			
			System.out.println(i);
		}
		
		
		
	}

}
}

