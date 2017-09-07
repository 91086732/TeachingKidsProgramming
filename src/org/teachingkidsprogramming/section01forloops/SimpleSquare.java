package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("David");
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 150;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Reds.Crimson);
      Tortoise.setPenWidth(i);
      int Length = i;
      Tortoise.move(Length);
      Tortoise.turn(2000 / sides);// i is a loop variable
    }
    //
  }
}