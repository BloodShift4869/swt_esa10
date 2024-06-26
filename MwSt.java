import java.io.Console;
import java.util.*;

public class MwSt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Von welchem Betrag wollen Sie die MwSt berechnen? > ");
		String input = s.next();
		
		// Continue, if input is okay
		if (checkInput(input)) {
			Double v = Double.parseDouble(input);
			
			System.out.print("\nWie hoch ist die MwSt? [1] 7 % [2] 19 %? > ");
			
			input = s.next();
			
			if (validRange(1, 2, input)) {
				switch (input) {
					case "1":
						v *= 1.07;
						break;	
					case "2":
						v *= 1.19;
						break;
				}
				
				FinalOutput.print(v);
			}
		}
		
		s.close();
	}

	/***
	 * Validates if user input is a number
	 * 
	 * @param i User input
	 * @return true, if user input is a number
	 */
	public static boolean checkInput(String i) {
		// Return if string is null or empty (even if it contains blanks)
		if (i.isEmpty()) return false;
		
		// If string can be parsed it is a number
		try {
			Double.parseDouble(i);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean validRange(int min, int max, String i) throws NumberFormatException {
		if (checkInput(i)) {
			int c = Integer.parseInt(i);
			
			return (min <= c && c <= max) ? true : false;
		}
		
		return false;
	}
}
