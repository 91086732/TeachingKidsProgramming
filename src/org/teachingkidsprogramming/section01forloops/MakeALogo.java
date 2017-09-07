package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.logo.utils.TKPLogoUtils.TKPLogo;

public class MakeALogo
{
  public static int YValue = 300;
  public static int XValue = 100;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Blues.Aqua);
    ColorWheel.addColor(Purples.DarkMagenta);
    ColorWheel.addColor(Reds.Red);
    Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
    TKPLogo.draw_tkp_T();
    TKPLogo.drawLeftBracket();
    TKPLogo.draw_tkp_K();
    TKPLogo.drawRightBracket();
    TKPLogo.draw_outer_tkp_P();
    TKPLogo.draw_inner_tkp_P();
  }
}
