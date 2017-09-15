package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class HousesSlanted
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 36;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(100);
    Tortoise.move(30);
    Tortoise.turn(80);
    Tortoise.move(height - 4);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
