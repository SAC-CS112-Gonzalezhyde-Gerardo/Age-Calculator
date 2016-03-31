import java.util.Calendar;
import javax.swing.JOptionPane;


public class AgeCalculator{ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String message;
	int cal;
	int oldEnough;
	int year;
	int age;
	boolean again = true;
			while(again)
			{
	
	String name
	= JOptionPane.showInputDialog("Please type in your name");
	String birthYear
	=JOptionPane.showInputDialog("Please type in your birth year");
	year =Integer.parseInt(birthYear);
	cal = Calendar.getInstance().get(Calendar.YEAR);
	age = cal - year;
	
	
	
	message=String.format("Hello, %s , You're %d year-old today!", name, age, birthYear);
	JOptionPane.showMessageDialog(null,message);
	
	if(age >= 21)
		message=String.format("Your are lawfully allowed to drink");
		JOptionPane.showMessageDialog(null,message);
		
		
		if(age < 21){
			oldEnough = 21 - age + cal;
			message=String.format("Sorry you can't drink");
	JOptionPane.showMessageDialog(null,message);
	
	int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
	if(dialogResult == JOptionPane.NO_OPTION) again = false;
	
		}
	}
	}
}
	
	
	
	
				
	
	


	

