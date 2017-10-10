package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow2
{
  public static void main(String[] args)
  {
    int i;
    int answer = (int) (Math.random() * 100 + 1);
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    System.out.println("The answer is " + answer);
    //int answer = 11;*/
    for (i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High.");
      }
      else
      {
        MessageBox.showMessage("Too Low.");
      }
      if (i == 8)
      {
        MessageBox.showMessage("You Lost!!!");
      }
    }
  }
}
