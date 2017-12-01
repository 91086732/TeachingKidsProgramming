package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;
import org.teachingkidsprogramming.section06modelviewcontroller.AdLibsRtf.Words;

public class exceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    Words word = new Words();
    String adverb = askAdverb();
    String edverb = askEdVerb();
    String bodyPart = askBodyPart();
    String currentStory = "Today ";
    currentStory = currentStory + "I woke " + adverb + ". ";
    currentStory = currentStory + "Then I " + edverb + " ";
    currentStory = currentStory + "my " + bodyPart + ". ";
    Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentStory);
  } // end of main
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Try again");
      askEdVerb();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No Numbers Plaese");
      askEdVerb();
    }
    return bodyPart;
  }
  private static String askEdVerb()
  {
    String edverb = MessageBox.askForTextInput("Enter a word ending in '-ed': ");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Try again");
      askEdVerb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No Numbers Plaese");
      askEdVerb();
    }
    return edverb;
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Try again");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No Numbers Plese");
      askAdverb();
    }
    return adverb;
  } // end of method
} // end of class
