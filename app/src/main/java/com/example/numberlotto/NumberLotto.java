package com.example.numberlotto;
import java.util.Random;

public class NumberLotto {
	private static NumberLotto ourInstance = null;

	public int getPickNumber() {
		return pickNumber;
	}

	public int getCorrectNumber() {
		return correctNumber;
	}

	Random doRandom = new Random();
	private int pickNumber;
	private int correctNumber;
	
	public static NumberLotto getInstance() {
		if (ourInstance == null) {
			ourInstance = new NumberLotto();
		}
		return ourInstance;
	}
		
	public int placeBet() {
		return correctNumber = doRandom.nextInt(10) + 1;
	}
	public boolean confirmBet(int correctNumber,int pickNumber) {
        if (correctNumber == pickNumber) {
            return true;
        } else {
            return false;
        }
    }
	
	public String confirmResult(boolean result, int correctNumber,int pickNumber) {
		String displayResult = "You selected " + pickNumber + ", " + "the correct number is " + correctNumber;
		if (result == true) {
			String resultTrue = "Yaaaay!!!   :)\n Your selection is correct, as " + correctNumber + " is equal to " + pickNumber;
			//System.out.println(resultTrue);
			return displayResult + "\n" +  resultTrue;
			} else {
			String resultFalse = "Ooooops!   :(\nYour selection is wrong as " + correctNumber + " is not equal to " + pickNumber;
				//System.out.println(resultFalse);
			return displayResult + "\n" + resultFalse;
			}
	}

}
