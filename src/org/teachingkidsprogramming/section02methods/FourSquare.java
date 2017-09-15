package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#7
    //  Do the following 4 times --#8.1
    //      drawSquare (recipe below) --#6.1
    //      ------------- Recipe for drawSquare --#6.2
    for (int i = 0; i < 4; i++)
    {
      ColorWheel.addColor(Reds.Crimson);
      ColorWheel.addColor(Blues.Blue);
      ColorWheel.addColor(Greens.Chartreuse);
      Tortoise.move(50);
      Tortoise.turn(90);
      //      ------------- End of drawSquare recipe --#6.3
      //      Turn the tortoise 90 degrees to the right --#9
      //  End Repeat --#8.2
    }
  }
}
