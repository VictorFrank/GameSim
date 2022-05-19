package NumberGuessingGame;

import javax.swing.*;

public class GuessingGame {

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <= 0 || userAnswer > 100){
            return "Your guess is invalid";
        } else if (userAnswer == computerNumber){
            return "Your guess is correct! \n Total Amount of guesses: " + count;
        } else if (userAnswer < computerNumber){
            return "Your guess is too low! Try something higher! \n Total guesses: " + count;
        } else if (userAnswer > computerNumber){
            return "Your guess is too high! Try something lower! \n Total guesses: " + count;
        } else {
            return "Your guess is incorrect! Try again! \n Total guesses: " + count;
        }
    }

    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        //System.out.println("The correct answer would be: "+ computerNumber);
        int count = 1;

        while (userAnswer != computerNumber){
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }
}
