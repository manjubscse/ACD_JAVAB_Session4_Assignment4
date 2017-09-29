// Importing the scanner class
import java.util.Scanner;
//Declare AliquotSum sum class 
public class AliquotSum {

	// Method to find the Aliquot sum of given number
	public int GetAliquotSum(int intNumber) {
		
        //Declare variable type of integer and assigning value as 1
        int remains = 1;
        //Declare variable sum and assigning the remains value
        int sum = remains;

        /* we only need to check half of the given number 
           I mean (input / 2) :D */

        for(int i = 2; i <= intNumber / 2; i++)
        {
            if(intNumber % i == 0) sum += i;
        }
        // Display the out put
        
		return sum;
	}
	//Declaring Main Class for AliquotSum sum class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing the Scanner object to take input
		 	int result ;
		 	int i;
			Scanner read = new Scanner(System.in);

			//Display message to user to enter a number
			System.out.println("Please enter a number to find out the AliquotSum:");
			// Declare variable type integer
			int input = read.nextInt();
	        
			//Initializing the class AliquotSum to find Aliquot sum of given number
			AliquotSum aliquotSum =new AliquotSum();
			
			//Print the Result for given number ;
			System.out.print("Aliquotsum of given number is : " + aliquotSum.GetAliquotSum(input));
			System.out.println();
			// To Print the all the perfect numbers
			System.out.println("Print All the Perfect numbers between 1 to 100");
			for (i= 1 ; i<=100 ; i++) {
				// pass the each number to get the aliquot sum of i from 1 to 100
				result=aliquotSum.GetAliquotSum(i);
				// Check the if the Aliquot sum is equal to Passed then print 
				if (result==i)
				{
					System.out.println(i);
				}
			}
			
	    //close the read object
	    read.close();
	}

}
