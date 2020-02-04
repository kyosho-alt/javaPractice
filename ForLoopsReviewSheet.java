
public class ForLoopsReviewSheet {

	public static void main(String[] args) {
		/*			Loop Review Sheet (For Loops)
		
		The for loop gives a short way of creating a loops structure. Within the 
		for statement you have initialization, condition and increment (++)/decrement 
		(--) all in the same line. 
		
	
		Usage :
		When you know exactly how many times that you want to run a block of code you 
		would use a for loop 
		
		Anatomy :
		Keyword - Conditions to evaluate     					Block of Code to Execute
		
		for 	(initialization; condition; ++/-- )			{all code in block is repeated as long as 
															condition is true}
															
		Syntax : 
		for ( initialization; condition; increment/decrement) {
						statement 
		}
		
		Example : 
		for (int i = 10; i > 0; i--){
		System.out.print("The value of i is : " + i);
		}
		
		Output : 
		The Value of i is : 10 
		The Value of i is : 9 
		The Value of i is : 8 
		The Value of i is : 7 
		The Value of i is : 6  
		The Value of i is : 5 
		The Value of i is : 4 
		The Value of i is : 3 etc. 
		 
		 */
		
//		for (int i=10; i>0 ; i--) {
//			if(i == 10) {
//			System.out.println("The value of \"i\" in the beggining is : " + i);
//			}else if(i<10 && i>1) {
//			System.out.println("and then the value of \"i\" is : " + i);
//			}else{
//			System.out.println("and finally the value of \"i\" is : " + i);
//			}
//			
//		}
		
		for(int i = 1; i <= 1000; i+=1) {
			System.out.println(i);
		}
	}
	
}
