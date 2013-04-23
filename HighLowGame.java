import javax.swing.JOptionPane;
public class HighLowGame
{
  public static void main (String[] args )
  {
  	Dice game = new Dice();
  	Dice game2 = new Dice();
  	Dice game3 = new Dice();
  	Dice game4 = new Dice(1,12);
  
  	int computerNumber;
  	
  	int userGuess;

  	String message;
  	 
  	// First Game
  	
  	computerNumber = game.GetANumberFrom1To6();
  	
  	message = String.format("The random number is %d.\n", computerNumber );
  	JOptionPane.showMessageDialog(null,  message );
  	
  	userGuess = Integer.parseInt(JOptionPane.showInputDialog("1 Dice: 1-6 Is the number high or low?  1-low  2-high"));
  		
  	game.CheckGuess(computerNumber, userGuess);
  	
  	
  	// Second Game
  	
  	computerNumber = game2.GetANumberFrom1To12();
  	
  	message = String.format("The random number is %d.\n", computerNumber );
  	JOptionPane.showMessageDialog(null,  message );
  	
  	userGuess = Integer.parseInt(JOptionPane.showInputDialog("2 Dices: 1-12 Is the number high or low?  1-low  2-high"));
  	
  	game2.CheckAnotherGuess(computerNumber, userGuess);
  	
  	
  	// Game 3 using GetARandomNumber Method with the constructor values set to 1 and 6
  	
  	computerNumber = game3.GetARandomNumber();
  	
  	message = String.format("The random number is %d.\n", computerNumber );
  	JOptionPane.showMessageDialog(null,  message );
  	
  	userGuess = Integer.parseInt(JOptionPane.showInputDialog("1 Dice: 1-6 Is the number high or low?  1-low  2-high"));
  	
  	game3.CheckGuess(computerNumber, userGuess);
  	
  	
  	
  	// Game 4 using the constructor to set the limits and GetARandomNumber Method 
  	
  	computerNumber = game4.GetARandomNumber();
  			
  	message = String.format("The random number is %d.\n", computerNumber );
  	JOptionPane.showMessageDialog(null,  message );
  			
  	userGuess = Integer.parseInt(JOptionPane.showInputDialog("2 Dices: 1-12 Is the number high or low?  1-low  2-high"));
  			
  	game4.CheckAnotherGuess(computerNumber, userGuess);
  	
  }
}
