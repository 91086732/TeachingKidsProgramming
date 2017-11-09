package org.teachingkidsprogramming.section00demos;

import java.util.Random;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

@SuppressWarnings("unused")
public class QuickShape
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setX(150);
    //  Tip: Use the Tortoise object to draw shapes!
    Tortoise.drawShape(4, Reds.Red, 50, 2);
    //
    Tortoise.setX(425);
    Tortoise.drawShape(5, Blues.Blue, 65, 40);
    //
    Tortoise.setX(250);
    Tortoise.setY(375);
    Random r = new Random();
    int sides = r.nextInt(10) + 1;
    Tortoise.drawShape(8, Purples.Purple, 50, 10);
    //
  }
  //    See "your" work at http://virtualproctor.tkpjava.org
}
