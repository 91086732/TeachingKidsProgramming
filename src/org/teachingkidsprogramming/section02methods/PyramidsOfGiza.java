package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGiza
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    triangleOne();
    triangleTwo();
    triangleThree();
  }
  private static void triangleThree()
  {
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void triangleTwo()
  {
    Tortoise.turn(-90);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
    Tortoise.move(100);
  }
  private static void triangleOne()
  {
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
