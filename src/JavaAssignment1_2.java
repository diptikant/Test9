
public class JavaAssignment1_2 {


	public static void main(String[] args) 
	{
		int FirstNumber = 11;
		int SecondNumber = 13;
		
		int CarryFirst= FirstNumber;
		int CarrySecond = SecondNumber;
		
		// Iterate till there is no carry
		 while (CarrySecond != 0)
		    {
		        // carry now contains common set bits of CarryFirst and CarrySecond
		        int carry = CarryFirst & CarrySecond;  
		 
		        // Sum of bits of CarryFirst and CarrySecond where at least one of the bits is not set
		        CarryFirst = CarryFirst ^ CarrySecond; 
		 
		        // Carry is shifted by one so that adding it to CarryFirst gives the required sum
		        CarrySecond = carry << 1;
		    }

		// Now CarryFirst contains the addition value of the both numbers
		System.out.println ("\n Sum of " + FirstNumber + " and " + SecondNumber +" is " + CarryFirst );

	}

}
