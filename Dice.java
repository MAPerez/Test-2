
import javax.swing.JOptionPane;

public class Dice
{
  private int lowerBound;
  private int upperBound;
  
  // Constructors
  
  public Dice()
  {
  	lowerBound = 1;
  	upperBound = 6;
  }
  
  public Dice (int low, int high)
  {
  	lowerBound = low;
  	upperBound = high;
  }
  
  // Method using lowerBound and upperBound
  
  public int GetARandomNumber()
  {
  	int randomNumber;
  	randomNumber = lowerBound + (int) (Math.random() * upperBound );
  	return randomNumber;
  }
  
  
  // Methods that do not use lowerBound and upperBound
  
  public int GetANumberFrom1To6()
  {
  	return 1 + (int) (Math.random() * 6 );
  }
  
  public int GetANumberFrom1To12()
  {
  	return 1 + (int) (Math.random() * 12 );
  }
  
  // Check numbers 1-6
  
  public void CheckGuess(int computerNumber, int userNumber)
  {
  	if (userNumber == 1 && computerNumber <= 3 )
  	{
  		JOptionPane.showMessageDialog(null, "You guessed correctly!");
  	}
  	
  	else if (userNumber == 1 && computerNumber > 3)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed wrong!");
  	}
  	else if (userNumber == 2 && computerNumber <= 3)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed wrong!");
  	}
  	else if (userNumber == 2 && computerNumber > 3)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed correctly!");
  	}
  }
  
  // Check numbers 1-12
  
  public void CheckAnotherGuess(int computerNumber, int userNumber)
  {
  	if (userNumber == 1 && computerNumber <= 6 )
  	{
  		JOptionPane.showMessageDialog(null, "You guessed correctly!");
  	}
  	
  	else if (userNumber == 1 && computerNumber > 6)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed wrong!");
  	}
  	else if (userNumber == 2 && computerNumber <= 6)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed wrong!");
  	}
  	else if (userNumber == 2 && computerNumber > 6)
  	{
  		JOptionPane.showMessageDialog(null, "You guessed correctly!");
  	}
  }
}
