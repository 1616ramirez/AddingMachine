package cse360assignment02;

public class AddingMachine 
{
	  private int total; 
	  String str = "0";
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	    
	  }
	  
	  public int getTotal ()  // getter method to return the total 
	  {
		str = str + " = " + total;
	    return total;
	  }
	  
	  public void add (int value) //add method to add parameter to total variable
	  {
		   total = total + value;
		  str = str + " + " + value;
	  }

	  public void subtract (int value) // subtract method subtracts parameter from total variable
	  {
		  total = total - value;
		  str = str +" - " + value;
	  }

	  public String toString () //toString method returns a string
	  {
	      return str;
	  }

	  public void clear() // clear method should clear the machine
	  {
		 total = 0;
	  }
	
	
}
