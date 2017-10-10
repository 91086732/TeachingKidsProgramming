package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  @Override
  public void question1()
  {
    int y = Tortoise.getY();
    if (y == 115)
    {
      Tortoise.turn(63);
    }
  }
  @Override
  public void question2()
  {
    int x = Tortoise.getX();
    int y = Tortoise.getY();
    if (x < y)
    {
      Tortoise.turn(-54);
    }
    else
    {
      Tortoise.turn(22);
    }
  }
  @Override
  public void question3()
  {
    MessageBox.showMessage("elcomeway omehay!");
  }
  @Override
  public void question4()
  {
    int y = Tortoise.getY();
    if (y > 50)
    {
      Tortoise.turn(-177);
    }
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
